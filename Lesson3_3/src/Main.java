import java.util.ArrayList;

//Тот же калькулятор, только операция и числа вводятся как параметры из командной
//строки в "Edit Configuration". (попробуйте после того как запустили в
//запустить приложение из консоли с передачей параметров)..

public class Main {

    public static void main(String[] args) {
        String operation = args[1];
        try {
            ArrayList<Double> operands = new ArrayList<Double>() {{
                add(Double.parseDouble(args[0]));
                add(Double.parseDouble(args[2]));
            }};
            calcAndPrint(operation, operands);
        } catch (Exception e) {
            System.out.println("! ! ! WRONG DATA ENTERED ! ! !");
        }
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

