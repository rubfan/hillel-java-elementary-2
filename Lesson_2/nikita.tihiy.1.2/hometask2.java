// Найти среди 3х чисел максимальное и минимальное
import java.util.Scanner; 

public class hometask2 { 

	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a, b, c; 
		
		System.out.print("Enter a: ");
		a = in.nextInt();
		System.out.print("Enter b: ");
		b = in.nextInt();
		System.out.print("Enter c: ");
		c = in.nextInt();
		
		if ( a <= b && a <= c ) {
			System.out.print("The minimum value is " + a);
			if ( b <= c )  System.out.println(" and the maximum value is " + c);
			else System.out.println(" and the maximum value is " + b);
			return;
		}		
		if ( b <= a && b <= c ) {
			System.out.print("The minimum value is " + b);
			if ( a <= c )  System.out.print(" and the maximum value is " + c);
			else System.out.println(" and the maximum value is " + a);
		}		
		else { 
			System.out.print("The minimum value is " + c);
			if ( b <= a )  System.out.println(" and the maximum value is " + a);
			else System.out.println(" and the maximum value is " + b);
		}
	}
}