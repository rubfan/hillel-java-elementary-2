// Тот же калькулятор, только операция и числа вводятся как параметры из командной строки в "Edit Configuration". 
// (попробуйте после того как запустили в IDE запустить приложение из консоли с передачей параметров).

// [ +, -, x, /, %, abs ] - possible operations.

public class hometask3 { 

public static void main (String []args) {
	
	int firstOperand, secondOperand;	
	
	System.out.println("Welcome to the calculator! See result below: ");
	String operation = args[1];	
	
	if (operation.equals("abs")) {	
	
		firstOperand = Integer.parseInt(args[0]);
		System.out.println("Absolute value: " + Math.abs(firstOperand));
				
	}
	
	else {
				 
		firstOperand = Integer.parseInt(args[0]);		
		secondOperand = Integer.parseInt(args[2]);
				
		if (operation.equals("+")) System.out.println("Result: " + (firstOperand + secondOperand));
		if (operation.equals("-")) System.out.println("Result: " + (firstOperand - secondOperand));
		if (operation.equals("x")) System.out.println("Result: " + (firstOperand * secondOperand));
		if (operation.equals("/")) {
			
			if (secondOperand !=0) System.out.println("Result: " + (firstOperand / secondOperand));
			else System.out.println("You cannot divide anything by zero, idiot!");
			
		}
		if (operation.equals("%")) {
			
			if (secondOperand !=0) System.out.println("Result: " + (firstOperand % secondOperand));
			else System.out.println("You cannot divide anything by zero, idiot!");
			
		}		
	}
}
}