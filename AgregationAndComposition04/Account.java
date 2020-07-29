package AgregationAndComposition04;

public class Account {

	private String accountName;
	private double balance;
	boolean isLock = false;

	public Account(String accountName, double balance) {
		super();
		this.accountName = accountName;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (isLock == false) {
			this.balance = balance;
		}
	}

	public boolean isLock() {
		return isLock;
	}

	public void lock(boolean isLock) {
		this.isLock = isLock;
		if (isLock == true) {
			System.out.println("Account=" + accountName + ", balance=" + balance + ", isLock=" + isLock);
		} else {
			System.out.println("Account=" + accountName + ", balance=" + balance + ", isLock=" + isLock);
		}
	}

	public String getAccountName() {
		return accountName;
	}

	@Override
	public String toString() {
		return "Account=" + accountName + ", balance=" + balance + ", isLock=" + isLock;
	}

}