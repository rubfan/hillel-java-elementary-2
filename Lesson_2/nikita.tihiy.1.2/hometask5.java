// Даны 2 числа, определить делится ли первое число на второе без остатка

import java.util.Scanner; 

public class hometask5 { 

	public static void main (String []args) {
		
		Scanner in = new Scanner(System.in);
		int a, b;
		
		System.out.println("Enter A integer: ");
		a = in.nextInt();
		System.out.println("Enter B integer: ");
		b = in.nextInt();
		
		int c = a%b; 
		
		if ( c == 0 ) System.out.println("The number can be divided without a remainder.");
		else System.out.println("The number cannot be divided without a remainder.");
	}
}
		
		