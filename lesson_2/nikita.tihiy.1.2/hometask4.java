// Написать программу, которая проверит, является ли число четным или нечетным

import java.util.Scanner; 

public class hometask4 { 

public static void main (String []args) { 

	Scanner in = new Scanner(System.in); 
	
	int a;
		
	System.out.println("Enter any number:");
	a = in.nextInt();
	
	int b = a % 2; 
	
	if ( b == 0 ) System.out.println("Even number.");
	else System.out.println("Odd number.");
	}
}
	
	