import java.util.Scanner;

public class Task9 {
    public static void main (String[] args){
        int num;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number needed to Binary:");
        num= sc.nextInt();

        System.out.println("Result: "+Integer.toBinaryString(num));

    }
}
