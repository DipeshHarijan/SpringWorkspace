package com.cts.abcd.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("g4")
//@Primary
public class GreetNoteProviderSimpleImpl implements GreetNoteProvider {

	public String getGreetNote() {
		// TODO Auto-generated method stub
		return "Heyy ";
	}
}
