import java.util.Scanner;
import java.lang.String;
public class Calc {
	public static void main(String[] args) {

			Scanner A = new Scanner(System.in);
			System.out.println("Enter first number");
			int a = A.nextInt();

			Scanner B = new Scanner(System.in);
			System.out.println("Enter second number");
			int b = B.nextInt();

			Scanner C = new Scanner(System.in);
			System.out.println("Choose ur operation (+,-,*,/,%)");
			String c = C.next();

			if (c.equals("+")) {
				System.out.println(a + b);
			} else if (c.equals("-")) {
				System.out.println(a - b);
			} else if (c.equals("*")) {
				System.out.println(a * b);
			} else if (c.equals("/")) {
				System.out.println(a / b);
			} else if (c.equals("%")) {
				System.out.println(a % b);
			}

		}

	}





