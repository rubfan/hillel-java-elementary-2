import java.util.ArrayList;
import java.util.Scanner;

//    Добавить к калькулятору возможность ввода операции и чисел из консоли.
// В начале выводите сообщение "Введите операцию:", дальше пользователь вводит операцию,
// далее "Введите первое число:" - вводит, "Введите второе число: "- пользователь вводит.

public class Main {
    private static ArrayList<String> operators = new ArrayList<String>() {{
        add("add");add("+");add("plus");
        add("sub");add("-");add("minus");
        add("mul");add("*");add("multiply");
        add("div");add("/");add("divide");
        add("mod");add("%");add("modulo");
        add("abs");add("||");add("absolute");
    }};

    public static void main(String[] args) {
        do {
            String operation = enterOperation();
            ArrayList<Double> operands = enterOperands(getOperandsAmount(operation));
            calcAndPrint(operation, operands);
        } while (oneMore());

    }

    private static void calcAndPrint(String operation, ArrayList<Double> operands) {
        switch (operation) {
            case "add": case "+": case "plus":
                System.out.println("a + b = " + add(operands));
                break;
            case "sub": case "-": case "minus":
                System.out.println("a - b = " + sub(operands));
                break;
            case "mul": case "*": case "multiply":
                System.out.println("a * b = " + mul(operands));
                break;
            case "div": case "/": case "divide":
                System.out.println("a / b = " + div(operands));
                break;
            case "mod": case "%": case "modulo":
                System.out.println("a % b = " + mod(operands));
                break;
            case "abs": case "||": case "absolute":
                System.out.println("|a| = " + abs(operands));
                break;
        }
    }

    private static int getOperandsAmount(String operation) {
        int operandsAmount;
        switch (operation) {
            case "add": case "+": case "plus":
                operandsAmount = 2;
                break;
            case "sub": case "-": case "minus":
                operandsAmount = 2;
                break;
            case "mul": case "*": case "multiply":
                operandsAmount = 2;
                break;
            case "div": case "/": case "divide":
                operandsAmount = 2;
                break;
            case "mod": case "%": case "modulo":
                operandsAmount = 2;
                break;
            case "abs": case "||": case "absolute":
                operandsAmount = 1;
                break;
            default: operandsAmount = 2; break;
        }
        return operandsAmount;
    }

    private static ArrayList<Double> enterOperands(int amount) {
        boolean entered = false;
        ArrayList<Double> operands = new ArrayList<>();
        do {
            try {
                Scanner input = new Scanner(System.in);
                for (int i=1; i <=amount; i++) {
                    System.out.println("Enter number " + i + ":");
                    operands.add(input.nextDouble());
                }
            } catch (Exception e) {
                System.out.println("Wrong data entered. Try again typing some double");
                continue;
            }
            entered = true;
        } while (!entered);
        return operands;
    }

    private static String enterOperation () {
        boolean entered = false;
        String operation = null;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter operation:");
                operation = input.next();
                if (!operators.contains(operation)){
                    System.out.println("Wrong data entered. Try again typing some operation. One of:\n" +
                            "+ add plus\n" +
                            "- sub minus\n" +
                            "* mul multiply\n" +
                            "/ div divide\n" +
                            "% mod modulo\n" +
                            "|| abs absolute\n");
                    continue;}
            } catch (Exception e) {
                continue;
            }
            entered = true;
        } while (!entered);
        return operation;
    }

    private static double add (ArrayList<Double> operands) {
        return operands.get(0)+operands.get(0);
    }
    private static double sub (ArrayList<Double> operands) {
        return operands.get(0)-operands.get(0);
    }
    private static double mul (ArrayList<Double> operands) {
        return operands.get(0)*operands.get(0);
    }
    private static double div (ArrayList<Double> operands) {
        return operands.get(0)/operands.get(0);
    }
    private static double mod (ArrayList<Double> operands) {
        return operands.get(0)%operands.get(0);
    }
    private static double abs (ArrayList<Double> operands) {
        return Math.abs(operands.get(0));
    }

    private static boolean oneMore (){
        String answer;
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("\nOne more? [Y/N]");
                answer = input.next();
                if (answer.equals("y") || answer.equals("Y")) {
                    return true;
                }
                if (answer.equals("n") || answer.equals("N")) {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Wrong data entered. Try again typing some integer");
            }
        }
    }
}

