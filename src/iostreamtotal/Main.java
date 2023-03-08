package iostreamtotal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String ust;
		System.out.println("Enter a string");
		ust=s.nextLine();
		s.close();
		byte[] b=ust.getBytes();
		int i=0;
		int count=0;
		try {
			FileOutputStream fin=new FileOutputStream("D://ustin.txt");
			fin.write(b);
			fin.close();
			FileInputStream f=new FileInputStream("D://ustin.txt");
			while((i=f.read())!=-1) {
				if(i==' ')count++;
			}System.out.println("number of words in file is "+(count+1));f.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
