import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class MinOf3With2numbers {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int a = A.nextInt();

        Scanner B = new Scanner(System.in);
        System.out.println("Enter number2: ");
        int b = B.nextInt();

        Scanner C = new Scanner(System.in);
        System.out.println("Enter number3: ");
        int c = C.nextInt();

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        System.out.print("A smaller number is" + " " + Collections.min(numbers));

        if (a == b ) {
            System.out.print(" " + " but u`ve entered few smaller numbers:" + a + " " + "and"+ " " + b);
        } else if (b == c) {
            System.out.print(" " + "but u`ve entered few smaller numbers:" + b + " " + "and"+ " " + c);
        } else if (a == c) {
            System.out.print(" " + "but u`ve entered few smaller numbers:" + a + " " + "and"+ " " + c);
        }

    }
}






