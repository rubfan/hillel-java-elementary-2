package hw3;

import java.util.Scanner;

public class Calculator2 {

    int firstOperand;
    int secondOperand;
    String operation;
    boolean running = true;

    int addition(int a, int b){
        return a + b;
    }

    int subtraction(int a, int b){
        return a - b;
    }

    int multiplication(int a, int b){
        return a * b;
    }

    int division(int a, int b){
        return a / b;
    }

    int modulus(int a, int b){
        return a % b;
    }

    int absolute(int a){
        return Math.abs(a);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculator2 c2 = new Calculator2();
        while(c2.running){
            System.out.print("Enter operation (addition - \"+\", subtraction - \"-\", multiplication - \"*\", " +
                    "division - \"/\", modulus - \"%\", absolute - \"abs\", quit - \"q\"): ");
            c2.operation = scanner.nextLine();
            if(c2.operation.equals("q")){
                c2.running = false;
            }
            if(c2.running) {
                System.out.print("Enter the first operand: ");
                c2.firstOperand = scanner.nextInt();
                if(!c2.operation.equals("abs")) {
                    System.out.print("Enter the second operand: ");
                    c2.secondOperand = scanner.nextInt();
                }
                System.out.print("Result = ");
                switch (c2.operation) {
                    case "+":
                        System.out.println(c2.addition(c2.firstOperand, c2.secondOperand));
                        break;
                    case "-":
                        System.out.println(c2.subtraction(c2.firstOperand, c2.secondOperand));
                        break;
                    case "*":
                        System.out.println(c2.multiplication(c2.firstOperand, c2.secondOperand));
                        break;
                    case "/":
                        System.out.println(c2.division(c2.firstOperand, c2.secondOperand));
                        break;
                    case "%":
                        System.out.println(c2.modulus(c2.firstOperand, c2.secondOperand));
                        break;
                    case "abs":
                        System.out.println(c2.absolute(c2.firstOperand));
                        break;
                }
                c2.operation = scanner.nextLine(); //do not work without this line
            }
        }
        scanner.close();
        System.out.println("Calculator has stopped");
    }
}
