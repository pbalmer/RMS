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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServletBase {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		//performTask(request, response);
	}
	
	private void performTask(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String username = "";
		String password = "";
		String organisation = null;
		try {
			username = request.getParameter("username");
			password = request.getParameter("password");
			organisation = request.getParameter("organisation");
		}
		catch (Exception e) {
			// Do nothing - we just don't have an org - assume CIMB.
			// If the username or password are missing, the login will fail.
		}
		if (organisation == null) organisation = "CIMB";
		
		String retVal = Json.login(session, username, password, organisation);
		
		Net.send(response, retVal);
		System.out.println(retVal);
	}

}
