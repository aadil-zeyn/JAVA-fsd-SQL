package Kgfb;

public class CurrentAccount extends Account implements MaintenanceCharge{
	private int base=100;
	
	public CurrentAccount(String customerName, String accountNumber, double balance, int base) {
		super(customerName, accountNumber, balance);
		this.base = base;
	}

	public float CalculateMaintenanceCharge(float noofyears) {
		return (base*noofyears)+200;
	}
}
