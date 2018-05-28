// Добавить к калькулятору возможность ввода операции и чисел из консоли. 
// В начале выводите сообщение "Введите операцию:", дальше пользователь вводит операцию, 
// далее "Введите первое число:" - вводит, "Введите второе число: " - пользователь вводит.

import java.util.Scanner; 

public class hometask2 { 

public static void main (String []args) {
	
	Scanner ops = new Scanner(System.in);
	Scanner in = new Scanner(System.in); 

	int firstOperand, secondOperand;	
	
	System.out.println("Welcome to the calculator!");
	System.out.println("[ +, -, *, /, %, abs ] - type the required operation and then press the 'Return' button to continue.");
	String operation = ops.nextLine();	
	
	if (operation.equals("abs")) {	
	
		System.out.println("Enter the initial value: ");		
		firstOperand = in.nextInt();
		System.out.println("Absolute value: " + Math.abs(firstOperand));
				
	}
	
	else {
		
			System.out.println("Enter the first operand: "); 
		firstOperand = in.nextInt();
		
		System.out.println("Enter the second operand: ");
		secondOperand = in.nextInt();
				
		if (operation.equals("+")) System.out.println("Result: " + (firstOperand + secondOperand));
		if (operation.equals("-")) System.out.println("Result: " + (firstOperand - secondOperand));
		if (operation.equals("*")) System.out.println("Result: " + (firstOperand * secondOperand));
		if (operation.equals("/")) {
			
			if (secondOperand !=0) System.out.println("Result: " + (firstOperand / secondOperand));
			else System.out.println("You cannot divide anything by zero, idiot!");
			
		}
		if ( operation.equals("%")) {
			
			if (secondOperand !=0) System.out.println("Result: " + (firstOperand % secondOperand));
			else System.out.println("You cannot divide anything by zero, idiot!");
			
		}		
	}
}
}