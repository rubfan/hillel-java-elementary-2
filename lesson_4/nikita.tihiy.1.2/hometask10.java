import java.util.Scanner; 

public class hometask10 { 

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter array length: ");
		int x = in.nextInt();
		
		int a[] = new int[x];
		int min;
		int max;
		
		String massA = "";
		String resA = "";
		
		System.out.println("Enter each member of array: ");
		for ( int i = 0; i < x; i++ ) {
			
			a[i] = in.nextInt();
			massA += a[i] + " ";
						
		}
		
		System.out.println("Entered array: " + massA);
		
		for ( int i = 0; i < x; i++ ) {
			
			for ( int j = 0; j < (x-1); j++ ) {
				
				if ( a[j] > a[j+1] ) { 
				
					min = a[j+1];
					max = a[j];
					a[j] = min;
					a[j+1] = max; 
										
				}
				
				else continue; 
				
			}
			
		}
		
		for ( int i = 0; i < 5; i++ ) resA += a[i] + " ";
		
		System.out.println("First five minimum members of array: " + resA);		
			
	}

}