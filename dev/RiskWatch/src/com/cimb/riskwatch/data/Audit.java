package com.cimb.riskwatch.data;

import java.util.Date;

public class Audit {
	protected int auditID;
	protected String username;
	protected Date auditTime;
	protected String systemObject;
	protected String eventType;
	protected String comment;
	
	public Audit(int auditID, String username, Date auditTime, String systemObject, 
			String eventType, String comment) {
		this.auditID = auditID;
		this.username = username;
		this.auditTime = auditTime;
		this.systemObject = systemObject;
		this.eventType = eventType;
		this.comment = comment;
	}

	public int getAuditID() {
		return auditID;
	}

	public String getUsername() {
		return username;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public String getSystemObject() {
		return systemObject;
	}

	public String getEventType() {
		return eventType;
	}

	public String getComment() {
		return comment;
	}
	
}
