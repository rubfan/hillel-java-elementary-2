import java.util.ArrayList;
//Создайте калькулятор, который выполняет, базовые арифметические операции:
//        - умножение;
//        - деление;
//        - сложение;
//        - вычитание;
//        - остаток от деления (%);
//        - нахождение модуля числа (можно использовать Math.abs)
//        входные данные здесь можно представить как:
//        String operation = "addition";
//        int firstOperand = 15;
//        int secondOperand = 12;
public class Main {

    public static void main(String[] args) {
            String operation = "+";
                ArrayList<Double> operands = new ArrayList<Double>() {{
                    add(20.0);
                    add(10.0);
                }};
                calcAndPrint(operation, operands);
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
                default:
                    System.out.println("! ! ! WRONG DATA ENTERED ! ! !");
        }
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
}

