package salary;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Salarymain {

	public static void main(String[] args) {
		Money m1=new Money("123", "Aadil", 200000);
		Money m2=new Money("113", "Sasi", 2000);
		Money m3=new Money("103", "Kundara", 70000);
		List<Money> list=Arrays.asList(m1,m2,m3);
		List<Money> lis = list.stream().sorted(Comparator.comparing(Money::getSalary).reversed())
				.peek(k->{
				if((k.getSalary()>=50000)&&(k.getSalary()<100000))
					k.setSalary(k.getSalary()+(0.1)*k.getSalary());
				else if(k.getSalary()>=100000)
					k.setSalary(k.getSalary()+(0.05)*k.getSalary());}
			      ).toList();
				
		
					 
		System.out.println(lis);
		
	}

}
