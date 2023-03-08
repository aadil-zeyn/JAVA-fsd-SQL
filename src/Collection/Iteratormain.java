package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Iteratormain {
		public static void main(String[] args) {
			ArrayList<String> names=new  ArrayList<>();
			Scanner sc=new Scanner(System.in);
		    System.out.println("enter names: ");
		    for(int i=0;i<3;i++) {
		    	String name=sc.next();
		    	names.add(name);
		    }
		    Iterator itr=names.iterator();
		    while(itr.hasNext()) {
		    	System.out.println(itr.next());
		    }
		    for (String name:names) {
		    	System.out.println(name);
		    }
		}
}
