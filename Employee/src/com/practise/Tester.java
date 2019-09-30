package com.practise;

public class Tester extends Employee implements Expert {

	public Tester(String Name) {
		super(Name);
		
	}

	@Override
	public void doSomething() {
		System.out.println("tester:---"+getName());
		
		
	}

	
}
