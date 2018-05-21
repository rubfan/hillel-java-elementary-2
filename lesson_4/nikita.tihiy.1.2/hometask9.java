// возможно, это порождение больного мозга, но более отпимального пути я самостоятельно придумать не смог :D
import java.util.Scanner;

public class hometask9 { 

	public static void main(String[] args) { 
	
	Scanner in = new Scanner(System.in);
	
	int a; // число, которое необходимо перевести в двоичную систему;
	
	System.out.println("Enter the decimal number you want to convert to binary: ");
	a = in.nextInt();
	
		if ( a == 0 ) System.out.println("Result: " + 0); // если ноль, то результат очевиден :)
						
		else {
			
		String binaryNumber = ""; // пустая строка, которая будет заполнятся единицами и нулями будущего результата;
			
		for ( int r; a != 1; ) {
				
				r = a % 2; // проверяем делится ли заданое число на 2 без остачи; если да, записывается 0 в строку ниже, иначе - 1;			
				a = a / 2; // находим число для дальнейших проверок; 
				binaryNumber = r + binaryNumber; // добавляем в строку единицу или ноль в зависимости от результата деления заданого числа на двойку;
				
				// на последней итерации цикла, добавить единицу в начало строки и выдать результат;
				if ( a == 1 ) {
					
					binaryNumber = 1 + binaryNumber;
					System.out.println("Result: " + binaryNumber);
					
				}			
			}
		}
	}
}
	