package ExceptionHandeling;

public class BankService {

	private int accountNumber;

	private double balance = 2000;

	public BankService() {

	}

	public BankService(int accountNber, double balance) {
		this.accountNumber = accountNumber;

		this.balance = balance;

	}

	public void withdraw(int accountNumber, int amount) throws  InvalidAccountNumber,InsuffiecientBalance {
		if (accountNumber != 201) {
			throw new InvalidAccountNumber("invalid accountNumber found ");
		}
		if (amount > balance) {

			 throw new InsuffiecientBalance("insufficient balance found");

		}
		balance = balance - amount;
		System.out.println(balance);

	}

}
