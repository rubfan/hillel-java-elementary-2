package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a=in.nextInt();
        if (a%2==0)
        {
            System.out.println("Число четное!");
        }
        else
        {
            System.out.println("Число нечетное!");
        }
    }
}
