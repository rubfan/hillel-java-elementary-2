import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class HW1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println("Print 3 numbers:");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.printf("Min from {%d,%d,%d} is %d\n",a,b,c,min(a,b,c));

        System.out.print("All min values: ");
        ArrayList<Integer> minArr = All_min(a,b,c);
        for(int i = 0; i < minArr.size(); i++){
            System.out.print(minArr.get(i)+" ");
        }

        System.out.println("\n\nPrint number:");
        int parity = in.nextInt();
        System.out.println("Number " + parity + " is " + (parity%2==0?"even":"odd"));

        System.out.println("Print 2 numbers:");
        int divided = in.nextInt();
        int divider = in.nextInt();
        System.out.printf("Number %d is divided by %d ",divided,divider);
        if(divided%divider==0) System.out.println("without remainder");
        else System.out.println("with remainder equal to " + divided%divider);

        System.out.println("Print 2 numbers:");
        int v1 = in.nextInt(), v2 = in.nextInt();
        int dist1 = Math.abs(10 - v1);
        int dist2 = Math.abs(10 - v2);
        System.out.println("Value " + (dist1<dist2?v1:v2) + " is closer to 10");

        System.out.print("Print Amount of days: ");
        int days = in.nextInt();
        int price = 40*days;
        if(days > 7) price -= 50;
        else if(days > 5) price -= 20;
        System.out.println("Price is " + price);


    }

    public static int min(int a, int b, int c){
        int min = a < b ? a:b;
        return c < min ? c:min;
    }

    public static ArrayList<Integer> All_min(int a, int b, int c){
        int min = min(a,b,c);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(a==min) arr.add(a);
        if(b==min) arr.add(b);
        if(c==min) arr.add(c);
        return arr;
    }
}