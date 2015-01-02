package com.cimb.riskwatch.data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;

import com.cimb.riskwatch.db.Rates;

public class Account {

	protected String acctCode;
	protected String acctName;
	protected String acctGrp;
	protected String ccy;
	protected String organisation;
	protected String email;
	protected String phone;
	protected List<Note> notes = null;
	protected List<Trade> trades = null;
	protected List<CashTransaction> cashTxns = null;
	
	protected long created = 0;
	
	protected Map<String, Ledger> cash = new TreeMap<String, Ledger>();
	protected Map<Product, Position> positions = new TreeMap<Product, Position>();
	
	public Account(String acctCode, String acctName, String acctGrp, String ccy, String org, String email, String phone) {
		this.acctCode = acctCode;
		this.acctName = acctName;
		this.acctGrp = acctGrp;
		this.ccy = ccy;
		this.organisation = org;
		this.email = email;
		this.phone = phone;
	}
	
	public void addCash(String ccy, double qty) {
		Ledger l = new Ledger(qty, 0, 0, 0);
		cash.put(ccy, l);
	}
	
	public void addPosition(Product prod, Position pos) {
		positions.put(prod, pos);
		
		Ledger posLedger = new Ledger(0, pos.getUnrealisedPL(), pos.getMarginQty(), pos.getCurrentValue());
		Ledger cashLedger = cash.get(pos.getCcy());
		if (cashLedger == null) {
			// This currency doesn't exist yet, so add it with this position's details
			cash.put(pos.getCcy(), posLedger);
		}
		else {
			// This is an existing currency.  Add the positions details to it.
			cashLedger.add(posLedger);
		}
	}
	
	public Position getPosition(Product prod) {
		return positions.get(prod);
	}
	
	public double getTotalCash() {
		double equity = 0;
		for (Map.Entry<String, Ledger> entry : cash.entrySet()) {
			String ccy = entry.getKey();
			Ledger cash = entry.getValue();
			
			double baseCash = Rates.convert(cash.getCash(), ccy, getCcy());
			
			equity += baseCash;
		}
		return equity;
	}
	
	public double getPL() {
		double pl = 0;
		for (Map.Entry<String, Ledger> entry : cash.entrySet()) {
			String ccy = entry.getKey();
			Ledger cash = entry.getValue();
			
			double basePl = Rates.convert(cash.getUnrealisedPL(), ccy, getCcy());
			
			pl += basePl;
		}
		return pl;
	}
	
	public double getTotalEquity() {
		return getTotalCash() + getPL();
	}
	
	public double getMargin() {
		double margin = 0;
		for (Map.Entry<String, Ledger> entry : cash.entrySet()) {
			String ccy = entry.getKey();
			Ledger cash = entry.getValue();
			
			double baseMargin = Rates.convert(cash.getMargin(), ccy, getCcy());
			
			margin += baseMargin;
		}
		return margin;
	}
	
	public double getFreeEquity() {
		return getTotalEquity() + getMargin();
	}
	
	public double getGrossExposure() {
		double exposure = 0;
		for (Map.Entry<String, Ledger> entry : cash.entrySet()) {
			String ccy = entry.getKey();
			Ledger cash = entry.getValue();
			
			double baseExposure = Rates.convert(cash.getGrossExposure(), ccy, getCcy());
			
			exposure += baseExposure;
		}
		return exposure;
	}
	
	public Map<String, Ledger> getCash() {
		return cash;
	}
	public Map<Product, Position> getPositions() {
		return positions;
	}
	public String getAcctCode() {
		return acctCode;
	}
	public String getAcctName() {
		return acctName;
	}
	public String getAcctGrp() {
		return acctGrp;
	}
	public String getCcy() {
		return ccy;
	}
	public String getOrganisation() {
		return organisation;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	
	public double getEquityRatio() {
		if (getTotalEquity() == 0) return 0;
		return (getFreeEquity() / getTotalEquity()) * 100;
	}
	
	public long getCreated() {
		return created;
	}

	public void setCreated(long created) {
		this.created = created;
	}
	
	public void addCashTransaction(CashTransaction cash) {
		if (cashTxns == null) cashTxns = new ArrayList<CashTransaction>();
		cashTxns.add(cash);
	}
	
	public List<CashTransaction> getCashTransactions() {
		if (cashTxns == null) return new ArrayList<CashTransaction>();
		else return cashTxns;
	}
	
	public void addTrade(Trade trade) {
		if (trades == null) trades = new ArrayList<Trade>();
		trades.add(trade);
	}
	
	public List<Trade> getTrades() {
		if (trades == null) return new ArrayList<Trade>();
		else return trades;
	}
	
	public void addNote(Note note) {
		if (notes == null) notes = new ArrayList<Note>();
		notes.add(note);
	}
	
	public List<Note> getNotes() {
		return notes;
	}
	
	public void clearNotes() {
		notes = null;
	}
	
	public static class Note {
		public String username, note;
		public Date noteTime;
	}

	public static class MarginComparator implements Comparator<Account> {

		@Override
		public int compare(Account o1, Account o2) {
			Double fe1 = new Double(o1.getFreeEquity());
			Double fe2 = new Double(o2.getFreeEquity());
			
			return fe1.compareTo(fe2);
		}
		
	}
}
