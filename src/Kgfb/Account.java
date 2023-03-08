package Kgfb;

public class Account {
	private String CustomerName;
	private String AccountNumber;
	private double balance;
	public Account(String customerName, String accountNumber, double balance) {
		super();
		CustomerName = customerName;
		AccountNumber = accountNumber;
		this.balance = balance;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
