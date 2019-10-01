package string;


public class Member {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String roll;
	public String showMemberDetail()
	{
		String str=("name:"+getFirstname()+""+getLastname()+",email:"+getEmail()+",password:"+getPassword()+",role:"+getRoll());
		return str;

	}
	public String getFirstname() {
		return firstName;
	}
	public String setFirstname(String firstname) {
		return this.firstName = firstname;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
}

