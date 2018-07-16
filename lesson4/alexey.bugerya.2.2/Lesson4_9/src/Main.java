import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        do {
            int i = enterInt();
            System.out.println(Integer.toBinaryString(i));
        }while (oneMore());
    }

    private static int enterInt () {
        boolean entered = false;
        int i = 0;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter some integer to convert it to binary:");
                i = input.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong data entered. Try again typing some integer");
                continue;
            }
            entered = true;
        } while (!entered);
        return i;
    }

    private static boolean oneMore () {
        String answer;
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("\nOne more? [Y/N]");
                answer = input.next();
                if (answer.equals("y") || answer.equals("Y")) {
                    return true;
                }
                if (answer.equals("n") || answer.equals("N")) {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Wrong data entered. Try again typing some integer");
            }
        }
    }
}
