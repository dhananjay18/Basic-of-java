package com.test;

public class Hospital{
	public static void main(String[] args) {
		
	Ihospital gov = new Goverment();
	Ihospital prv = new Private();
	System.out.println(gov.getName());
	System.out.println(gov.getBeds());
	System.out.println(gov.getType());
	System.out.println(gov.getCommName());
	
	System.out.println(prv.getName());
	System.out.println(prv.getBeds());
	System.out.println(prv.getType());

	System.out.println(gov.getCommName());
	
	}

}
abstract class Ihospital{

	abstract String getName();
	abstract int getBeds();
	abstract String getType();

	public String getCommName() {
		// TODO Auto-generated method stub
		return "ajay";
	}	
	
}

class Goverment extends Ihospital
{


	public String getName() {
		// TODO Auto-generated method stub
		return "goverment hospital";
	}

	@Override
	public int getBeds() {
		// TODO Auto-generated method stub
		return 123;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "gover";
	}
	
}

class Private extends Ihospital
{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "private hospital";
	}

	@Override
	public int getBeds() {
		// TODO Auto-generated method stub
		return 456;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "prv";
	}
	
}
