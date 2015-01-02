package com.cimb.riskwatch.data;

import java.util.Date;

public class Trade {
	protected int tradeID;
	protected Date tradeTime;
	protected Product prod;
	protected double qty;
	protected double price;
	
	public Trade(int tradeID, Date tradeTime, Product prod, double qty, double price) {
		this.tradeID = tradeID;
		this.tradeTime = tradeTime;
		this.prod = prod;
		this.qty = qty;
		this.price = price;
	}

	public int getTradeID() {
		return tradeID;
	}

	public Date getTradeTime() {
		return tradeTime;
	}

	public Product getProd() {
		return prod;
	}

	public double getQty() {
		return qty;
	}

	public double getPrice() {
		return price;
	}

}
