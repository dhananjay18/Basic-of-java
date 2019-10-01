package string;


public class Membermain {
	public static void main(String[] args) {
		Member member= new Member();
	       member.setFirstname("Ramesh");
	       member.setLastname("Pawar");
	       member.setEmail("rameshpawar1995@gmail.com");
	       member.setPassword("1234");
	       member.setRoll("Devloper");
	       System.out.println(member.showMemberDetail());
	      
		
	}

}
