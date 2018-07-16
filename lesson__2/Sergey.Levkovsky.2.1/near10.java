import java.util.Scanner;
public class near10 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = A.nextInt();

        Scanner B = new Scanner(System.in);
        System.out.println("Enter number 2");
        int b = B.nextInt();

        int c = 10;
        double d = Math.abs(c - a);
        double e = Math.abs(c - b);
        if (d == e) {
            System.out.println("Your numbers are equidistant from" + " " + c);
        } else if (d > e) {
            System.out.println("Number" + " " + b + " " + "is nearest to" + " " + c );
        } else if (d < e) {
            System.out.println("Number" + " " + a + " " + "is nearest to" + " " + c );
        }
    }
}