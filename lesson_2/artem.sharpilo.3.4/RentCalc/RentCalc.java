package RentCalc;

import java.util.Scanner;

public class RentCalc {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println ("Enter amount of days rent");
        int days=sc.nextInt();
        int price=40;

        int total=days*price;
        if (days>=5&&days<7)
            total-=20;
        if(days>=7)
            total-=50;
        System.out.println("Total sum is"+" "+ total + " UAH");
    }
}
