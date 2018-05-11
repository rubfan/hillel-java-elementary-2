package ClosestTen;

import java.util.Scanner;

public class ClosestTen {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println ("Enter 1 number");


        int a=sc.nextInt();
        System.out.println("Enter 2 number");
        int b=sc.nextInt();
        int t1=0, t2=0;

        t1=10-a;
        t2=10-b;

        if (t1<0)
            t1*=-1;
        if (t2<0)
            t2*=-1;

        if (t1>t2)
            System.out.println(b + " " + "is closest to 10");
        else
            System.out.println(a + " " + "is closest to 10");

    }

}
