import java.util.ArrayList;
import java.util.Scanner;

public class Calc_Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> operations = new ArrayList<String>();
        operations.add("mult");
        operations.add("div");
        operations.add("add");
        operations.add("sub");
        operations.add("rem");
        operations.add("mod");

        int firstOperand=1;
        int secondOperand=1;
        String operation;

        System.out.println("Print operation (mult, div, add, sub, rem, mod):");
        operation = scan.nextLine();

        if (operations.contains(operation)) {
            if (operation.equals("mod")) {
                System.out.println("Print a number");
                firstOperand = scan.nextInt();
            } else {
                System.out.println("Print first number");
                firstOperand = scan.nextInt();
                System.out.println("Print second number");
                secondOperand = scan.nextInt();
            }
        }else {
            System.out.println("Error");
        }

        switch (operation) {
            case "mult":
                System.out.println(firstOperand + " * " + secondOperand + " = " + firstOperand * secondOperand);
                break;
            case "div":
                if (secondOperand == 0) System.out.println("Деление на ноль!");
                else
                    System.out.println(firstOperand + " / " + secondOperand + " = " + firstOperand / secondOperand);
                break;
            case "add":
                System.out.println(firstOperand + " + " + secondOperand + " = " + (firstOperand + secondOperand));
                break;
            case "sub":
                System.out.println(firstOperand + " - " + secondOperand + " = " + (firstOperand - secondOperand));
                break;
            case "rem":
                System.out.println(firstOperand + "%" + secondOperand + " = " + (firstOperand % secondOperand));
                break;
            case "mod":
                System.out.println("|" + firstOperand + "| = " + Math.abs(firstOperand));
                break;
            default:
                break;
        }
    }
}
