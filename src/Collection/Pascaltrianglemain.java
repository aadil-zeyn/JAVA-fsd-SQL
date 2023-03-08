package Collection;

import java.util.ArrayList;

public class Pascaltrianglemain {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		for(int i=0;i<4;i++) {
			for(int j=0;j<i+2;j++) {
				num.add((num.get(i))+(num.get(i)));
				
			}
		}System.out.println(num);
	}

}
