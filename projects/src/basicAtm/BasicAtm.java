package basicAtm;

public class BasicAtm {
	private final double minimumBalance = 10.00;
	private double balance;

	public BasicAtm() {
		balance = 0;
	}

	public double getBalance() {
		return balance;
	}

	public void printBalance() {
		System.out.println(String.format("Your balance is: $%.2f", getBalance()));
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println(String.format("Deposit amount: $%.2f", amount));
	}

	public void withdraw(double d) {
		double accessibleFunds = balance - minimumBalance;
		if (accessibleFunds >= d) {
			balance -= d;
			System.out.println(String.format("Withdrawal amount: $%.2f", d));
		} else {
			throw new ArithmeticException("Error. Not enough money on account");
		}

	}
}
