package MinMaxofThree;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println ("Enter 1 number");
        int a=sc.nextInt();
        System.out.println ("Enter 2 number");
        int b=sc.nextInt();
        System.out.println ("Enter 3 number");
        int c=sc.nextInt();
        int min=0, max=0;

        if (a>b&&a>c)
            max=a;
        else if (b>a&&b>c)
            max=b;
        else if (c>a&&c>b)
            max=c;
        if (a<b&&a<c)
            min=a;
        else if (b<a&&b<c)
            min =b;

        else if (c<a&&c<b)
            min=c;


        System.out.println("Max"+" "+max);
        System.out.println("Min"+" "+min);
    }
}
