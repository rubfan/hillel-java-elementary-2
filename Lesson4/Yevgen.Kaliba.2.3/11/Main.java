import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            Scanner MyKeyb = new Scanner(System.in);
            System.out.println("Input number for digital root search:");
            int a = MyKeyb.nextInt();
            while (a>=10) {
                a = DigitSum(a);
            }
            System.out.println("Digital root for your number is "+a+".");
}
    public static int DigitSum(int b) {
        int x=0;
        while (b>=1) {
            x=x+b%10;
            b=b/10;
        }
        return x;
    }
}