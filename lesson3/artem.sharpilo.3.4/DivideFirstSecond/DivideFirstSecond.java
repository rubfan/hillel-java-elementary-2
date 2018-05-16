package DivideFirstSecond;


import java.util.Scanner;

public class DivideFirstSecond {
    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println ("Enter 1 number");
        int a=sc.nextInt();
        System.out.println("Enter 2 number");
        int b=sc.nextInt();

        if (a%b==0)
        System.out.println("We can divide");
        else System.out.println("We can't divide");
    }
}
