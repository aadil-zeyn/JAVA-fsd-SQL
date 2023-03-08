package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistmain {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter names: ");
	    for(int i=0;i<10;i++) {
	    	String name=sc.next();
	    	names.add(name);
	    }
	    System.out.println(names);
	    
	}

}
