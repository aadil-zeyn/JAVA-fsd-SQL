package packarray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sasi = new Scanner(System.in);
		System.out.println("enter the ticket no: ");
		int l = sasi.nextInt();
		int f = 0, g = l;
		while (g > 0) {
			if (((g % 10) == 3) || ((g % 10) == 6) | ((g % 10) == 9)) {
				f += 1;

			}
			g = g / 10;
		}
		if (f == 4) {
			System.out.println("lucky");
		} else {
			System.out.println("not lucky");
		}
		sasi.close();
	}

}
