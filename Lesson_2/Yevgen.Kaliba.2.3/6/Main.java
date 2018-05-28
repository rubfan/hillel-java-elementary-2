import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = Keyboard.nextInt();
        System.out.println("Enter second number:");
        int b = Keyboard.nextInt();
        System.out.println("Checking the nearest to 10 number...");
            if((Math.abs(a-10)) < (Math.abs(b-10))) {
                System.out.println("Nearest number to 10 is: "+a);
             }
            else if((Math.abs(a-10)) > (Math.abs(b-10))) {
                System.out.println("Nearest number to 10 is: " + b);
            }
            else if ((Math.abs(a-10)) == (Math.abs(b-10))) {
                System.out.println("The numbers are same far from 10!");}

        }
    }


