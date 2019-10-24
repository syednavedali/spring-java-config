package com.syednavedali.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetService {

	@Autowired
	private String msgText;
	
	@Autowired
	private RandomGreeting randomGreeting;
	
	public String greeting() {
		return "Hello from: "+msgText;
	}

	public String randomGreeting() {
		return "Hello from: "+randomGreeting.next();
	}
}