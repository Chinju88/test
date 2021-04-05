package School;

public class SampleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] age=new int[3];
		String[] birds=new String[3];
		birds[0]="Peacock";
		birds[1]="Eagle";
		birds[2]="Goose";
		for(int i=0; i<birds.length;i++) {
			System.out.println(birds[i]);
		}
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		float avg;
		for(int j=0; j<arr.length;j++) {
			sum=sum+arr[j];
		}
		
		System.out.println(sum);
		avg=(float)sum/(float)arr.length;
		System.out.println(avg);

	}

}
