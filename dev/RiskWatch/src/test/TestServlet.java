package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/test")
public class TestServlet extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

	private static final long serialVersionUID = 1L;

	public TestServlet() {
		super();
	}   	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		performTask(request, response);
	}  	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		performTask(request, response);
	}   
	
	private void performTask(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = "";
		Enumeration<String> es = request.getParameterNames();
		if (es.hasMoreElements()) {
			param = request.getParameter(es.nextElement());
		}
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
//		out.println("TestServlet says hi " + param);
		
		HttpSession session = request.getSession(false);
		if (session != null) {
			Enumeration<String> names = session.getAttributeNames();
			out.println("{");
			while ( names.hasMoreElements() ) {
				String name = (String) names.nextElement();
				  
				// Get the Attribute Value with the matching name
				String value = session.getAttribute(name).toString();
				  
				// Print the name/value pair
				out.println(String.format("\"%1$s\": \"%2$s\"", name, value));
				
				if (names.hasMoreElements()) out.println( "," );
			}
			out.println("}");
		}
		else {
			out.println("No valid session");
		}
	}
	
}
