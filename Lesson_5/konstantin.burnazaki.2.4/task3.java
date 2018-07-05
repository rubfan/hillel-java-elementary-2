import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        sumOfTwo();

    }
    public static void sumOfTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        int firstOperand = sc.nextInt();
        System.out.print("Enter second operand: ");
        int secondOperand = sc.nextInt();
        int sum = firstOperand + secondOperand;
        System.out.println(firstOperand + " + " + secondOperand + " = " + sum);
    }
}