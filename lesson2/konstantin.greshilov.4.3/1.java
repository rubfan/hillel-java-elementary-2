package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        System.out.println("Минимальное число: " + Math.min(Math.min(a,b),c));

    }
}
