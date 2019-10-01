package ExceptionHandeling;

public class InsuffiecientBalance extends Exception {
	public InsuffiecientBalance() {

	}

	public InsuffiecientBalance(String balance) {
		super(balance);

	}

}
