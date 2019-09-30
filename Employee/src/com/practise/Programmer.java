package com.practise;

public class Programmer extends Employee implements Expert {

	public Programmer(String Name) {
		super(Name);
		
	}

	@Override
	public void doSomething() {
	 System.out.println("Programming:---"+getName());
		
	}

	
}
