package Kgfb;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sasi=new Scanner(System.in);
		int i;
		float y;
		String accname;
		String accnumber;
		double bal;
		System.out.println("1.Savings Account\n2.Current Account");
		i=sasi.nextInt();
		System.out.println("Enter name of account holder");
		accname=sasi.next();
		System.out.println("Enter the account number");
		accnumber=sasi.next();
		System.out.println("Enter balance");
		bal=sasi.nextDouble();
		
		System.out.println("Enter the no of years");
		y=sasi.nextFloat();
		sasi.close();
		if(i==1) {
			SavingsAccount a1=new SavingsAccount(accname, accnumber, bal, 50);
			System.out.println("Name of account holder: "+a1.getCustomerName()+"\n"+"Account Number: "+a1.getAccountNumber());
			System.out.println("Account Balance: "+a1.getBalance()+"\n"+"Maintenance fees: "+a1.CalculateMaintenanceCharge(y));
		}
		else if(i==2) {
			CurrentAccount a1=new CurrentAccount(accname, accnumber, bal, 100);
			System.out.println("Name of account holder: "+a1.getCustomerName()+"\n"+"Account Number: "+a1.getAccountNumber());
			System.out.println("Account Balance: "+a1.getBalance()+"\n"+"Maintenance fees: "+a1.CalculateMaintenanceCharge(y));
		}
		else {
			System.out.println("invalid input");
		}
	}

}
