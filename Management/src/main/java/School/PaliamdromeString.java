package School;
import java.util.*;



public class PaliamdromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a String: ");//inputting the word
		Scanner s = new Scanner(System.in);//initializing the scanner to get i/p from keyboard
		String w = s.nextLine();//Storing i/p from keyboard to w
		
		Array.sort(arr)
		
		
		
		//converting string to lowercase
		String word = w.toLowerCase();
	    System.out.println(word);
		
		char[] arr = word.toCharArray();//convert string to character Array
	boolean read=false;
	//iterate through the array
		for(int i=0; i<arr.length;i++) {
			//comparing first and last 
			if(arr[i] == arr[arr.length-1-i]) {
			read=true;//if condition true
			continue;
			}
			else 
				
				System.out.println("The String is not Paliandrome.");
				break;
			
		}	
				
		if(read==true) {
			System.out.println("This String is a paliandrome");
		}
		
			
	}
	

}
