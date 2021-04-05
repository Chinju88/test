package School;
import java.util.*;

public class ArraySmallest {
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    int[] a = {23,98,45,32,20,67,58,87,10,75};

	    int largest = a[0];
	    int smallest = a[0];

	    for(int i = 0;i<a.length;i++){
	      if(a[i]>largest)
	        largest = a[i];
	      if(a[i]<smallest)
	        smallest = a[i];
	    }

	    System.out.println("Largest is "+largest+" and smallest is "+smallest);

	  }
	}


