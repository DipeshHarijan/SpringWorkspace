package com.cts.abcd.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("g1")
@ComponentScan("com.cts.abcd.service")
public class GreetServiceSimpleImpl implements GreetService{
	
	public String greet(String userName) {
		return "Hello "+userName;
	}
}