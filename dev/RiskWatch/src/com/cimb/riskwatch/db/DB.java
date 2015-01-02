package com.cimb.riskwatch.db;

import java.util.Calendar;
import java.sql.*;

import javax.servlet.http.HttpSession;

import com.cimb.riskwatch.api.Json;

// MS SQL Pagination
// SELECT * FROM TableName ORDER BY id OFFSET 10 ROWS FETCH NEXT 10 ROWS ONLY;

public class DB {
	// JDBC driver name and database URL
	private static String JDBC_DRIVER = "";  
	private static String DB_URL = "";
	
	//  Database credentials
	private static String USER = "";
	private static String PASS = "";
	
	public static void setDBCredentials(String jdbcDriver, String dbUrl, String dbUser, String dbPass) {
		JDBC_DRIVER = jdbcDriver;
		DB_URL = dbUrl;
		USER = dbUser;
		PASS = dbPass;
	}
	
	private final static String PRODUCT_SEARCH = "{ \"productCode\": \"%1s\", \"productName\": \"%2s\" }";
	private final static String ACCT_SEARCH = "{ \"accountGroup\": \"%1s\", \"accountCode\": \"%2s\", \"accountName\": \"%3s\", \"accountCcy\": \"%s\", \"email\": \"%5s\", \"phone\": \"%6s\", \"totalEquity\": %7f, \"initalMargin\": %8f, \"freeEquity\": %9f, \"instrument\": \"%s\", \"positionCcy\": \"%s\", \"qty\": %f, \"value\": %f }";
	
	public enum TradeSearchDirection { Either, Long, Short };
	
	protected static Connection conn = null;
	protected static Calendar c = Calendar.getInstance();

	public static Connection getConnection() {
		if (conn == null) {
			try{
				// Register JDBC driver
				Class.forName(JDBC_DRIVER);
				
				// Open a connection
				System.out.println("Connecting to database...");
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
				System.out.println("Done with database...");
			} catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				// Handle errors for Class.forName
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static String accountSearch(HttpSession session, String search, String instrument, TradeSearchDirection tradeDirection) {
		search = "%" + search + "%";
		String retVal = null;
		if (session == null) {
			retVal = Json.SESSION_NO;
		}
		else {
			retVal = "{ \"account\": [ ";
			
			PreparedStatement stmnt = null;
			try {
				// TODO: Change this to work across the correct account groups - not organisation
				String sql = "SELECT AcctGrp, AcctCode, AcctName, AcctCcy, Email, Mobile from Acct where (AcctCode like ? or AcctName like ? or AcctGrp like ?)";
				System.out.println("Creating statement...");
				System.out.println(sql);
				stmnt = getConnection().prepareStatement(sql);
//				stmnt.setString(1, (String) session.getAttribute("organisation"));
				stmnt.setString(1, search);
				stmnt.setString(2, search);
				stmnt.setString(3, search);
				ResultSet rs = stmnt.executeQuery();
				
				boolean first = true;
				String acctGrp, acctCode, acctName, acctCcy, email, mobile;
				while (rs.next()) {
					acctGrp = rs.getString("AcctGrp");
					acctCode = rs.getString("AcctCode");
					acctName = rs.getString("AcctName");
					acctCcy = rs.getString("AcctCcy");
					email = rs.getString("Email");
					mobile = rs.getString("Mobile");
					
					if (!first) retVal += ",";
					// TODO: complete the figures here
					retVal += String.format(ACCT_SEARCH, acctGrp, acctCode, acctName, acctCcy, email, mobile, 57137.00, -59266.00, -2128.00, "", "", 0.0, 0.0);
					first = false;
				}
			} catch (SQLException se) {
				//Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				//Handle errors for Class.forName
				e.printStackTrace();
			} finally {
				//finally block used to close resources
				try {
					if (stmnt != null)
						stmnt.close();
				} catch(SQLException se2){
					// nothing we can do
				}
			}
			retVal += "] }";
		}
		
		return retVal;
	}

	public static String productSearch(HttpSession session, String search) {
		search = "%" + search + "%";
		String retVal = null;
		if (session == null) {
			retVal = Json.SESSION_NO;
		}
		else {
			retVal = "{ \"product\": [ ";
			
			PreparedStatement stmnt = null;
			try {
				String sql = "SELECT LongCode, ProdName from Products where (LongCode like ? or ProdName like ?)";
				System.out.println("Creating statement... " + search);
				System.out.println(sql);
				stmnt = getConnection().prepareStatement(sql);
				stmnt.setString(1, search);
				stmnt.setString(2, search);
				ResultSet rs = stmnt.executeQuery();
				
				boolean first = true;
				String prodCode, prodName;
				while (rs.next()) {
					prodCode = rs.getString("LongCode");
					prodName = rs.getString("ProdName");
					
					if (!first) retVal += ",";
					// TODO: complete the figures here
					retVal += String.format(PRODUCT_SEARCH, prodCode, prodName);
					first = false;
				}
			} catch (SQLException se) {
				//Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				//Handle errors for Class.forName
				e.printStackTrace();
			} finally {
				//finally block used to close resources
				try {
					if (stmnt != null)
						stmnt.close();
				} catch(SQLException se2){
					// nothing we can do
				}
			}
			retVal += "] }";
		}
		
		return retVal;
	}
}
