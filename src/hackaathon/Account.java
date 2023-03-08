package hackaathon;

public abstract class Account {
	protected int accountid;
	protected double balance;
	protected Customer customentobj;

	public Account(int accountid, double balance, Customer customentobj) {
		super();
		this.accountid = accountid;
		this.balance = balance;
		this.customentobj = customentobj;
	}

	public abstract Boolean withdrew(double amount);

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomentobj() {
		return customentobj;
	}

	public void setCustomentobj(Customer customentobj) {
		this.customentobj = customentobj;
	}

}