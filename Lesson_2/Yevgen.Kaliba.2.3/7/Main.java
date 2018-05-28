import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {

        System.out.println("RENT COST CALCULATION");
        System.out.println("Enter rent period, days:");
        Scanner Keyboard = new Scanner(System.in);
        int days = Keyboard.nextInt();
        int rent = days * 40;
        int discount = 0;
        if(days > 5) {discount = 20;}
        if(days > 7) {discount = 50;}
        rent = rent - discount;
        System.out.println("Your rent will cost "+rent);

        }
    }