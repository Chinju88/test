package School;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Arr[][]=new int[3][2];
		Arr[0][0]=5;
		Arr[0][1]=8;
		Arr[1][0]=3;
		Arr[1][1]=4;
		Arr[2][0]=2;
		Arr[2][1]=6;
		
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<2; j++) {
				System.out.print(Arr[i][j]);
				System.out.print(" ");
				
			}
			System.out.println();
		}
		String Array[][]=new String[3][2];
		Array[0][0]= "FirstName";
		Array[0][1]= "LastName";
		Array[1][0]= "Chinju";
		Array[1][1]="George";
		Array[2][0]="Jisha";
		Array[2][1]="Xavier";
		
		for(int f=0; f<3; f++) {
			
			for(int n=0; n<2; n++) {
				System.out.print(Array[f][n]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
