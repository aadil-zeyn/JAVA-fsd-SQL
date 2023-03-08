package hotel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import salary.Money;

public class mainhotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter minimum");
		int min = sc.nextInt();
		System.out.println("Enter maximum");
		int max = sc.nextInt();
		hotelclass hot1 = new hotelclass("Abuhotel", "Anthrolil", 59000, 0);
		hotelclass hot2 = new hotelclass("jollyhotel", "Kodiyanlocation", 2900, 0);
		hotelclass hot3 = new hotelclass("Sajihotel", "Sajilocation", 2500, 0);
		hotelclass hot4 = new hotelclass("Kodiyanhotel", "jollylocation", 2400, 0);
		List<hotelclass> lishotel = Arrays.asList(hot1, hot2, hot3, hot4);
		List<hotelclass> lis = lishotel.stream().filter(k -> ((k.getBudget() >= min) && (k.getBudget() <= max)))
				.sorted(Comparator.comparing(hotelclass::getBudget)).toList();
		int i = 1;
		int y = 0;
		for (hotelclass h : lis) {
			System.out.println("Hotel: " + i);
			h.setId(i);
			System.out.println("Hotel Name: " + h.getHotname() + "\nHotel location: " + h.getLoc() + "\nHotel rate: "
					+ h.getBudget() + "\n");
			i++;
		}
//		do{
		System.out.println("Enter the choice you want");
		int in = sc.nextInt();

//		}while(y==1);
//		do{
		System.out.println("Enter your name :");
		customer sasi = new customer(null, 0, null, null, null);
		sasi.setName(sc.next());
//		System.out.println("Ithu thanneyaano ninte per : "+sasi.getName());
//		}while(y==1);

		System.out.println("Enter your adhar no :");
		sasi.setAdh(sc.next());
		System.out.println("Enter your mail id :");
		sasi.setMail(sc.next());
		System.out.println("Enter your location :");
		sasi.setLoc(sc.next());
		System.out.println("The hotel you booked is :\n");
		for (hotelclass h : lis) {
			if (h.getId() == in)

				System.out.println("Hotel Name: " + h.getHotname() + "\nHotel location: " + h.getLoc()
						+ "\nHotel rate: " + h.getBudget() + "\n");
		}

		System.out.println("The booking Details:\nName: " + sasi.getName() + "Email: " + sasi.getMail());

	}

}

