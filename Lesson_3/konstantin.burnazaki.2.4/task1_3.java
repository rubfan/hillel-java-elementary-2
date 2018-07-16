import java.util.Scanner;

public class task1_3 {
    public static void main(String[] args) {
        System.out.print("Enter operation: ");
        Scanner sc = new Scanner(System.in);
        String operation = sc.next();
        System.out.print("Enter first operand: ");
        int firstOperand = sc.nextInt();
        System.out.print("Enter second operand: ");
        int secondOperand = sc.nextInt();
        System.out.println(calculator(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2])));

    }

    public static java.lang.Integer calculator(String operation, int firstOperand, int secondOperand) {
        if (operation.equals("multiplication")) {
            return firstOperand * secondOperand;
        }
        if (operation.equals("division")) {
            return firstOperand / secondOperand;
        }
        if (operation.equals("addition")) {
            return firstOperand + secondOperand;
        }
        if (operation.equals("subtraction")) {
            return firstOperand - secondOperand;
        }
        if (operation.equals("modulus")) {
            return firstOperand % secondOperand;
        }
        if (operation.equals("absolute")) {
            System.out.println(Math.abs(firstOperand));
            System.out.println(Math.abs(secondOperand));
        }
        return null;
    }

}
