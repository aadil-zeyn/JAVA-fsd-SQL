package hackaathon;

import java.util.Scanner;

public class Main {
	// private double amm=2000;
	public static void main(String[] args) {
		Scanner sasi = new Scanner(System.in);
		double acc;
		System.out.println("Enther the amount to be withdrawn");
		acc = sasi.nextDouble();
		Customer c1 = new Customer(411, "Aadil", "aadil1857aa@gmail.com");
		Savingsaccount aadil = new Savingsaccount(21212, 4000, c1, 1000);
		if (aadil.withdrew(acc)) {
			System.out.println("Amount is Succesfully debitted new balance " + aadil.getBalance());
		} else
			System.out.println("Amount cannot be debitted");
		sasi.close();
	}

}
