package lesson4;
import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        System.out.println("Enter ur number");
        Scanner x =  new Scanner(System.in);
        int a = x.nextInt();

        String convert = Integer.toBinaryString(a);
        System.out.println(convert + " is ur binary number");
    }
    }
