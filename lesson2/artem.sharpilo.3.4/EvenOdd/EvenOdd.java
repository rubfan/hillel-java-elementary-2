package EvenOdd;

import java.util.Scanner;

public class EvenOdd {
    public static void main (String[ ] args){

        Scanner sc= new Scanner(System.in);
        System.out.println ("Enter number");
        int a=sc.nextInt();

        if (a%2==0)
            System.out.println("Even");
        else System.out.println("Odd");
    }
}
