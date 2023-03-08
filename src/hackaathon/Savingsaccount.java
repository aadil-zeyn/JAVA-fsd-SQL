package hackaathon;

public class Savingsaccount extends Account {
	private double minimumAmount;

	public Savingsaccount(int accountid, double balance, Customer customentobj, double minimumAmount) {
		super(accountid, balance, customentobj);
		this.minimumAmount = minimumAmount;
	}

	public double getMinimumAmount() {
		return minimumAmount;
	}

	public void setMinimumAmount(double minimumAmount) {
		this.minimumAmount = minimumAmount;
	}

	@Override
	public Boolean withdrew(double amount) {
		if ((balance - amount) >= minimumAmount) {
			balance -= amount;
			return true;
		} else
			return false;
	}

}
