package com.cimb.riskwatch.data;

import com.cimb.riskwatch.db.Rates;

public class Position {

	protected Product prod;
	protected double qty;
	protected double value;
	protected double marginRate;
	protected String ccy;
	protected Price price;
	
	public Position(Product prod, double qty, double value, double marginRate, String ccy) {
		this.prod = prod;
		this.qty = qty;
		this.value = value;
		this.marginRate = marginRate;
		this.ccy = ccy;
		this.price = Rates.getPrice(prod);
	}

	public double getMarginQty() {
		return -Math.abs(getCurrentValue() * getMarginRate());
	}
	
	public double getCurrentPrice() {
		if (price == null)
			return 0;
		
		double rate = price.bid;
		if (qty < 0) rate = price.offer;
		
		return rate;
	}

	public double getCurrentValue() {
		return -getQty() * getCurrentPrice();
	}
	
	public double getUnrealisedPL() {
		return getCurrentValue() - getTradedValue();
	}

	public double getPositionPrice() {
		return value / -qty;
	}

	public Product getProduct() {
		return prod;
	}

	public double getQty() {
		return qty;
	}

	public double getTradedValue() {
		return value;
	}
	
	public double getMarginRate() {
		return marginRate;
	}
	
	public String getCcy() {
		return ccy;
	}

	public Price getPrice() {
		return price;
	}
	
}
