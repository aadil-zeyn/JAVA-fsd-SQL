package positivenegative;

public class Main {

	public static void main(String[] args) {
		int arr[]= {4,-4,6,8,-9,0,4,-7,56};
	    int l=arr.length;
	    int countpos=0;
	    int countneg=0;
	    for(int i=0;i<l;i++) {
	    	if(arr[i]>0)countpos++;
	    	else if(arr[i]<0)countneg++;
	    	
	    	
	    }
	    System.out.println("Negative "+countneg+"\nPositive "+countpos);
	}

}
