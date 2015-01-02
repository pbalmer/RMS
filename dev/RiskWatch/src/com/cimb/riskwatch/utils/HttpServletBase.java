package com.cimb.riskwatch.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.cimb.riskwatch.db.Accounts;
import com.cimb.riskwatch.db.DB;
import com.cimb.riskwatch.db.Rates;
import com.cimb.riskwatch.db.Users;

public class HttpServletBase extends HttpServlet {

	private static boolean loadedProps = false;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		if (!loadedProps) {
			Properties properties = new Properties();
			try {
				ServletContext context = getServletContext();
				InputStream stream = context.getResourceAsStream("/WEB-INF/RMS.properties");
				properties.load(stream);
			} catch (IOException e) {
				e.printStackTrace();
			}
			String jdbcDriver = properties.getProperty("jdbcDriver");
			String dbUrl = properties.getProperty("dbURL");
			String dbUser = properties.getProperty("dbUser");
			String dbPass = properties.getProperty("dbPass");
			
			DB.setDBCredentials(jdbcDriver, dbUrl, dbUser, dbPass);
			
			String intermediateCcy = properties.getProperty("intermediateCcy");
			Rates.intermediateCcy = intermediateCcy;
			
			String passwordRegex = properties.getProperty("passwordRegex");
			if (!passwordRegex.isEmpty()) 
				Users.SECURE_REGEX = passwordRegex;
			
			String acctTimeout = properties.getProperty("accountTimeout");
			Accounts.TIMEOUT = Long.parseLong(acctTimeout);
			String priceTimeout = properties.getProperty("priceTimeout");
			Rates.TIMEOUT = Long.parseLong(priceTimeout);
			
			loadedProps = true;
		}
	}
}
