package iostream;

import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		String s="Transforming lives";
		byte[] b=s.getBytes();
		try {
			FileOutputStream f= new FileOutputStream("D://ust.txt");
			f.write(b);System.out.println("Succes");f.close();
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
