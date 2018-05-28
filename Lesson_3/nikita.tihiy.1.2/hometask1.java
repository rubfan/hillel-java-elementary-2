// Создайте калькулятор, который выполняет, базовые арифметические операции:
// - умножение;
// - деление;
// - сложение;
// - вычитание;
// - остаток от деления (%);
// - нахождение модуля числа (можно использовать Math.abs)
// входные данные здесь можно представить как:
// String operation = "addition";
// int firstOperand = 15;
// int secondOperand = 12; 

public class hometask1 { 

public static void main (String []args) {
	
	int firstOperand, secondOperand;	
	String operation; 
	
	firstOperand = 10; // First operand
	secondOperand = 7; // Second operand
	
	// Select required operation below: 
	// + OR - OR * OR / OR % OR abs
	
	operation = "%"; 
	
	if (operation.equals("+")) System.out.println("Operation 'addition': " + firstOperand + " + " + secondOperand + " = " + (firstOperand + secondOperand));
	if (operation.equals("-")) System.out.println("Operation 'subtraction': " + firstOperand + " - " + secondOperand + " = " + (firstOperand - secondOperand));
	if (operation.equals("*")) System.out.println("Operation 'multiplication': " + firstOperand + " * " + secondOperand + " = " + (firstOperand * secondOperand));
	if (operation.equals("/")) {
		
		if ( secondOperand != 0 ) System.out.println("Operation 'division': " + firstOperand + " : " + secondOperand + " = " + (firstOperand / secondOperand));
		else System.out.println("You cannot divide anything by zero, idiot!");
		
	}
	if (operation.equals("%")) { 
	
	if ( secondOperand != 0 ) System.out.println("Operation 'modulo': " + firstOperand + " % " + secondOperand + " = " + (firstOperand % secondOperand));
	else System.out.println("You cannot divide anything by zero, idiot!");
	
	}
	if (operation.equals("abs")) {
		
		System.out.println("Absolute value of first operand: " + Math.abs(firstOperand));
		System.out.println("Absolute value of second operand: " + Math.abs(secondOperand));
		
	}
}
}