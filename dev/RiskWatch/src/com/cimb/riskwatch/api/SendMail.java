package com.cimb.riskwatch.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cimb.riskwatch.data.Account;
import com.cimb.riskwatch.db.Accounts;
import com.cimb.riskwatch.db.Email;
import com.cimb.riskwatch.db.SystemAudit;
import com.cimb.riskwatch.utils.HttpServletBase;
import com.cimb.riskwatch.utils.Net;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/SendMail")
public class SendMail extends HttpServletBase {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendMail() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		performTask(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		performTask(request, response);
	}

	private void performTask(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String acctCode = request.getParameter("accountCode");
		String channel = request.getParameter("channel");
		String type = request.getParameter("mailType");
		
		String retVal = null;
		if (session == null) {
			retVal = Json.SESSION_NO;
		}
		else {
			Account acct = Accounts.getAccount(acctCode);
			try {
				Email.sendEmail(acct, type, channel);
				SystemAudit.log(Integer.parseInt(session.getAttribute("userID").toString()), 
						acctCode, channel, "Success - " + type);
				retVal = Json.SUCCESS_YES;
			}
			catch (Exception e) {
				e.printStackTrace();
				SystemAudit.log(Integer.parseInt(session.getAttribute("userID").toString()), 
						acctCode, channel, "Failed - " + e.getMessage());
				retVal = Json.SUCCESS_NO;
			}
		}
		Net.send(response, retVal);
		System.out.println(retVal);
	}
}
