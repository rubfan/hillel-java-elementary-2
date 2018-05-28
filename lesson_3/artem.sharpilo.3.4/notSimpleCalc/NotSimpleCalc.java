package notSimpleCalc;

import java.util.Scanner;

public class NotSimpleCalc {
    public static void main (String[] args ){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter operation: (symbol or name of operation possible)");
        String operation = sc.next();
        System.out.println("Enter first number: ");
        int first= sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();

        String plus = "addition";
        String minus = "subtraction";
        String multiply = "multiplication";
        String divide = "division";
        String remaind= "remainder";
        String mod = "modulus";
        if (operation.equals("addition")||operation.equals("+"))
        System.out.println(first+"+"+second+" = "+(first+second));
        if (operation.equals("substaction")||operation.equals("-"))
        System.out.println(first+" - "+second+ " = "+(first-second));
        if (operation.equals("multiplication")||operation.equals("*"))
        System.out.println(first+" * "+second+ " = "+ (first*second));
        if (operation.equals("division")||operation.equals("/"))
        System.out.println(first+" / "+second+ " ="+ ((double)first/second));
        if (operation.equals("remainder")||operation.equals("%"))
        System.out.println(first+" % "+second+ " = "+ (first%second));
        if (operation.equals("modulus")||operation.equals("abs"))
        System.out.println(first+" mod "+second+ " = "+ (Math.abs(first))+" and "+ Math.abs(second));



    }
}
