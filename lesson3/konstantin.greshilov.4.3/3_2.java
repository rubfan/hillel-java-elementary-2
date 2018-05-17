package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String operation;
        operation=in.next();
        int firstOperand=in.nextInt();
        int secondOperand=in.nextInt();
        double result=0;
        if (operation.equals("abs"))
        {
            result=Math.abs(firstOperand);
        }
        else if (operation.equals("add"))
        {
            result=firstOperand+secondOperand;
        }
        else if (operation.equals("sub"))
        {
            result=firstOperand-secondOperand;
        }
        else if (operation.equals("div"))
        {
            result=firstOperand/secondOperand;
        }
        else if (operation.equals("mod"))
        {
            result=firstOperand%secondOperand;
        }
        System.out.println(result);
    }
}
