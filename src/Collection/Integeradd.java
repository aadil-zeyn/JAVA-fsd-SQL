package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Integeradd {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println("Enter the number");
		for(int i=0;i<s;i++) {
			int n=sc.nextInt();
			numbers.add(n);
		
		}
		for(int i=0;i<s;i++) {
			for(int j=i+1;j<s;j++)
				if((numbers.get(i)+numbers.get(j)==25)) {
					System.out.println("target integers: "+numbers.get(i)+" "+numbers.get(j));
				}
			}
		}
			
		
	}
