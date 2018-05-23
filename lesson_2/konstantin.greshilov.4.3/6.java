package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b;
        a=in.nextDouble();
        b=in.nextDouble();
        if (Math.abs(10-a)<Math.abs(10-b))
        {
            System.out.println(a);
        }
        else if (Math.abs(10-a)>Math.abs(10-b))
        {
            System.out.println(b);
        }
        else
        {
            System.out.println("Оба числа одинаково близки к 10");
        }
    }
}
