package hashmapprgmm;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, employee> employe=new HashMap<>();
		employee e1=new employee(435,"IT","Aadil",22);
		employee e2=new employee(438,"Techsupport","Sasi",22);
		employee e3=new employee(435,"poombatta","kundra",22);
		employe.put(1,e1);
		employe.put(2,e2);
		employe.put(3,e3);
		Integer i=0;
		for(Integer k:employe.keySet()) {
			employee e=employe.get(k);i++;
			System.out.println(e.hashCode());
		}
		for(Integer k:employe.keySet()) {
			employee e=employe.get(k);
			System.out.println(e.hashCode());
		}
		int emp1=e1.hashCode();
		System.out.println(emp1);

		
		

	}

}
