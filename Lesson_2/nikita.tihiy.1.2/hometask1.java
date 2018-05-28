// Найти минимальное из 3х чисел
import java.util.Scanner;

public class hometask1 { 

	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a, b, c; 
		
		System.out.println("a equals: ");
		a = in.nextInt();
		System.out.println("b equals: ");
		b = in.nextInt();
		System.out.println("c equals: ");
		c = in.nextInt();
		
		if (a <= b && a <= c) {
			System.out.println("The minimum value: " + a);
			return;
		}
		if (c <= b && c <= a) System.out.println("The minimum value: " + c);
		else System.out.println("The minimum value: " +b); 
	}
}