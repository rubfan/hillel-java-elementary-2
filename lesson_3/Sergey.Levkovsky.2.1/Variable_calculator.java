
import java.lang.String;
public class Variable_calculator {

    public static void main(String[] args) {

        Integer x = Integer.parseInt(args[0]);
        String y = String.valueOf(args[1]);
        Integer z = Integer.parseInt(args[2]);

        switch (y) {
            case "+":
                System.out.println(x + z);
                break;
            case "-":
                System.out.println(x - z);
                break;
            case "*":
                System.out.println(x * z);
                break;
            case "/":
                System.out.println(x / z);
                break;
            case "%":
                System.out.println(x % z);
                break;
        }

            }
        }



















