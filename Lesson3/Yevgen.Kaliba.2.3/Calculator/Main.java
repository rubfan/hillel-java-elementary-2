import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        String MyOper;
        String[] Actions = {"Addiction", "Subtraction", "Multiplication", "Division", "Remainder", "Modulus"};
        Scanner MyKeyb = new Scanner(System.in);
        double a=0, b=0;
        boolean ok1 = false;
        boolean ok2 = false;
        if (args.length >= 2) { //ѕровер€ем, были ли переданы аргументы при вызове программы, и затем - корректность переменных;
            try {
                a = Double.parseDouble(args[1]);
                b = Double.parseDouble(args[2]);
                ok1 = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Your arguments in command line were incorrect. Try manual input.");
                ok1 = false;
            }
        }
        if (args.length == 0) {System.out.println("No command line arguments found, try manual input.");}
        else if (args.length > 0 && Arrays.asList(Actions).contains(args[0])) { //ѕровер€ем, соответсвует ли переданное действие предусмотренным
            ok2 = true;
        } else  {
            System.out.println("Action in your command line is incorrect. Try manual input.");
            ok2 = false;
        }

        if (ok1 && ok2) {                       //≈сли с данными - аргументами все хорошо, то используем их
            a = Double.parseDouble(args[1]);
            b = Double.parseDouble(args[2]);
            MyOper = args[0];
        }

        else {  // ≈сли переданных аргументов нет, вводим аргументы вручную

            while (true) {
                System.out.println("Enter type of operation:");
                MyOper = MyKeyb.next();
                if (Arrays.asList(Actions).contains(MyOper)) {   //ѕроверка на соответсвие допустимым командам
                    break;
                }
                else {
                    System.out.println("You entered incorrect operation. Use operation from list: " + Arrays.asList(Actions));
                }
            }
            System.out.println("Input first number: ");
            a = MyKeyb.nextDouble();
            System.out.println("Input second number: ");
            b = MyKeyb.nextDouble();
        }
        // » собственно расчет и вывод значени€
        if (MyOper.equalsIgnoreCase("Addiction")) { System.out.println("Result of addiction is: " + (a+b));}
        else if (MyOper.equalsIgnoreCase("Subtraction")) { System.out.println("Result of subtraction is: " + (a-b));}
        else if (MyOper.equalsIgnoreCase("Multiplication")) { System.out.println("Result of Multiplication is: " + (a*b));}
        else if (MyOper.equalsIgnoreCase("Division")) { System.out.println("Result of Division is: " + (a/b));}
        else if (MyOper.equalsIgnoreCase("Remainder")) { System.out.println("Remain from division is: " + (a%b));}
        else if (MyOper.equalsIgnoreCase("Modulus")) { System.out.println("Modulus for a firs number is " +Math.abs(a)+" and modulus for second number is "+Math.abs(b)+"." );}

    }
}

