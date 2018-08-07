import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter your number:");
        int a = Keyboard.nextInt();
        if (a % 2 == 0) {
            System.out.println("Your number is EVEN!!!");
        } else {
            System.out.println("Your number is ODD!!!");
        }
    }
}
