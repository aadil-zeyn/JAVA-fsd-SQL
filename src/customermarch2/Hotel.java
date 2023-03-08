package customermarch2;

import java.text.BreakIterator;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		Customer c1=new Customer(21, "Aadil", "Kochi", "aadil@gmail.com", "876543234567");
		Customer c2=new Customer(28, "Sasi", "Lakur", "sasi@gmail.com", "876543234567");
		Customer c3=new Customer(24, "Kundara", "Kollam", "aadil@gmail.com", "876543234567");
		Customer c4=new Customer(22, "Poombata", "Vettroad", "aadil@gmail.com", "876543234567");
		Customer c5=new Customer(29, "Jaba", "Thazheveetil", "aadil@gmail.com", "876543234567");
		Customer c6=new Customer(23, "Surya", "Kochi", "aadil@gmail.com", "876543234567");
		int f=0;
		List<Customer> list=Arrays.asList(c1,c2,c3,c4,c5,c6);
		Scanner sasi=new Scanner(System.in);
		int c=sasi.nextInt();
//		List<Customer> lis=list.stream().peek(k->{
//		if((k.getRegid())==c)
//			System.out.println(k);
//		else {System.out.println("invaid");}}).toList();
		for(Customer p:list) {
			if((p.getRegid())==c)
		{System.out.println(p);f=1;break;}
		
		}if(f==0)System.out.println("invalid");
		}

	}


