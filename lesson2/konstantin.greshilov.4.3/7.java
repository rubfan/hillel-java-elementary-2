package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count, sum;
        count=in.nextInt();
        sum=40*count;
        if(count>7)
        {
            sum-=50;
        }
        else if (count>5)
        {
            sum-=20;
        }
        System.out.println(sum);
    }
}
