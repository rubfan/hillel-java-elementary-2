// Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11

import java.util.Scanner;

public class hometask6 { 

	public static void main (String []args) { 
		
		Scanner in = new Scanner(System.in);
		
		int a, b; 
		
		System.out.println("Enter A: ");
		a = in.nextInt();
		System.out.println("Enter B: ");
		b = in.nextInt();
		
		int c, d; 
		
		c = Math.abs(a) - 10;
		d = Math.abs(b) - 10;
		
		if ( c < d ) System.out.println("A is closer to 10.");
		else System.out.println("B is closer to 10.");
	}
}
	