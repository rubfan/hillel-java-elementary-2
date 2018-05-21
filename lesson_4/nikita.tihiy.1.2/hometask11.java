import java.util.Scanner; 

public class hometask11 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		
		System.out.println("Enter any number to sum its digits: "); 
		String number = in.nextLine();
		
		int a[] = new int[number.length()];
				
		for ( int i = 10; i >= 10; ) { 
			
			i = 0; 
			
			for ( int j = 0; j < number.length(); j++) {
					
				a[j] = Integer.parseInt(""+number.charAt(j));
				i += a[j];
				
			}
			
			number = "" + i;
			
			if ( i >= 10) System.out.println("Mid result: " + number);
						
		}
		
		System.out.println("Final result: " + number);
				
	}
}
			
		
		