package maxarray;

public class Main {

	public static void main(String[] args) {
		int[] arr={5,3,8,1,7,2};
		int l=arr.length;
		int max=0;
		for(int i=0;i<l;i++) {
			if(max<=arr[i])
				max=arr[i];
		}
		System.out.println("maximum: "+max);

	}

}
