package com.example.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyServlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        // get cookies arrays from the request:
        Cookie[] cookies = request.getCookies();
        if (cookies != null) { // if there are some cookies do logic:
            for (Cookie cookie : cookies) {
                if (!cookie.getName().equals("username")) continue;
                String value = cookie.getValue();
                // setValue() method simply change cookie value to another:
                cookie.setValue(value + "changed");
                pw.println("<h1>Hello " + value + "</h1>");
                break; // no need to look other cookies if we find right one!
            }
        }
	}
}
