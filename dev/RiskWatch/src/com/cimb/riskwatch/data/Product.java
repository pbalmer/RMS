package com.cimb.riskwatch.data;

public class Product implements Comparable<Product> {
	protected String exchange;
	protected String contract;
	
	public Product(String exchange, String contract) {
		this.exchange = exchange;
		this.contract = contract;
	}
	
	public String getExchange() {
		return exchange;
	}

	public String getContract() {
		return contract;
	}
	
	public String getLongName() {
		return getContract() + "." + getExchange();
	}
	
	@Override
	public final boolean equals(Object p) {
		if (p == this) return true;
		if (!(p instanceof Product)) return false;
		
		return compareTo((Product)p) == 0;
	}

	@Override
	public int compareTo(Product prod) {
		int retVal = exchange.compareTo(prod.exchange);
		if (retVal == 0) retVal = contract.compareTo(prod.contract);
		return retVal;
	}

}
