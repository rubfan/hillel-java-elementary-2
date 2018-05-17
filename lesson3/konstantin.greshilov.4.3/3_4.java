package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String service;
        double sum = in.nextDouble();
        service=in.next();
        if (service.equals("terrible"))
        {
            System.out.println(0);
        }
        else if (service.equals("poor"))
        {
            System.out.println((sum/100)*5 + sum);
        }
        else if (service.equals("good"))
        {
            System.out.println((sum/100)*10 + sum);
        }
        else if (service.equals("great"))
        {
            System.out.println((sum/100)*15 + sum);
        }
        else if (service.equals("excellent"))
        {
            System.out.println((sum/100)*20 + sum);
        }

    }
}
