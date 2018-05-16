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
        if (args.length >= 2) { //Checking, are recieved arguments correct; 
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
        else if (args.length > 0 && Arrays.asList(Actions).contains(args[0])) { //Checking recieved from cl action for known;
            ok2 = true;
        } else  {
            System.out.println("Action in your command line is incorrect. Try manual input.");
            ok2 = false;
        }

        if (ok1 && ok2) {                       //If arguments and action from cl are ok, we use them
            a = Double.parseDouble(args[1]);
            b = Double.parseDouble(args[2]);
            MyOper = args[0];
        }

        else {  // If there are no arguments recieved, or they are incorrect, asking for manual input:

            while (true) {
                System.out.println("Enter type of operation:");
                MyOper = MyKeyb.next();
                if (Arrays.asList(Actions).contains(MyOper)) {   //Checking for know commands list
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
        // Totally, calculation and result output
        if (MyOper.equalsIgnoreCase("Addiction")) { System.out.println("Result of addiction is: " + (a+b));}
        else if (MyOper.equalsIgnoreCase("Subtraction")) { System.out.println("Result of subtraction is: " + (a-b));}
        else if (MyOper.equalsIgnoreCase("Multiplication")) { System.out.println("Result of Multiplication is: " + (a*b));}
        else if (MyOper.equalsIgnoreCase("Division")) { System.out.println("Result of Division is: " + (a/b));}
        else if (MyOper.equalsIgnoreCase("Remainder")) { System.out.println("Remain from division is: " + (a%b));}
        else if (MyOper.equalsIgnoreCase("Modulus")) { System.out.println("Modulus for a firs number is " +Math.abs(a)+" and modulus for second number is "+Math.abs(b)+"." );}

    }
}

