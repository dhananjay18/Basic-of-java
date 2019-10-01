package ExceptionHandeling;

public class InvalidAccountNumber extends Exception {
	public InvalidAccountNumber() {

	}
	 
	public InvalidAccountNumber(String accountNumber) {
		super(accountNumber);
		
	}
	
}
