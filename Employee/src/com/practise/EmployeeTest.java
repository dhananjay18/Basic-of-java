package com.practise;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		//Employee e=new Programmer("uday");
		//Programmer p=new Programmer("hello");
		Employee[] emp1= {new Programmer("suraj"),new Programmer("dhannnu"),new Programmer("abh"),new Tester("uday")};
		
		for(Employee emp:emp1){
			if(emp instanceof Expert) {
				emp.doSomething();
				
				
			}
		}
	
	}
}
	


