package com.cimb.riskwatch.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.cimb.riskwatch.data.Audit;

public class SystemAudit {
	
	public static void log(int userID, String systemObject, String systemEvent, String comment) {
		PreparedStatement stmnt = null;
		try {
			String sql = "insert into UserAudit (UserID, SystemObject, EventType, Comment) values (?, ?, ?, ?)";
			System.out.println("Creating statement...");
			System.out.println(sql);
			Connection conn = DB.getConnection();
			stmnt = conn.prepareStatement(sql);
			stmnt.setInt(1, userID);
			stmnt.setString(2, systemObject);
			stmnt.setString(3, systemEvent);
			stmnt.setString(4, comment);
			stmnt.executeUpdate();
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
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
	}

	public static List<Audit> search(String username, String obj, String eventType) {
		PreparedStatement stmnt = null;
		List<Audit> audits = new ArrayList<Audit>();
		try {
			String sql = "select AuditID, Username, AuditTime, SystemObject, EventType, UA.Comment " +
					"from UserAudit UA " +
					"inner join Users U on UA.UserID = U.UserID " +
//					"where AcctID = ?" +
					"order by AuditTime desc";
			System.out.println("Creating statement...");
			System.out.println(sql);
			Connection conn = DB.getConnection();
			stmnt = conn.prepareStatement(sql);
//			stmnt.setString(1, acct.getAcctCode());
			ResultSet rs = stmnt.executeQuery();
			
			int auditID;
			Date auditTime;
			String systemObject, comment;
			while (rs.next()) {
				auditID = rs.getInt("AuditID");
				auditTime = rs.getTimestamp("AuditTime");
				username = rs.getString("Username");
				systemObject = rs.getString("SystemObject");
				eventType = rs.getString("EventType");
				comment = rs.getString("Comment");
				
				Audit audit = new Audit(auditID, username, auditTime, systemObject, eventType, comment);
				audits.add(audit);
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
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
		
		return audits;
	}
	
}
