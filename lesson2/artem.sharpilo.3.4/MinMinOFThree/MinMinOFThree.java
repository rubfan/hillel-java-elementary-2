package MinMinOFThree;

import java.util.Scanner;

public class MinMinOFThree {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter 1 number");
        int a=sc.nextInt();
        System.out.println("Enter 2 number");
        int b=sc.nextInt();
        System.out.println("Enter 3 number");
        int c=sc.nextInt();
        int min=0;

        if (a>b&&b<=c)
        {
            min=b;
        }
        else if (a>c&&b>c)
        {
            min=c;
        }
        else min=a;

        if(a==b&&a==c&&a==min)
            System.out.println(min+" "+ min + " " + min);
        else

        if(a==b&&a==min||a==c&&a==min||b==c&&b==min)
            System.out.println(min+" "+ min);
        else
        System.out.println(min);
    }
}
