package com.company;


public class Main {

    public static void main(String[] args) {
        String operation;
        operation=args[0];
        int firstOperand= Integer.parseInt(args[1]);
        int secondOperand=Integer.parseInt(args[2]);
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
