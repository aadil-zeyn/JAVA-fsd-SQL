package test;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list elements are squared
//		List<Integer> a=Arrays.asList(2,5,3,4);
//		List<Integer> aa=a.stream().map(t->t*t).toList();
//		System.out.println(aa);
		
		//even numbers in list are squared
//		List<Integer> a=Arrays.asList(2,5,3,4);
//		List<Integer> aa=a.stream().filter(t->t%2==0).map(t->t*t).toList();
//		System.out.println(aa);
		
		//in list cites starting with t are printed
//		List<String> a=Arrays.asList("Thiruvanthapuram","Thirualla","Thiru","Kochi","Thrissur");
//		List<String> aa=a.stream().filter(t->(t.charAt(0)=='k')).toList();
//		System.out.println(aa);
		
		//product with price greater than 10000 are printed
//		Product p1=new Product(123, "pen", 12000);
//		Product p2=new Product(142, "eracer", 13000);
//		Product p3=new Product(122, "jug", 9000);
//		List<Product> a=Arrays.asList(p1,p2,p3);
//		List<Product> aa=a.stream().filter(t->(t.getPrize()>10000)).toList();
//		System.out.println(aa);
		
		//list of names count the frequency of duplicate names
		List<String> a=Arrays.asList("Surya","Sagar","Finla","Sasi","Jaba","Surya","Surya","Sagar","Finla");
		
		Map<String,Long> aa=a.stream().map(t->t.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(aa);
		
		
	}

}
