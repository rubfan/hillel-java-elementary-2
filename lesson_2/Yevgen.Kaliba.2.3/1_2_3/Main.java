import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = Keyboard.nextInt();
        System.out.println("Enter second number:");
        int b = Keyboard.nextInt();
        System.out.println("Enter third number:");
        int c = Keyboard.nextInt();

        int mini = Math.min(a, Math.min(b, c));
        int maxi = Math.max(a, Math.max(b, c));

        if ((a == b || b == c || a == c)) {
            System.out.println("Minimum nubmer is here twice, and it is: " + mini);
        } else {
            System.out.println("Minimum number is:" + " " + mini);
        }
        System.out.println("Maximum number is:" + " " + maxi);
    }
}

