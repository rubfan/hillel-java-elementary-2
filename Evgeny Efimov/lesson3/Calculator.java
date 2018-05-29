import java.util.Scanner;

public class Calculator {
    private Scanner scanner;
    private String operation;
    private double firstNumber;
    private double secondNumber;
    private double result;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }


    public Calculator() {
        scanner = new Scanner(System.in);
    }


    public void start() {
        while (true) {
            System.out.println("Введите одну из операций");
            System.out.println("- multiplication;\n" +
                    "- division;\n" +
                    "- addition;\n" +
                    "- subtraction;\n" +
                    "- remainderOfTheDivision (%);\n" +
                    "- module \n" +
                    "- exit\n");
            operation = scanner.nextLine();
            if (operation.equals("exit")) break;

            if (operation.equals("module")) {
                System.out.println("Введите число");
                firstNumber = scanner.nextDouble();
                result = module();
                System.out.println("Результат" + result);

            }

            System.out.println("Введите первое число");
            firstNumber = scanner.nextDouble();
            System.out.println("Введите второе число");
            secondNumber = scanner.nextDouble();
            calculating();
            System.out.println("Результат: " + result);
        }
    }

    private void calculating() {
        if (operation.equals("division")) result = division();
        if (operation.equals("multiplication")) result = multiplication();
        if (operation.equals("addition")) result = addition();
        if (operation.equals("subtraction")) result = subtraction();
        if (operation.equals("remainderOfTheDivision")) result = remainderOfTheDivision();
    }

    private double multiplication() {
        return firstNumber * secondNumber;
    }

    private double division() {
        return firstNumber / secondNumber;
    }

    private double addition() {
        return firstNumber + secondNumber;
    }

    private double subtraction() {
        return firstNumber - secondNumber;
    }

    private double remainderOfTheDivision() {
        return firstNumber % secondNumber;
    }

    private double module() {
        return Math.abs(firstNumber);
    }
}
