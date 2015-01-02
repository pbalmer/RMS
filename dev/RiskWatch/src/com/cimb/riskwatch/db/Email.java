package com.cimb.riskwatch.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Map;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import com.cimb.riskwatch.data.Account;
import com.cimb.riskwatch.data.Position;
import com.cimb.riskwatch.data.Product;

public class Email {
	protected static DecimalFormat qtyFormatterHtml = new DecimalFormat("#,###;<span  style='color:red'>(#,###)</span>");
	protected static DecimalFormat qtyFormatterTxt = new DecimalFormat("#,###;(#,###)");
	protected static DecimalFormat priceFormatter = new DecimalFormat("#,###.00000");

	public static void sendEmail(Account acct, String type, String channel) throws Exception {
		PreparedStatement stmnt = null;
		boolean foundMail = false;
		Exception otherEx = null;
		try {
			String sql = "select Subject, HtmlContent, TextContent, Host, Username, Password, FromEmail, FromName " +
					"from Emails " +
					"where Organisation = ? and Type = ? and Channel = ?";
			System.out.println("Creating statement...");
			System.out.println(sql);
			Connection conn = DB.getConnection();
			stmnt = conn.prepareStatement(sql);
			stmnt.setString(1, acct.getOrganisation());
			stmnt.setString(2, type);
			stmnt.setString(3, channel);
			ResultSet rs = stmnt.executeQuery();
			
			if (rs.next()) {
				String subject, htmlMessage, txtMessage;
				String host, username, password, fromEmail, fromName;
				subject = rs.getString("Subject");
				htmlMessage = rs.getString("HtmlContent");
				txtMessage = rs.getString("TextContent");
				host = rs.getString("Host");
				username = rs.getString("Username");
				password = rs.getString("Password");
				fromEmail = rs.getString("FromEmail");
				fromName = rs.getString("FromName");
				foundMail = true;
				
				sendEmail(acct, subject, htmlMessage, txtMessage, host, username, password, fromEmail, fromName);;
			}
		} catch (SQLException se) {
			//Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			//Handle errors for Class.forName
			otherEx = e;
		} finally {
			//finally block used to close resources
			try {
				if (stmnt != null)
					stmnt.close();
			} catch (SQLException se2) {
				// nothing we can do
			}
		}
		if (!foundMail) {
			// This should throw an error back to the customer.
			throw new Exception("Email template not defined.  Org/Type/Channel - " + 
								acct.getOrganisation() + "/" + type + "/" + channel );
		}
		else if (otherEx != null) {
			throw otherEx;
		}
	}
	
	public static void sendEmail(Account acct, String subject, String htmlMessage, String txtMessage,
			String host, String username, String password, String fromEmail, String fromName) throws EmailException {
		if (txtMessage == null) {
			txtMessage = "Your email client does not support HTML messages";
		}
		
		// Create the email message
		HtmlEmail email = new HtmlEmail();
		email.setHostName(host);
		if (!username.isEmpty())
			email.setAuthentication(username, password);
		
		email.addTo(acct.getEmail(), acct.getAcctName());
		email.setFrom(fromEmail, fromName);
		subject = replaceValues(subject, acct, qtyFormatterTxt);
		email.setSubject(subject);
		
		// set the html message
		htmlMessage = replaceValues(htmlMessage, acct, qtyFormatterHtml);
		email.setHtmlMsg(htmlMessage);

		// set the alternative message
		txtMessage = replaceValues(txtMessage, acct, qtyFormatterTxt);
		email.setTextMsg(txtMessage);

		// send the email
		email.send();
	}
	
	public static String replaceValues(String input, Account acct, DecimalFormat qtyFormatter) {
		// Make sure there is something to do - if not just return the input string.
		if (!input.contains("{")) return input;
		
		// First replace the simple ones that don't require any major processing...
		String output = input.replaceAll("\\{AcctEmail\\}", acct.getEmail());
		output = output.replaceAll("\\{AcctCcy\\}", acct.getCcy());
		output = output.replaceAll("\\{AcctCode\\}", acct.getAcctCode());
		output = output.replaceAll("\\{AcctMobile\\}", acct.getPhone());
		
		// Now the ones that need more processing...
		if (output.contains("{TotalEquity}")) {
			output = output.replaceAll("\\{TotalEquity\\}", "" + qtyFormatter.format(acct.getTotalEquity()));
		}
		if (output.contains("{FreeEquity}")) {
			output = output.replaceAll("\\{FreeEquity\\}", "" + qtyFormatter.format(acct.getFreeEquity()));
		}
		if (output.contains("{Margin}")) {
			output = output.replaceAll("\\{Margin\\}", "" + qtyFormatter.format(acct.getMargin()));
		}
		if (output.contains("{PositionsShort}")) {
			String posStr = "";
			for (Map.Entry<Product, Position> entry : acct.getPositions().entrySet()) {
				Position pos = entry.getValue();
				posStr += pos.getProduct().getLongName() + "|" + qtyFormatter.format(pos.getQty())
						+ "|" + priceFormatter.format(pos.getCurrentPrice()) + '\n';
			}
			output = output.replaceAll("\\{PositionsShort\\}", posStr);
		}
		if (output.contains("{PositionsTable}")) {
			String posStr = "";
			posStr += "<table cellspacing='0' cellpadding='7' border='1'><tr><th>Instrument</th><th>Qty</th><th>Ccy</th><th>Average Price</th><th>Current Price</th><th>Exposure</th><th>IM</th><th>Unrealised P/L</th></tr>";
			for (Map.Entry<Product, Position> entry : acct.getPositions().entrySet()) {
				Position pos = entry.getValue();
				posStr += "<tr><td>" + pos.getProduct().getLongName() + "</td><td align='right'>" +
						qtyFormatter.format(pos.getQty()) + "</td><td>" + 
						pos.getCcy() + "</td><td align='right'>" + 
						priceFormatter.format(pos.getPositionPrice()) + "</td><td align='right'>" +
						priceFormatter.format(pos.getCurrentPrice()) + "</td><td align='right'>" + 
						qtyFormatter.format(pos.getCurrentValue()) + "</td><td align='right'>" +
						qtyFormatter.format(pos.getMarginQty()) + "</td><td align='right'>" + 
						qtyFormatter.format(pos.getUnrealisedPL()) + "</td></tr>";
			}
			posStr += "</table>";
			output = output.replaceAll("\\{PositionsTable\\}", posStr);
		}
		
		return output;
	}
}
