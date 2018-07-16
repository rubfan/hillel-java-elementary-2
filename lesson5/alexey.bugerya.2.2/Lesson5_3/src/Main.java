import java.util.ArrayList;

//Написать программу, которая получает 2 числа из командной строки как параметры, и выводит результат суммы этих чисел.
//        Программу   нужно запаковать в jar и запустить из командной строки.
//        jar cf program.jar <main_class_file> - создание jar файла
//        java -jar <имя_файла> <параметры> - запуск программы

public class Main {

    public static void main(String[] args) {
        String operation = args[1];
        try {
            ArrayList<Integer> operands = new ArrayList<Integer>() {{
                add(Integer.parseInt(args[0]));
                add(Integer.parseInt(args[2]));
            }};
            calcAndPrint(operation, operands);
        } catch (Exception e) {
            System.out.println("! ! ! WRONG DATA ENTERED ! ! !");
        }
    }

    private static void calcAndPrint(String operation, ArrayList<Integer> operands) {
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

    private static double add (ArrayList<Integer> operands) {
        return operands.get(0)+operands.get(1);
    }
    private static double sub (ArrayList<Integer> operands) {
        return operands.get(0)-operands.get(1);
    }
    private static double mul (ArrayList<Integer> operands) {
        return operands.get(0)*operands.get(1);
    }
    private static double div (ArrayList<Integer> operands) {
        return operands.get(0)/operands.get(1);
    }
    private static double mod (ArrayList<Integer> operands) {
        return operands.get(0)%operands.get(1);
    }
    private static double abs (ArrayList<Integer> operands) {
        return Math.abs(operands.get(0));
    }
}

