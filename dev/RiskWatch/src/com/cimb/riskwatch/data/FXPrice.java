package com.cimb.riskwatch.data;

public class FXPrice extends Price {

	protected FXPair pair;
	
	public FXPrice(FXPair pair, double bid, double offer) {
		super(pair.getProduct(), bid, offer);
		
		this.pair = pair;
	}

	public double convertTo(String ccy, double qty) {
		boolean multiply = true;
		if (ccy.equals(pair.ccy1)) multiply = false;
		
		boolean useBid = true;
		if (qty < 0) useBid = false;
		
		if (multiply) {
			if (useBid)
				return qty * bid;
			else
				return qty * offer;
		}
		else {
			if (useBid)
				return qty / bid;
			else
				return qty / offer;
		}
	}
}
