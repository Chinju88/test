package School;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] z=new int[10];
		for(int i = 0;i<z.length;i++){
		      System.out.println("Print the value of z["+i+"]");
		      z[i] = s.nextInt();
		
		 boolean read=true;   
		int r = z.length-1;
		
		for(int j=0; j<z.length/2; j++) {
			if(z[i]!=z[j]) {
				read=false;
				break;
			}
				else 
					i--;
				}
			System.out.println("read");
			}
	}
		
	

}
