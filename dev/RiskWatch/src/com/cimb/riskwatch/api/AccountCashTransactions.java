package com.cimb.riskwatch.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cimb.riskwatch.utils.HttpServletBase;
import com.cimb.riskwatch.utils.Net;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/AccountCashTransactions")
public class AccountCashTransactions extends HttpServletBase {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountCashTransactions() {
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
		String accountCode = request.getParameter("accountCode");
		int currentPage = ( request.getParameter("currentPage") == null ? 1 : Integer.parseInt(request.getParameter("currentPage")));
		int perPage = ( request.getParameter("perPage") == null ? 10 : Integer.parseInt(request.getParameter("perPage")));
		
		String retVal = Json.accountCashTransactions(session, accountCode, currentPage, perPage);
		
		Net.send(response, retVal);
		System.out.println(retVal);
	}
}
