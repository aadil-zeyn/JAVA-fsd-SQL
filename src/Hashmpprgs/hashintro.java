package Hashmpprgs;

import java.util.HashMap;

public class hashintro {
  public static void main(String[] args) {
	     HashMap<String, Integer> map=new HashMap<>();
	     map.put("Aadil", 22);
	     map.put("Sasi", 20);
	     map.put("titus", 23);
	     int age=map.get("Aadil");
	     System.out.println("the age of aadil is "+age);
	     map.remove("titus");
	     boolean contnaintitus=map.containsKey("titus");
	     System.out.println("does this map have titus : "+contnaintitus);
	     for(String name:map.keySet()) {
	    	 System.out.println("Age of "+name+"is "+map.get(name));
	     }
	     

	}

}
