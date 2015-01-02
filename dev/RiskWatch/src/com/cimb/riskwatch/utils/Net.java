package com.cimb.riskwatch.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class Net {

	public static void send(HttpServletResponse response, String retVal) throws IOException {
		
		// Set standard HTTP/1.1 no-cache headers.
		response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");
		// Set standard HTTP/1.0 no-cache header.
		response.setHeader("Pragma", "no-cache");
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.println(retVal);
	}
}
