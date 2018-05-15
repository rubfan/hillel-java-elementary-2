package hw3;

public class Calculator1 {
    int firstOperand;
    int secndOperand;

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
        Calculator1 c1 = new Calculator1();
        c1.firstOperand = -6;
        c1.secndOperand = 2;

        System.out.println(c1.addition(c1.firstOperand, c1.secndOperand));
        System.out.println(c1.subtraction(c1.firstOperand, c1.secndOperand));
        System.out.println(c1.multiplication(c1.firstOperand, c1.secndOperand));
        System.out.println(c1.division(c1.firstOperand, c1.secndOperand));
        System.out.println(c1.modulus(c1.firstOperand, c1.secndOperand));
        System.out.println(c1.absolute(c1.firstOperand));

    }
}
