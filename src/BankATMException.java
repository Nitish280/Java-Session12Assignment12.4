
public class BankATMException extends Exception {
	public BankATMException() {
		super("You can not withdraw the amount || your account balance is below 20000");

	}
}
