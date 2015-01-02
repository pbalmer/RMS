package com.cimb.riskwatch.data;

public class FXPair implements Comparable<FXPair> {

	protected static String exchange = "FX";
	
	protected String ccy1;
	protected String ccy2;
	
	public FXPair(String ccy1, String ccy2) {
		this.ccy1 = ccy1;
		this.ccy2 = ccy2;
	}
	
	public Product getProduct() {
		return new Product(exchange, ccy1.concat(ccy2));
	}
	
	@Override
	public final boolean equals(Object p) {
		if (p == this) return true;
		if (!(p instanceof FXPair)) return false;
		
		return compareTo((FXPair)p) == 0;
	}

	@Override
	public int compareTo(FXPair o) {
		if (ccy1.equals(o.ccy1)) {
			return ccy2.compareTo(o.ccy2);
		}
		else {
			return ccy1.compareTo(o.ccy1);
		}
	}
}
