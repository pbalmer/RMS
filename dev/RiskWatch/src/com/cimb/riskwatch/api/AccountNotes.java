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
import com.cimb.riskwatch.utils.HttpServletBase;
import com.cimb.riskwatch.utils.Net;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/AccountNotes")
public class AccountNotes extends HttpServletBase {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountNotes() {
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
		String action = request.getParameter("action");
		if (action == null || action.isEmpty()) action = "get";
		String acctCode = request.getParameter("accountCode");
		String note = request.getParameter("note"); // Used when action is set to "add"
		
		if (action.equals("add")) {
			Account acct = Accounts.getAccount(acctCode);
			Accounts.addNote(Integer.parseInt(session.getAttribute("userID").toString()), acct, note);
		}
		String retVal = Json.accountNotes(session, acctCode);
		
		Net.send(response, retVal);
		System.out.println(retVal);
	}
}
