/*
 * here we are making the program of Bankatm
 * Here we create a class Bank Atm
 */
public class BankAtm {
	//here we take some values
	int id = 1234;
	String bankName = "SBI";
	String location = "new delhi";
	double balance = 50000.00;
//here we take the method Withdraw and passing the argument doubble amt
	public void withdraw(double amt) {
		double newbalance;
		newbalance = balance - amt;
		//here we are applying the if condition 
		//for checking the Withdrawal when the amount is less
		if (balance - amt < 20000) {
			//here we are applying the try n catch block
			try {
				throw new BankATMException();
			} catch (BankATMException e) {
				// TODO Auto-generated catch block
				System.out.println("You can not make this withdrawl your balance is below 20000");
			}
		} else {
			System.out.println("Your withdrawl is succesful your new balance is " + newbalance);
		}
	}
//here we are creating the method Deposit and passing the agrungment of double amt
	
	public void deposit(double amt) {
		double newBalance = balance + amt;
		System.out.println("Amount deposited new balance is " + newBalance);
	}
//here we are creating the main Method
	public static void main(String[] args) {
		//here we are creating three different object
		//for three different deposit and Withdrawl
		BankAtm b1 = new BankAtm();
		b1.deposit(1000.00);
		b1.withdraw(1000000.00);
		BankAtm b2 = new BankAtm();
		b2.deposit(20000.00);
		b2.withdraw(10000.00);
		BankAtm b3 = new BankAtm();
		b3.deposit(67543.42);
		b3.withdraw(865787.00);

		// TODO Auto-generated method stub

	}

}
