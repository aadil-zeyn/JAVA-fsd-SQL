package englishteacher;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Englishmain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the article");
		String article=sc.nextLine();
		sc.close();
		String result = article.replaceAll("[!?.;:,]","");

		String[]  str=result.split(" ");
		System.out.println("the no of words are "+str.length);
		
		List<String> n=Arrays.asList(str);
		
		List<String> h=n.stream().map(t->t.toLowerCase()).distinct().sorted().toList();
		System.out.println("the no of distict words are "+h.size());
		
		System.out.println("The unique words are:");
		h.forEach(t->System.out.println(t));
	}

}
