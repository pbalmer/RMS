package com.cimb.riskwatch.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.cimb.riskwatch.data.User;

public class Users {
	
	public static String SECURE_REGEX = null;

	public synchronized static User getUser(String organisation, String username, String password) {
		String role = "admin";
		int userID = 0;
		boolean auth = false;
		boolean locked = false;
		Date expires = null;
		boolean passwordExpired = false;
		String email = "";
		String comment = "";
		boolean restrictOrg = false;
		String restrictAcctGrp = "";
		
		PreparedStatement stmnt = null;
		try {
			String sql = "SELECT UserID, Username, Password, Organisation, RoleID, Locked, PasswordExpiry, Email, Comment, RestrictOrg, RestrictAcctGrp from Users where Organisation = ? and Username = ? and Password = ?";
			System.out.println("Creating statement...");
			System.out.println(sql);
			stmnt = DB.getConnection().prepareStatement(sql);
			stmnt.setString(1, organisation);
			stmnt.setString(2, username);
			stmnt.setString(3, password);
			ResultSet rs = stmnt.executeQuery();
			
			if (rs.next()) {
				// We have found the user...
				userID = rs.getInt("UserID");
				username = rs.getString("Username");
				password = rs.getString("Password");
				auth = true;
				role = "" + rs.getInt("RoleID");
				locked = rs.getBoolean("Locked");
				organisation = rs.getString("Organisation");
				expires = rs.getTimestamp("PasswordExpiry");
				passwordExpired = (expires.before(Calendar.getInstance().getTime()));
				email = rs.getString("Email");
				comment = rs.getString("Comment");
				restrictOrg = rs.getBoolean("RestrictOrg");
				restrictAcctGrp = rs.getString("RestrictAcctGrp");
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
		
		return new User(userID, username, password, auth, role, locked, organisation,
				expires, passwordExpired, email, comment, restrictOrg, restrictAcctGrp);
	}
	

	public synchronized static List<User> getAllUsers() {
		String role = "admin";
		int userID = 0;
		boolean auth = false;
		boolean locked = false;
		Date expires = null;
		boolean passwordExpired = false;
		String email, comment, username, password, organisation;
		boolean restrictOrg = false;
		String restrictAcctGrp = "";
		
		List<User> users = new ArrayList<User>();
		PreparedStatement stmnt = null;
		try {
			String sql = "SELECT UserID, Username, Password, Organisation, RoleID, Locked, PasswordExpiry, Email, Comment, RestrictOrg, RestrictAcctGrp from Users";
			System.out.println("Creating statement...");
			System.out.println(sql);
			stmnt = DB.getConnection().prepareStatement(sql);
			ResultSet rs = stmnt.executeQuery();
			
			while (rs.next()) {
				// We have found the user...
				userID = rs.getInt("UserID");
				username = rs.getString("Username");
				password = rs.getString("password");
				auth = true;
				role = "" + rs.getInt("roleID");
				locked = rs.getBoolean("locked");
				organisation = rs.getString("organisation");
				expires = rs.getTimestamp("passwordExpiry");
				passwordExpired = (expires.before(Calendar.getInstance().getTime()));
				email = rs.getString("Email");
				comment = rs.getString("Comment");
				restrictOrg = rs.getBoolean("RestrictOrg");
				restrictAcctGrp = rs.getString("RestrictAcctGrp");
				
				User user = new User(userID, username, password, auth, role, locked, organisation,
						expires, passwordExpired, email, comment, restrictOrg, restrictAcctGrp);
				users.add(user);
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
		
		return users;
	}
	
	public synchronized static boolean updatePassword(String organisation, String username, String password) {
		boolean secure = true;
		if (Users.SECURE_REGEX != null)
			secure = password.matches(Users.SECURE_REGEX);
		
		// Not updating because the password is not secure enough.
		if (!secure) return false;
		
		PreparedStatement stmnt = null;
		try {
			String sql = "UPDATE Users set Password = ? where Organisation = ? and Username = ?";
			System.out.println("Creating statement...");
			System.out.println(sql);
			stmnt = DB.getConnection().prepareStatement(sql);
			stmnt.setString(1, password);
			stmnt.setString(2, organisation);
			stmnt.setString(3, username);
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
		
		// We have updated the password.
		return true;
		
	}
	/*
	public boolean authenticate(Authentication authentication) throws AuthenticationException {
		String username;
		String password;

		try {
			DirContextOperations userData = getAuthenticator().authenticate(authentication);

			Collection<? extends GrantedAuthority> extraAuthorities = loadUserAuthorities(userData, username, password);

			UserDetails user = userDetailsContextMapper.mapUserFromContext(userData, username, extraAuthorities);

			// We have got here, so must be successful
			return true;
		} 
		catch (Exception e) {
			// There is something wrong - access not permitted.
			e.printStackTrace();
		}
		return false;
	}
	*/
}
