package MinOfThree;

import java.util.Scanner;

public class Main
{
    public static void main (String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println ("Enter 1 number");
        int a=sc.nextInt();
        System.out.println ("Enter 2 number");
        int b=sc.nextInt();
        System.out.println ("Enter 3 number");
        int c=sc.nextInt();
        int min=0;
        if (a>b&&b<c)
        {
            min=b;
        }
         else if (a>c&&b>c)
        {
            min=c;
        }
        else min=a;
        System.out.println("Minimum of three numbers is  "+min);
    }
}
