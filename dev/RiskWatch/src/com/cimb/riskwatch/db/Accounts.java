package com.cimb.riskwatch.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cimb.riskwatch.data.Account;
import com.cimb.riskwatch.data.CashTransaction;
import com.cimb.riskwatch.data.Position;
import com.cimb.riskwatch.data.Product;
import com.cimb.riskwatch.data.Trade;

public class Accounts {

	protected static Map<String, Account> accounts;
	
	// Default the timeout to 1 minute
	public static long TIMEOUT = 60000;
	
	static {
		 accounts = new TreeMap<String, Account>();
	}

	public synchronized static Account getAccount(String acctCode) {
		Account acct = accounts.get(acctCode);
		long now = Calendar.getInstance().getTimeInMillis();
		
		if (acct == null || acct.getCreated() + TIMEOUT < now) {
			acct = loadAccount(acctCode);
			acct.setCreated(now);
		}
		//System.out.println("Account cache: " + acctCode + ", now: " + now + ", created: " + acct.getCreated() + ", timeout: " + TIMEOUT);
		
		return acct;
	}
	
	public synchronized static List<Account> getActiveAccounts() {
		loadActiveAccounts();
		
		List<Account> activeAccounts = new ArrayList<Account>();
		for (Account acct : accounts.values()) {
			if (acct.getPositions().size() > 0) {
				activeAccounts.add(acct);
			}
		}
		
		Collections.sort(activeAccounts, new Account.MarginComparator());
		
		return activeAccounts;
	}
	
	protected static Account loadAccount(String acctCode) {
		Account acct = null;
		PreparedStatement stmnt = null;
		try {
			String sql = "SELECT AcctGrp, AcctID, AcctName, AcctCcy, Organisation, Email, Mobile from Acct where AcctID = ?";
			System.out.println("Creating statement...");
			System.out.println(sql);
			Connection conn = DB.getConnection();
			stmnt = conn.prepareStatement(sql);
			stmnt.setString(1, acctCode);
			ResultSet rs = stmnt.executeQuery();
			
			String acctGrp, acctName, acctCcy, org, email, mobile;
			if (rs.next()) {
				acctGrp = rs.getString("AcctGrp");
				acctCode = rs.getString("AcctID");
				acctName = rs.getString("AcctName");
				acctCcy = rs.getString("AcctCcy");
				org = rs.getString("Organisation");
				email = rs.getString("Email");
				mobile = rs.getString("Mobile");
				
				acct = new Account(acctCode, acctName, acctGrp, acctCcy, org, email, mobile);
				
				accounts.put(acctCode, acct);
			}
		} catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			//Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			//finally block used to close resources
			try {
				if (stmnt != null)
					stmnt.close();
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
		
		loadCash(acct);
		loadPositions(acct);
		
		return acct;
	}
	
	protected static void loadCash(Account acct) {
		PreparedStatement stmnt = null;
		try {
			String sql = "SELECT Ccy, Qty from CashLedger where AcctID = ?";
			System.out.println("Creating statement...");
			System.out.println(sql);
			Connection conn = DB.getConnection();
			stmnt = conn.prepareStatement(sql);
			stmnt.setString(1, acct.getAcctCode());
			ResultSet rs = stmnt.executeQuery();
			
			String ccy;
			double qty;
			while (rs.next()) {
				ccy = rs.getString("Ccy");
				qty = rs.getDouble("Qty");
				
				acct.addCash(ccy, qty);
			}
		} catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			//Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			//finally block used to close resources
			try {
				if (stmnt != null)
					stmnt.close();
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
	}
	
	protected static void loadPositions(Account acct) {
		PreparedStatement stmnt = null;
		try {
			String sql = "select P.ExchangeCode, P.ContractCode, Qty, P.Value, MarginRate, Pr.Ccy " +
					"from Positions P " +
					"inner join Margin M on P.ExchangeCode = M.ExchangeCode and P.ContractCode = M.ContractCode " +
					"inner join Products Pr on M.ExchangeCode = Pr.ExchangeCode and M.ContractCode = Pr.ContractCode " +
					"where AcctID = ?";
			System.out.println("Creating statement...");
			System.out.println(sql);
			Connection conn = DB.getConnection();
			stmnt = conn.prepareStatement(sql);
			stmnt.setString(1, acct.getAcctCode());
			ResultSet rs = stmnt.executeQuery();
			
			String exchange, contract, ccy;
			double qty, value, marginRate;
			while (rs.next()) {
				exchange = rs.getString("ExchangeCode");
				contract = rs.getString("ContractCode");
				qty = rs.getDouble("Qty");
				value = rs.getDouble("Value");
				marginRate = rs.getDouble("MarginRate");
				ccy = rs.getString("Ccy");
				
				Product prod = new Product(exchange, contract);
				Position pos = new Position(prod, qty, value, marginRate, ccy);
				acct.addPosition(prod, pos);
			}
		} catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			//Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			//finally block used to close resources
			try {
				if (stmnt != null)
					stmnt.close();
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
	}
	
	public static void loadTrades(Account acct) {
		// Check if the trades have already been loaded.
		if (acct.getTrades() != null) return;
		
		PreparedStatement stmnt = null;
		try {
			// Get the last three months of transactions for this account.
			String sql = "select AcctID, TradeID, TradeTime, ContractCode, ExchangeCode, Qty, Price " +
					"from Trades " +
					"where AcctID = ? and TradeTime > current_date - 90 " +
					"order by 3 desc";
			System.out.println("Creating query statement...");
			System.out.println(sql);
			Connection conn = DB.getConnection();
			stmnt = conn.prepareStatement(sql);
			stmnt.setString(1, acct.getAcctCode());
			ResultSet rs = stmnt.executeQuery();
			
			int tradeID;
			Date tradeTime;
			Product prod;
			double qty, price;
			String contract, exchange;
			while (rs.next()) {
				tradeID = rs.getInt("TradeID");
				tradeTime = rs.getTimestamp("TradeTime");
				exchange = rs.getString("ExchangeCode");
				contract = rs.getString("ContractCode");
				prod = new Product(exchange, contract);
				qty = rs.getDouble("Qty");
				price = rs.getDouble("Price");
				
				Trade trade = new Trade(tradeID, tradeTime, prod, qty, price);
				acct.addTrade(trade);
			}
		} catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			//Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			//finally block used to close resources
			try {
				if (stmnt != null)
					stmnt.close();
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
	}
	
	public static void loadCashTransactions(Account acct) {
		PreparedStatement stmnt = null;
		try {
			// Get the last three months of transactions for this account.
			String sql = "select AcctID, Ccy, CashTime, TransType, CashTrans.Comment, Qty " +
					"from CashTrans " +
					"where AcctID = ? and CashTime > current_date - 90 " +
					"order by 3 desc";
			System.out.println("Creating query statement...");
			System.out.println(sql);
			stmnt = DB.getConnection().prepareStatement(sql);
			stmnt.setString(1, acct.getAcctCode());
			ResultSet rs = stmnt.executeQuery();
			
			String ccy, transType, comment;
			Date transTime;
			double qty;
			CashTransaction cash;
			while (rs.next()) {
				ccy = rs.getString("Ccy");
				transType = rs.getString("TransType");
				comment = rs.getString("Comment");
				transTime = rs.getTimestamp("CashTime");
				qty = rs.getDouble("Qty");
				cash = new CashTransaction(ccy, transType, comment, transTime, qty);
				
				acct.addCashTransaction(cash);
			}
		} catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			//Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			//finally block used to close resources
			try {
				if (stmnt != null)
					stmnt.close();
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
	}
	
	public static void loadNotes(Account acct) {
		// Check if the notes have already been loaded.
		if (acct.getNotes() != null) return;
		
		PreparedStatement stmnt = null;
		try {
			String sql = "select AcctID, Username, Note, NoteTime " +
					"from AcctNotes " +
					"inner join Users on AcctNotes.UserID = Users.UserID " +
					"where AcctID = ? " +
					"order by 4 desc";
			System.out.println("Creating query statement...");
			System.out.println(sql);
			Connection conn = DB.getConnection();
			stmnt = conn.prepareStatement(sql);
			stmnt.setString(1, acct.getAcctCode());
			ResultSet rs = stmnt.executeQuery();
			
			while (rs.next()) {
				Account.Note note = new Account.Note();
				note.username = rs.getString("Username");
				note.note = rs.getString("Note");
				note.noteTime = rs.getTimestamp("NoteTime");
				
				acct.addNote(note);
			}
		} catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			//Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			//finally block used to close resources
			try {
				if (stmnt != null)
					stmnt.close();
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
	}
	
	public static void addNote(int userID, Account acct, String note) {
		PreparedStatement stmnt = null;
		try {
			String sql = "insert into AcctNotes (AcctID, UserID, Note) values (?, ?, ?)";
			System.out.println("Creating query statement...");
			System.out.println(sql);
			Connection conn = DB.getConnection();
			stmnt = conn.prepareStatement(sql);
			stmnt.setString(1, acct.getAcctCode());
			stmnt.setInt(2, userID);
			stmnt.setString(3, note);
			stmnt.executeUpdate();
			
			// Make sure the notes are not cached any more...
			acct.clearNotes();
		} catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			//Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			//finally block used to close resources
			try {
				if (stmnt != null)
					stmnt.close();
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
	}
	
	public static void loadActiveAccounts() {
		PreparedStatement stmnt = null;
		List<String> activeAccts = new ArrayList<String>();
		try {
			String sql = "select AcctID, count(*) Num from Positions group by AcctID order by Num desc";
			System.out.println("Creating statement...");
			System.out.println(sql);
			Connection conn = DB.getConnection();
			stmnt = conn.prepareStatement(sql);
			ResultSet rs = stmnt.executeQuery();
			
			while (rs.next()) {
				activeAccts.add(rs.getString("AcctID"));
			}
		} catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			//Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			//finally block used to close resources
			try {
				if (stmnt != null)
					stmnt.close();
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
		
		for (String acctID : activeAccts) {
			getAccount(acctID);
		}
	}
	
	public static Map<Product, Double> getBookPositions() {
		PreparedStatement stmnt = null;
		Map<Product, Double> book = new TreeMap<Product, Double>();
		try {
			String sql = "select ContractCode, ExchangeCode, sum(abs(Qty)) Qty from Positions group by ContractCode, ExchangeCode";
			System.out.println("Creating statement...");
			System.out.println(sql);
			Connection conn = DB.getConnection();
			stmnt = conn.prepareStatement(sql);
			ResultSet rs = stmnt.executeQuery();
			
			while (rs.next()) {
				Product prod = new Product(rs.getString("ExchangeCode"), rs.getString("ContractCode"));
				book.put(prod, new Double(rs.getDouble("Qty")));
			}
		} catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			//Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			//finally block used to close resources
			try {
				if (stmnt != null)
					stmnt.close();
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
		
		return book;
	}
}
