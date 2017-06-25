
public class TestAmount {
	public void test(double balance) throws BankATMException {
		if (balance < 20000.00) {
			throw new BankATMException();

		} else {
			System.out.println("You do not have sufficient fund for this transcation");
		}
	}

}
