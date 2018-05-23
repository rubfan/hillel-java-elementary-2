public class hometask7 {
	
	public static void main(String[] args) {
		
		int x = 15;
		
		int a[] = new int[x]; 
		
		int result1 = 0; 
		int result2 = 0;
		
		for ( int i = 1; i <= x; i++ ) {
			
			a[i-1] = 0 + i; 
			System.out.println(a[i-1]);
						
		}
		
		for ( int i = 0; i < x; i++ ) {
			
			if ( a[i]%2 == 0 ) result1 = result1 + a[i]; 
			else result2 = result2 + a[i];
				
		}
		
		System.out.println("Sum of even members of array: " + result1);
		System.out.println("Sum of odd members of array: " + result2);
		
	}
}
		
		
		
		
		
		
		