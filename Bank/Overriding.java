package Bank;

public class Overriding {
	public void message() {
		System.out.println("Thank you for opening an account with us");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding myAccount = new Overriding();
		Savings mySavings = new Savings();
		FixedDeposit myFixedDepo = new FixedDeposit();
		myAccount.message();
		mySavings.message();
		myFixedDepo.message();
	}
}
	class Savings extends Overriding{
	public void message() {
	System.out.println("Thank you for opening a Savings account with us!");
	}
}
	class FixedDeposit extends Overriding{
		public void message() {
			System.out.println("Thank you for opening a Fixed Deposit account with us!");
		}
}

