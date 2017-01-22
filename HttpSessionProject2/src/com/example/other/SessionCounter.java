package com.example.other;
import javax.servlet.http.*;

public class SessionCounter implements HttpSessionListener {
	 private static int activeSessions; // simple for session created and invalidate counting

	 // to call from outside of code , to get know how many active session:
	    public static int getActiveSessions() {
	        return activeSessions;
	    }

	    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
	        System.out.println("###################################################");
	        System.out.println("###################################################");
	        System.out.println("#\tSession created succesfully!! #");
	        System.out.println("###################################################");
	        System.out.println("###################################################");
	        ++activeSessions;
	    }

	    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
	        System.out.println("###################################################");
	        System.out.println("###################################################");
	        System.out.println("#\tSession Destroyed succesfully!! #");
	        System.out.println("###################################################");
	        System.out.println("###################################################");
	        --activeSessions;
	    }
}
