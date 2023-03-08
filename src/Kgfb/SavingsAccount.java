package Kgfb;

public class SavingsAccount extends Account implements MaintenanceCharge{
	private int base=50;
	
	
	public SavingsAccount(String customerName, String accountNumber, double balance, int base) {
		super(customerName, accountNumber, balance);
		this.base = base;
	}


	public float CalculateMaintenanceCharge(float noofyears) {
		return (base*noofyears)+50;
	}
}
