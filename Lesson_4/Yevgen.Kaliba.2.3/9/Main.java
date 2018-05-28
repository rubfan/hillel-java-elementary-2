package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            Scanner MyKeyb = new Scanner(System.in);
            System.out.println("Input number to convert:");
            int numToConv = MyKeyb.nextInt(),b;
            StringBuffer MyS = new StringBuffer();
             while (numToConv >0) {
                 if (numToConv%2==0) {
                     MyS.append (0);
                 }
                 else {
                     MyS.append (1);
                 }
                 numToConv = numToConv/2;
             }
        MyS.reverse();
        System.out.println("Your number in binary form is: "+MyS);
        }
}