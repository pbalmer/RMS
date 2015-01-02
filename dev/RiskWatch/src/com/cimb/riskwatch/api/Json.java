package com.cimb.riskwatch.api;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringEscapeUtils;

import com.cimb.riskwatch.data.Account;
import com.cimb.riskwatch.data.Account.Note;
import com.cimb.riskwatch.data.Audit;
import com.cimb.riskwatch.data.CashTransaction;
import com.cimb.riskwatch.data.Ledger;
import com.cimb.riskwatch.data.Position;
import com.cimb.riskwatch.data.Product;
import com.cimb.riskwatch.data.Trade;
import com.cimb.riskwatch.data.User;
import com.cimb.riskwatch.db.Accounts;
import com.cimb.riskwatch.db.Rates;
import com.cimb.riskwatch.db.SystemAudit;
import com.cimb.riskwatch.db.Users;

public class Json {

	private final static String LOGIN = "{\"username\": \"%1s\", \"organisation\": \"%2s\", \"role\": \"%3s\", \"locked\": %4$b, \"passwordExpired\": %5$b, \"auth\": %6$b}";
	private final static String ACCT_SEARCH = "{ \"accountGroup\": \"%1s\", \"accountCode\": \"%2s\", \"accountName\": \"%3s\", \"accountCcy\": \"%s\", \"email\": \"%5s\", \"phone\": \"%6s\", \"totalEquity\": %7f, \"initalMargin\": %8f, \"freeEquity\": %9f, \"instrument\": \"%s\", \"positionCcy\": \"%s\", \"qty\": %f, \"value\": %f, \"org\": \"%s\" }";
	private final static String ACCT_POSITION = "{ \"accountCode\": \"%1s\", \"accountName\": \"%2s\", \"instrument\": \"%3s\", \"qty\": %4f, \"ccy\": \"%5s\", \"avgPrice\": %6f, \"value\": %7f, \"valueBase\": %8f, \"im\": %9f, \"unrealisedPL\": %10f, \"unrealisedPLBase\": %11f, \"lowFE\": %12f, \"freeEquity\": %13f, \"email\": \"%14s\", \"phone\": \"%15s\" }";
	private final static String AGG_POSITION = "{ \"instrument\": \"%1s\", \"longQty\": %2f, \"shortQty\": %3f }";
	private final static String ACCT_CASH_LEDGER = "{ \"accountCode\": \"%1s\", \"accountName\": \"%2s\", \"ccy\": \"%3s\", \"cash\": %4f, \"totalEquity\": %5f, \"unrealisedPL\": %6f, \"initialMargin\": %7f, \"freeEquity\": %8f, \"exchRate\": %9f, \"cashBase\": %10f, \"totalEquityBase\": %11f, \"unrealisedPLBase\": %12f, \"initialMarginBase\": %13f, \"freeEquityBase\": %14f }";
	private final static String ACCT_CASH_TRANSACTION = "{ \"accountCode\": \"%1s\", \"accountName\": \"%2s\", \"ccy\": \"%3s\", \"qty\": %4f, \"type\": \"%5s\", \"description\": \"%6s\", \"timestamp\": \"%7$tFT%7$tT.%tLZ\" }";
	private final static String ACCT_TRADE = "{ \"accountCode\": \"%1s\", \"accountName\": \"%2s\", \"instrument\": \"%3s\", \"qty\": %4f, \"price\": %5f, \"timestamp\": \"%6$tFT%6$tT.%tLZ\" }";
	private final static String ACCT_NOTE = "{ \"accountCode\": \"%1s\", \"dealer\": \"%2s\", \"accountNote\": \"%3s\", \"timestamp\": \"%4$tFT%4$tT.%tLZ\" }";
	
	private final static String MARGIN_REPORT = "{ \"accountGroup\": \"%1s\", \"accountCode\": \"%2s\", \"accountName\": \"%3s\", \"ccy\": \"%s\", \"totalEquity\": %5f, \"initialMargin\": %6f, \"freeEquity\": %7f, \"value\": %8f, \"marginCall\": %9f, \"lowFE\": %10f, \"lastEmail\": \"%11$tFT%11$tT.%tLZ\", \"lastSMS\": \"%12$tFT%12$tT.%tLZ\", \"lastNote\": \"%s\" }";
	private final static String AUDIT_SEARCH = "{ \"username\": \"%s\", \"systemObject\": \"%s\", \"eventType\": \"%s\", \"comment\": \"%s\", \"timestamp\": \"%5$tFT%5$tT.%tLZ\" }";

	private final static String USER_SEARCH = "{ \"userID\": \"%d\", \"username\": \"%s\", \"email\": \"%s\", \"org\": \"%s\", \"role\": \"%s\", \"locked\": %b, \"comment\": \"%s\", \"expires\": \"%8$tFT%8$tT.%tLZ\" }";

	public final static String SESSION_YES = "{ \"session\": true }";
	public final static String SESSION_NO = "{ \"session\": false }";
	
	public final static String SUCCESS_YES = "{ \"success\": true }";
	public final static String SUCCESS_NO = "{ \"success\": false }";
	
	public final static long defaultDate = Date.parse("1-Jan-1990");

	public static String login(HttpSession session, String username, String password, String organisation) {
		User user = Users.getUser(organisation, username, password);
		
		session.setAttribute("userID", user.getUserID());
		session.setAttribute("username", user.getUsername());
		session.setAttribute("password", user.getPassword());
		session.setAttribute("auth", user.isAuth());
		session.setAttribute("role", user.getRole());
		session.setAttribute("locked", user.isLocked());
		session.setAttribute("organisation", user.getOrganisation());
		session.setAttribute("passwordExpiry", user.isPasswordExpired());
		session.setAttribute("restrictOrg", user.isRestrictOrg());
		session.setAttribute("restrictAcctGrp", user.getRestrictAcctGrp());
		
		SystemAudit.log(user.getUserID(), "", "Login", "User: " + user.getUsername() + 
				", auth: " + user.isAuth() + ", locked: " + user.isLocked() + 
				", expired: " + user.isPasswordExpired());
		
		String retVal = String.format(LOGIN, user.getUsername(), user.getOrganisation(), 
				user.getRole(), user.isLocked(), user.isPasswordExpired(), user.isAuth());
		
		return retVal;
	}
	
	public static String accountDetails(HttpSession session, String accountCode) {
		String retVal = null;
		if (session == null) {
			retVal = SESSION_NO;
		}
		else {
			Account acct = Accounts.getAccount(accountCode);
			retVal = "{ \"account\": [ ";
			retVal += String.format(ACCT_SEARCH, acct.getAcctGrp(), acct.getAcctCode(), acct.getAcctName(), 
					acct.getCcy(), acct.getEmail(), acct.getPhone(), acct.getTotalEquity(), acct.getMargin(), 
					acct.getFreeEquity(), "", "", 0.0, 0.0, acct.getOrganisation());
			retVal += "] }";
		}
		
		return retVal;
	}
	
	public static String accountNotes(HttpSession session, String accountCode) {
		String retVal = null;
		if (session == null) {
			retVal = SESSION_NO;
		}
		else {
			Account acct = Accounts.getAccount(accountCode);
			Accounts.loadNotes(acct);
			
			retVal = "";
			int numVals = 0;
			boolean first = true;
			for (Note note : acct.getNotes()) {
				
				if (!first) retVal += ",";
				first = false;
				
				// Only look at the accounts that have a position in this product.
				retVal += String.format(ACCT_NOTE, acct.getAcctCode(), note.username, 
						StringEscapeUtils.escapeJson(note.note), note.noteTime);
				numVals++;
			}
			
			retVal += "] }";
			
			retVal = "{ \"currentPage\" : 1, \"totalRows\" : " + numVals + ", \"filter\" : { }, \"perPage\" : " + numVals + ", \"posted\" : [], \"sort\" : [], \"data\": [ " + retVal;
		}
		
		return retVal;
	}
	
	public static String positionConcentration(HttpSession session, double concentrationLevel, double minValue) {
		String retVal = null;
		int numVals = 0;
		if (session == null) {
			retVal = SESSION_NO;
		}
		else {
			Map<Product, Double> book = Accounts.getBookPositions();
			
			List<Account> accounts = Accounts.getActiveAccounts();
			
			retVal = "";
			boolean first = true;
			for (Account acct : accounts) {
				
				for (Position pos : acct.getPositions().values()) {
					Double bookPos = book.get(pos.getProduct());
					double bookProportion = 0;
					if (bookPos != null) 
						bookProportion = pos.getQty() * 100 / bookPos.doubleValue();
					
					// See if this position matches the search criteria
					double baseValue = Rates.convert(pos.getCurrentValue(), pos.getCcy(), Rates.intermediateCcy);
					baseValue = Math.abs(baseValue);
					if (baseValue >= minValue && bookProportion >= concentrationLevel) {
						if (!first) retVal += ",";
						first = false;
						
						// Only look at the accounts that have a position in this product.
						retVal += String.format(ACCT_POSITION, acct.getAcctCode(), acct.getAcctName(), 
								pos.getProduct().getContract(), pos.getQty(), pos.getCcy(), pos.getPositionPrice(), 
								pos.getTradedValue(), Rates.convert(pos.getTradedValue(), pos.getCcy(), Rates.intermediateCcy), 
								pos.getMarginQty(), pos.getUnrealisedPL(), 
								Rates.convert(pos.getUnrealisedPL(), pos.getCcy(), Rates.intermediateCcy),
								acct.getEquityRatio(), acct.getFreeEquity(),
								acct.getEmail(), acct.getPhone());
						numVals++;
					}
				}
			}
			
			retVal += "] }";
			
			retVal = "{ \"currentPage\" : 1, \"totalRows\" : " + numVals + ", \"filter\" : { }, \"perPage\" : " + numVals + ", \"posted\" : [], \"sort\" : [], \"data\": [ " + retVal;
		}
		return retVal;
	}

	public static String productPositions(HttpSession session, String productCode) {
		String retVal = null;
		int numVals = 0;
		if (session == null) {
			retVal = SESSION_NO;
		}
		else {
			String[] prodTokens = productCode.split("\\.");
			Product prod = new Product(prodTokens[1], prodTokens[0]);
			List<Account> accounts = Accounts.getActiveAccounts();
			
			retVal = "";
			
			boolean first = true;
			for (Account acct : accounts) {
				Position pos = acct.getPosition(prod);
				
				if (pos != null) {
					if (!first) retVal += ",";
					first = false;
					
					// Only look at the accounts that have a position in this product.
					retVal += String.format(ACCT_POSITION, acct.getAcctCode(), acct.getAcctName(), 
							pos.getProduct().getContract(), pos.getQty(), pos.getCcy(), pos.getPositionPrice(), 
							pos.getTradedValue(), Rates.convert(pos.getTradedValue(), pos.getCcy(), acct.getCcy()), 
							pos.getMarginQty(), pos.getUnrealisedPL(), 
							Rates.convert(pos.getUnrealisedPL(), pos.getCcy(), acct.getCcy()),
							acct.getEquityRatio(), acct.getFreeEquity(),
							acct.getEmail(), acct.getPhone());
					numVals++;
				}
			}
			
			retVal += "] }";
			
			retVal = "{ \"currentPage\" : 1, \"totalRows\" : " + numVals + ", \"filter\" : { }, \"perPage\" : " + numVals + ", \"posted\" : [], \"sort\" : [], \"data\": [ " + retVal;
		}
		return retVal;
	}

	public static String productAggPositions(HttpSession session, String productCode) {
		String retVal = null;
		double longPos = 0;
		double shortPos = 0;
		if (session == null) {
			retVal = SESSION_NO;
		}
		else {
			String[] prodTokens = productCode.split("\\.");
			Product prod = new Product(prodTokens[1], prodTokens[0]);
			List<Account> accounts = Accounts.getActiveAccounts();
			
			retVal = "";
			
			for (Account acct : accounts) {
				Position pos = acct.getPosition(prod);
				if (pos != null) {
					if (pos.getQty() > 0)
						longPos += pos.getQty();
					else
						shortPos += pos.getQty();
				}
			}
			retVal = "{ \"longShortPosition\": [ ";
			retVal += String.format(AGG_POSITION, productCode, longPos, shortPos);
			retVal += "] }";
		}
		
		return retVal;
	}
	
	public static String accountPositions(HttpSession session, String accountCode) {
		String retVal = null;
		if (session == null) {
			retVal = SESSION_NO;
		}
		else {
			Account acct = Accounts.getAccount(accountCode);
			Map<Product, Position> positions = acct.getPositions();
			
			retVal = "{ \"currentPage\" : 1, \"totalRows\" : " + positions.size() + ", \"filter\" : { }, \"perPage\" : " + positions.size() + ", \"posted\" : [], \"sort\" : [], \"data\": [ ";
			
			boolean first = true;
			for (Position pos : positions.values()) {
				if (!first) retVal += ",";
				first = false;
				
				retVal += String.format(ACCT_POSITION, acct.getAcctCode(), acct.getAcctName(), 
						pos.getProduct().getContract(), pos.getQty(), pos.getCcy(), pos.getPositionPrice(), 
						pos.getTradedValue(), Rates.convert(pos.getTradedValue(), pos.getCcy(), acct.getCcy()), 
						pos.getMarginQty(), pos.getUnrealisedPL(), 
						Rates.convert(pos.getUnrealisedPL(), pos.getCcy(), acct.getCcy()),
						acct.getEquityRatio(), acct.getFreeEquity(),
						acct.getEmail(), acct.getPhone());
			}
			
			retVal += "] }";
		}
		
		return retVal;
	}

	public static String accountCashLedger(HttpSession session, String accountCode) {
		String retVal = null;
		if (session == null) {
			retVal = SESSION_NO;
		}
		else {
			Account acct = Accounts.getAccount(accountCode);
			Map<String, Ledger> cash = acct.getCash();
			
			retVal = "{ \"currentPage\" : 1, \"totalRows\" : " + cash.size() + ", \"filter\" : { }, \"perPage\" : " + cash.size() + ", \"posted\" : [], \"sort\" : [ [ \"ccy\", \"desc\" ] ], \"data\": [ ";
			
			boolean first = true;
			for (Map.Entry<String, Ledger> entry : cash.entrySet()) {
				String ccy = entry.getKey();
				Ledger ledger = entry.getValue();
				
				if (!first) retVal += ",";
				first = false;
				
				retVal += String.format(ACCT_CASH_LEDGER, acct.getAcctCode(), acct.getAcctName(), 
						ccy, ledger.getCash(), ledger.getTotalEquity(), 
						ledger.getUnrealisedPL(), ledger.getMargin(), ledger.getFreeEquity(), 
						Rates.convert(1, ccy, acct.getCcy()), 
						Rates.convert(ledger.getCash(), ccy, acct.getCcy()),
						Rates.convert(ledger.getTotalEquity(), ccy, acct.getCcy()),
						Rates.convert(ledger.getUnrealisedPL(), ccy, acct.getCcy()),
						Rates.convert(ledger.getMargin(), ccy, acct.getCcy()),
						Rates.convert(ledger.getFreeEquity(), ccy, acct.getCcy()));
			}
			
			retVal += "] }";
		}
		
		return retVal;
	}
	
	public static String marginCallReport(HttpSession session, int maxRecords) {
		String retVal = "";
		if (session == null) {
			retVal = SESSION_NO;
		}
		else {
			List<Account> activeAccts = Accounts.getActiveAccounts();
			
			boolean first = true;
			int callAccts = 0;
			for (Account acct : activeAccts) {
				
				// Make sure we only get accounts which are on margin call.
				if (acct.getFreeEquity() < 0) {
					if (!first) retVal += ",";
					first = false;
					callAccts++;
					
					retVal += String.format(MARGIN_REPORT, acct.getAcctGrp(), acct.getAcctCode(), acct.getAcctName(),
							acct.getCcy(), acct.getTotalEquity(), acct.getMargin(), acct.getFreeEquity(), 
							acct.getGrossExposure(), acct.getEquityRatio(), 0.0, defaultDate, defaultDate, "n/a");
				}
			}

			retVal = "{ \"currentPage\" : 1, \"totalRows\" : " + callAccts + ", \"filter\" : { }, \"perPage\" : " + callAccts + ", \"posted\" : [], \"sort\" : [ [ \"timestamp\", \"desc\" ] ], \"data\": [ " + retVal;
			retVal += "] }";
		}
		return retVal;
	}

	public static String auditSearch(HttpSession session, String username, String obj, String eventType) {
		String retVal = null;
		if (session == null) {
			retVal = SESSION_NO;
		}
		else {
			retVal = "";
			List<Audit> audits = SystemAudit.search(username, obj, eventType);
			
			boolean first = true;
			int auditNum = 0;
			for (Audit audit : audits) {
				if (!first) retVal += ",";
				first = false;
				auditNum++;
				
				retVal += String.format(AUDIT_SEARCH, audit.getUsername(), audit.getSystemObject(), 
						audit.getEventType(), StringEscapeUtils.escapeJson(audit.getComment()), 
						audit.getAuditTime());
			}
			
			retVal = "{ \"currentPage\" : 1, \"totalRows\" : " + auditNum + ", \"filter\" : { }, \"perPage\" : " + auditNum + ", \"posted\" : [], \"sort\" : [ [ \"timestamp\", \"desc\" ] ], \"data\": [ " + retVal;
			retVal += "] }";
		}
		return retVal;
	}

	public static String userSearch(HttpSession session, String username, int maxRecords) {
		String retVal = null;
		if (session == null) {
			retVal = SESSION_NO;
		}
		else {
			List<User> users = Users.getAllUsers();
			
			retVal = "{ \"currentPage\" : 1, \"totalRows\" : " + users.size() + ", \"filter\" : { }, \"perPage\" : " + users.size() + ", \"posted\" : [], \"sort\" : [ [ \"timestamp\", \"desc\" ] ], \"data\": [ ";
			
			boolean first = true;
			for (User user : users) {
				if (!first) retVal += ",";
				first = false;
				
				retVal += String.format(USER_SEARCH, user.getUserID(), user.getUsername(), user.getEmail(), user.getOrganisation(), user.getRole(), user.isLocked(), StringEscapeUtils.escapeJson(user.getComment()), user.getExpires());
			}
			
			retVal += "] }";
		}
		return retVal;
	}
	
	public static String accountCashTransactions(HttpSession session, String acctCode, int currentPage, int perPage) {
		String retVal = null;
		if (session == null) {
			retVal = SESSION_NO;
		}
		else {
			Account acct = Accounts.getAccount(acctCode);
			Accounts.loadCashTransactions(acct);
			List<CashTransaction> transactions = acct.getCashTransactions();
			
			retVal = "";
			boolean first = true;
			for (CashTransaction txn : transactions) {
				if (!first) retVal += ",";
				retVal += String.format(ACCT_CASH_TRANSACTION, acct.getAcctCode(), acct.getAcctName(), 
						txn.getCcy(), txn.getQty(), txn.getTransType(), StringEscapeUtils.escapeJson(txn.getComment()), 
						txn.getTransTime());
				first = false;
			}
			// Add the header last - we know what the number of rows are by this stage...
			retVal = "{ \"currentPage\" : " + currentPage + ", \"totalRows\" : " + transactions.size() + ", \"filter\" : { }, \"perPage\" : " + perPage + ", \"posted\" : [], \"sort\" : [ [ \"timestamp\", \"desc\" ] ], \"data\": [ " + retVal;
			
			retVal += "] }";
		}
		
		return retVal;
	}
	
	public static String accountTrades(HttpSession session, String acctCode, int currentPage, int perPage) {
		String retVal = null;
		if (session == null) {
			retVal = SESSION_NO;
		}
		else {
			Account acct = Accounts.getAccount(acctCode);
			Accounts.loadTrades(acct);
			List<Trade> transactions = acct.getTrades();
			
			retVal = "";
			boolean first = true;
			for (Trade txn : transactions) {
				if (!first) retVal += ",";
				retVal += String.format(ACCT_TRADE, acct.getAcctCode(), acct.getAcctName(), 
						txn.getProd().getContract(), txn.getQty(), txn.getPrice(), 
						txn.getTradeTime());
				first = false;
			}
			// Add the header last - we know what the number of rows are by this stage...
			retVal = "{ \"currentPage\" : " + currentPage + ", \"totalRows\" : " + transactions.size() + ", \"filter\" : { }, \"perPage\" : " + perPage + ", \"posted\" : [], \"sort\" : [ [ \"timestamp\", \"desc\" ] ], \"data\": [ " + retVal;
			
			retVal += "] }";
		}
		
		return retVal;
	}
}
