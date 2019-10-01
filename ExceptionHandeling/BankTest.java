package ExceptionHandeling;

public class BankTest {

	public static void main(String[] args) {
		BankService bankService = new BankService();
		try {
			bankService.withdraw(201, 1000);
		} catch (InsuffiecientBalance e) {
			System.out.println(e.getMessage());

		} catch (InvalidAccountNumber e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
