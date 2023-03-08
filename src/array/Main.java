package array;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i;
		int arr[] = new int[20];
		Scanner sasi = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		i = sasi.nextInt();
		if (i < 1) {
			System.out.println("invalid!!!!");
		} else {
			int l = i;
			System.out.println("Enter the elements");
			for (int j = 0; j < l; j++) {
				arr[j] = sasi.nextInt();
			}
			for (int j = 0; j < l - 1; j++) {
				arr[j + 1] += arr[j];

			}
			for (int j = 0; j < l; j++) {
				System.out.println(arr[j]);
			}
		}
		sasi.close();

	}

}
