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
@WebServlet("/AuditSearch")
public class AuditSearch extends HttpServletBase {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuditSearch() {
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
		String username = request.getParameter("username");
		String obj = request.getParameter("object");
		String eventType = request.getParameter("eventType");
		
		String retVal = Json.auditSearch(session, username, obj, eventType);
		
		Net.send(response, retVal);
		System.out.println(retVal);
	}
}
