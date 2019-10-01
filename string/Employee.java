package string;

public class Employee {
	private String firstName;
	 private String lastName;
	 private String company;
	 private String role;

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastname) {
		this.lastName = lastname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


public String generatePassword()
{
	return ""+getFirstname().substring(0, 2)+""+getLastname().substring(0,2)+""+getCompany().substring(0,2)+""+getRole().substring(0, 2);
	
}
}
