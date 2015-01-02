package com.cimb.riskwatch.data;

import java.util.Date;

public class CashTransaction {
	protected String ccy, transType, comment;
	protected Date transTime;
	protected double qty;
	
	public CashTransaction(String ccy, String transType, String comment, Date transTime, double qty) {
		this.ccy = ccy;
		this.transType = transType;
		this.comment = comment;
		this.transTime = transTime;
		this.qty = qty;
	}

	public String getCcy() {
		return ccy;
	}

	public String getTransType() {
		return transType;
	}

	public String getComment() {
		return comment;
	}

	public Date getTransTime() {
		return transTime;
	}

	public double getQty() {
		return qty;
	}

}
