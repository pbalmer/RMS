package com.cimb.riskwatch.data;

public class Ledger {

	protected double cash = 0;
	protected double unrealisedPL = 0;
	protected double margin = 0;
	protected double grossExposure = 0;
	
	public Ledger(double cash, double unrealisedPL, double margin, double grossExposure) {
		this.cash = cash;
		this.unrealisedPL = unrealisedPL;
		this.margin = margin;
		this.grossExposure = Math.abs(grossExposure);
	}
	
	public void add(Ledger l) {
		cash += l.cash;
		unrealisedPL += l.unrealisedPL;
		margin += l.margin;
		grossExposure += l.grossExposure;
	}
	
	public double getCash() {
		return cash;
	}

	public double getUnrealisedPL() {
		return unrealisedPL;
	}
	
	public double getTotalEquity() {
		return getCash() + getUnrealisedPL();
	}

	public double getMargin() {
		return margin;
	}
	
	public double getFreeEquity() {
		return getTotalEquity() + getMargin();
	}
	
	public double getGrossExposure() {
		return grossExposure;
	}
}
