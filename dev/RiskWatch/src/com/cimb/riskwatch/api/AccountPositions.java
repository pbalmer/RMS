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
@WebServlet("/AccountPositions")
public class AccountPositions extends HttpServletBase {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountPositions() {
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
		String productCode = request.getParameter("productCode");
		String agg = request.getParameter("aggregateLongShort");
		String concentration = request.getParameter("concentration");
		String concentrationLevel = request.getParameter("concentrationLevel");
		String minSize = request.getParameter("minSize");
		String retVal = null;
		
		if (accountCode != null)
			retVal = Json.accountPositions(session, accountCode);
		else if (productCode != null) {
			if (agg != null && agg.equals("true"))
				retVal = Json.productAggPositions(session, productCode);
			else 
				retVal = Json.productPositions(session, productCode);
		}
		else if (concentration != null && concentration.equals("true")) {
			double level = 100;
			if (concentrationLevel != null && !concentrationLevel.isEmpty())
				level = Double.parseDouble(concentrationLevel);
			
			double min = 0;
			if (minSize != null && !minSize.isEmpty())
				min = Double.parseDouble(minSize);
			
			retVal = Json.positionConcentration(session, level, min);
		}
		
		Net.send(response, retVal);
		System.out.println(retVal);
	}
}
