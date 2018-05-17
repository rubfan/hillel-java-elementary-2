import java.util.Scanner;

public class ToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print number: ");
        int n = sc.nextInt();
        System.out.print("Number " + n + " to binary: ");

        boolean sign = n>=0;
        n = Math.abs(n);

        int b = 0;
        for (int i = 1; n > 0 ; i*=10) {
            b += i*(n%2==1 ? 1:0);
            n /= 2;
        }
        if(!sign)System.out.print("-");
        System.out.print(b);
    }
}
