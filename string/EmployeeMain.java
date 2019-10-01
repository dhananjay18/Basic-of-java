package string;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setFirstname("Ramesh");
		emp.setLastname("pawar");
		emp.setCompany("Yash");
		emp.setRole("Devloper");
		System.out.println(emp.generatePassword());
		
	}
	

}
