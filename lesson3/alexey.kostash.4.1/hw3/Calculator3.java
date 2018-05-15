package hw3;

public class Calculator3 {
    static int firstOperand;
    static int secondOperand;
    static String operation;

    static int addition(int a, int b){
        return a + b;
    }

    static int subtraction(int a, int b){
        return a - b;
    }

    static int multiplication(int a, int b){
        return a * b;
    }

    static int division(int a, int b){
        return a / b;
    }

    static int modulus(int a, int b){
        return a % b;
    }

    static int absolute(int a){
        return Math.abs(a);
    }

    public static void main(String[] args){
        //operations must be add, sub, mul, div, mod or abs!
        operation = args[0];
        firstOperand = Integer.parseInt(args[1]);
        if(!args[0].equals("abs")) {
            secondOperand = Integer.parseInt(args[2]);
        }
        switch (operation) {
            case "add":
                System.out.println(addition(firstOperand, secondOperand));
                break;
            case "sub":
                System.out.println(subtraction(firstOperand, secondOperand));
                break;
            case "mul":
                System.out.println(multiplication(firstOperand, secondOperand));
                break;
            case "div":
                System.out.println(division(firstOperand, secondOperand));
                break;
            case "mod":
                System.out.println(modulus(firstOperand, secondOperand));
                break;
            case "abs":
                System.out.println(absolute(firstOperand));
                break;
        }
    }
}
