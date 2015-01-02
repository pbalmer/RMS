package com.cimb.riskwatch.data;

import java.util.Date;

public class User {
	protected int userID;
	protected String username;
	protected String password;
	protected boolean auth;
	protected String role;
	protected boolean locked;
	protected String organisation;
	protected Date expires;
	protected boolean passwordExpired;
	protected String email;
	protected String comment;
	protected boolean restrictOrg;
	protected String restrictAcctGrp;
	
	public User(int userID, String username, String password, boolean auth, String role, 
			boolean locked, String organisation, Date expires, boolean passwordExpired,
			String email, String comment, boolean restrictOrg, String restrictAcctGrp) {
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.auth = auth;
		this.role = role;
		this.locked = locked;
		this.organisation = organisation;
		this.expires = expires;
		this.passwordExpired = passwordExpired;
		this.email = email;
		this.comment = comment;
		this.restrictOrg = restrictOrg;
		this.restrictAcctGrp = restrictAcctGrp;
	}
	
	public boolean isRestrictOrg() {
		return restrictOrg;
	}

	public String getRestrictAcctGrp() {
		return restrictAcctGrp;
	}

	public int getUserID() {
		return userID;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public boolean isAuth() {
		return auth;
	}
	public String getRole() {
		return role;
	}
	public boolean isLocked() {
		return locked;
	}
	public String getOrganisation() {
		return organisation;
	}
	public boolean isPasswordExpired() {
		return passwordExpired;
	}

	public Date getExpires() {
		return expires;
	}

	public String getEmail() {
		return email;
	}

	public String getComment() {
		return comment;
	}

}
