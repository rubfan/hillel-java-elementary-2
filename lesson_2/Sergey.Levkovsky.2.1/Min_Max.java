import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Min_Max {
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

        System.out.println("A smaller number is" + " " + Collections.min(numbers) + " " + ", a higher number is" + " " + Collections.max(numbers));

    }
}

    
