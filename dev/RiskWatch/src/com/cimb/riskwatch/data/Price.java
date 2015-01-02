package com.cimb.riskwatch.data;

public class Price {

	protected Product prod;
	protected double bid;
	protected double offer;
	
	public Price(Product prod, double bid, double offer) {
		this.prod = prod;
		this.bid = bid;
		this.offer = offer;
	}
	
	public Product getProd() {
		return prod;
	}

	public double getBid() {
		return bid;
	}

	public double getOffer() {
		return offer;
	}

}
