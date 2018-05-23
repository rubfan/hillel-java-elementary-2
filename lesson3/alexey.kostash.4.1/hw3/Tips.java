package hw3;

import java.util.Scanner;

public class Tips {
    static int bill;
    static String serviceRank;
    static int payment;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter service rank (terrible, poor, good, great or excellent): ");
        serviceRank = scan.nextLine();
        System.out.print("Enter your bill: ");
        bill = scan.nextInt();
        scan.close();
        switch (serviceRank){
            case "terrible": payment = bill;
            break;
            case "poor": payment = (int)(bill * 1.05);
            break;
            case "good": payment = (int)(bill * 1.1);
            break;
            case "great": payment = (int)(bill * 1.15);
            break;
            case "excellent": payment = (int)(bill * 1.2);
            break;
        }
        System.out.println("Payment = " + payment);
    }
}
