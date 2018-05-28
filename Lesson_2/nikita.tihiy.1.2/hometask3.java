// Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа

import java.util.Scanner; 

public class hometask3 { 

	public static void main (String[] args) {
			
	Scanner in = new Scanner(System.in); 

	int a, b, c; 
	
	System.out.println("Enter a: ");
	a = in.nextInt(); 
	System.out.println("Enter b: ");
	b = in.nextInt(); 
	System.out.println("Enter c: ");
	c = in.nextInt(); 
	
	// максимально примитивное и глупое решение, но рабочее. увы, не успел прочитать о чём-то более оптимальном 
	
	if ( a == b && b == c ) System.out.println("All values are the same. A: " + a + " B: " + b + " C: " + c);
	if ( a == b && b < c ) System.out.println("A & B are the minimum values. A: " + a + " B: " + b);
	if ( b == c && c < a ) System.out.println("B & C are the minimum values. B: " + b + " C: " + c);
	if ( a == c && c < b ) System.out.println("A & C are the minimum values. A: " + a + " C: " + c);
	if ( a < b && a < c ) System.out.println("A is the minimum value and equals: " + a); 
	if ( b < a && b < c ) System.out.println("B is the minimum value and equals: " + b); 
	if ( c < a && c < b ) System.out.println("C is the minimum value and equals: " + c); 	
	}
}
