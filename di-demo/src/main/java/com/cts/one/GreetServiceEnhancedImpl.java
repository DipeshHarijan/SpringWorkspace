package com.cts.one;

public class GreetServiceEnhancedImpl implements GreetService{
	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String greet(String userName) {
		// TODO Auto-generated method stub
		return "Hello "+userName;
	}
	
	

}
