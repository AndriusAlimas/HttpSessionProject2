package com.example.listener;
import javax.servlet.*;
public class ServerAppListener implements ServletContextListener{
	 public void contextInitialized(ServletContextEvent servletContextEvent) {
	        System.out.println("###################################################");
	        System.out.println("###################################################");
	        System.out.println("#\tServlet Initialized succesfully!! #");
	        System.out.println("###################################################");
	        System.out.println("###################################################");
	    }

	    public void contextDestroyed(ServletContextEvent servletContextEvent) {
	        System.out.println("###################################################");
	        System.out.println("###################################################");
	        System.out.println("#\tServlet destroyed succesfully!!  #");
	        System.out.println("###################################################");
	        System.out.println("###################################################");
	    }
}
