package com.example.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException, IOException{
	    response.setContentType("text/html");
	    
	    PrintWriter pw = response.getWriter();
	    pw.println("<html>");
		pw.println("<head><title>Servlet One</title></head>");
		pw.println("<body><h1>Test new cookie creation:</h1><br>");
		
		// from HttpServletRequest can have relative and absolute path: 
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(request, response);
		
		pw.println("</body>");
		pw.println("</html>");
	}
}
