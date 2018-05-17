package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        a=in.nextInt();
        b=in.nextInt();
        if (a%b==0)
        {
            System.out.println("Делится без остатка");
        }
        else
        {
            System.out.println("Делится с остатком");
        }
    }
}
