import java.util.ArrayList;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> operations = new ArrayList<String>();
        operations.add("mult");
        operations.add("div");
        operations.add("add");
        operations.add("sub");
        operations.add("rem");
        operations.add("mod");

        int firstOperand = 15;
        int secondOperand = 12;
        String operation = "add";

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
