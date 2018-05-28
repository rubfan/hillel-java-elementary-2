import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
  System.out.println("Enter first number:");
        int a = Keyboard.nextInt();
        System.out.println("Enter second number:");
        int b = Keyboard.nextInt();
        System.out.println("Checking the reminder...");
        if (a % b == 0) {
            System.out.println("YES!!!");
        } else {
            System.out.println("NO!!!");
        }
    }
}

