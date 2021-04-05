package School;
import java.util.*;


public class ArrayTest {
	
	
//	Take 20 integer inputs from user and print the following:
//	number of positive numbers
//	number of negative numbers
//	number of odd numbers
//	number of even numbers
//	number of 0s.

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] n = new int[5];
		int pos=0;
		int neg=0;
		int odd=0;
		int even=0;
		int zero=0;
		for(int i=0; i<n.length; i++) {
			System.out.println("Enter the value of n["+i+"]: ");
			n[i]=s.nextInt();
			
		
		if(n[i]>0) {
			pos++;
		}
		else if(n[i]<0) {
			neg++;
		}
		else {
			zero++;
		}
		if(n[i]%2==0) {
			even++;
		}
		if(n[i]%2!=0) {
			odd++;
		}
		}
		System.out.println("No: of Positive nos:"+pos);
		System.out.println("No: of Negative nos:"+neg);
		System.out.println("No: of 0's "+zero);
		System.out.println("No: of Odd nos:"+odd);
		System.out.println("No: of Even nos:"+even);
		
		
	}

}
