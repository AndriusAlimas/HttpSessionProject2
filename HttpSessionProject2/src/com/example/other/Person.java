package com.example.other;

import javax.servlet.http.*;

public class Person implements HttpSessionBindingListener {
	// FIELDS:
	private String name;

	// CONSTRUCTORS:
	public Person(String name) {
		this.setName(name);
	}

	// GETTERS:
	public String getName() {
		return this.name;
	}

	// SETTERS:
	public void setName(String name) {
		this.name = name;
	}

	public void valueBound(HttpSessionBindingEvent event) {
		 HttpSession session = event.getSession();
	     Person person = (Person)session.getAttribute("person");
	     System.out.println("Person was added and his name : " + person.name);
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
       System.out.println("Person was was removed and his name : " + event.getValue());
	}

}
