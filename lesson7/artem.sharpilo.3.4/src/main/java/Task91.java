import java.util.Arrays;
import java.util.Scanner;

public class Task91 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your e-mail address: ");
        String s = scan.nextLine();
        changeEmail(s);
    }


    static void changeEmail(String s) {
        String a1 = s.replace(".", "[ dot ]");
        String a = a1.replace("@", "[ at ]");

        System.out.println(a);

    }

}
