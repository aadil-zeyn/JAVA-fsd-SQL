package cafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import hotel.customer;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Customer c1=new Customer(1, "Aadil");
		Customer c2=new Customer(2, "Sasi");
		Customer c3=new Customer(3, "Jolly");
		Customer c4=new Customer(4, "Saji");
		Customer c5=new Customer(5, "Jaba");
		Customer client=new Customer(0, null);
		List<Customer> cdetails=Arrays.asList(c1,c2,c3,c4,c5);
		
		int uid;
		System.out.println("Enter your UID");
		uid=sc.nextInt();
		
		List<Customer> cdetail=cdetails.stream().filter(t->t.getUID()==uid).toList();
		
		if(!cdetail.isEmpty())
		{   
			for(Customer c:cdetail)
			{System.out.println("\nWelcome back "+c.getName());
			client=c;}
		}
		else {
			System.out.println("\nLooks like you are not in our system\nEnter your name");
			client.setUID(uid);
			client.setName(sc.next());
		}
	
		Menu m1=new Menu("Veg_Meals", 80, 0);
		Menu m2=new Menu("Fish_Meals", 120, 0);
		Menu m3=new Menu("Chapathi_veg_curry", 40, 0);
		Menu m4=new Menu("Chapathi_Chicken_curry", 120, 0);
		Menu m5=new Menu("veg_friedricce", 60, 0);
		Menu m6=new Menu("Chicken_friedreice", 150, 0);
		Menu cfood=new Menu(null, 0, 0);
		List<Menu> food=Arrays.asList(m1,m2,m3,m4,m5,m6);
		
		ArrayList<String> orders=new ArrayList<>();
		int choice=0,i=1,total=0;
		for(Menu m: food) {System.out.println("\nItem: "+i);
			System.out.println(m.getItems()+" : "+m.getPrize());
			m.setId(i);i++;
		}
		int c=0;
		int count=0;
		System.out.println("\n");
		do {
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		
	
		if(choice>=0&&choice<=food.size()) 
		{
		for(Menu m: food) {
			if(m.getId()==choice)
				{
				cfood.setId(choice);
				cfood.setItems(m.getItems());
				cfood.setPrize(m.getPrize());
				
				while(true) {
					orders[count]=(cfood.getItems());count++;
				}
				orders.add(cfood.getItems());
				System.out.println(cfood.getItems()+" Selected"+" Enter 0 to checkout and 1 to add more items ");
				c=sc.nextInt();}
			
		}}else {System.out.println("invalid input!!!\nEnter 1 to re-enter choice");
				c=sc.nextInt();}
		}while(c==1);
		System.out.println(orders);
		System.out.println("\nBilling Details");
		System.out.println("Name: "+client.getName()+"\n");
		for(Menu cf:orders) {
			System.out.println("Item: "+cf.getItems());
			total+=cf.getPrize();
		}
		System.out.println("Prize: "+total);
	}}
			
		
	
		
		
		
		
		
		

	

