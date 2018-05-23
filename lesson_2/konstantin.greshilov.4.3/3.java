package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double array[] = new double [3];
        for(int i=0; i<3; i++)
        {
            array[i]=in.nextDouble();
        }
       for(int i=0; i<2; i++)
       {
           for (int j=2; j>i; j--)
           {
               if(array[j]<array[j-1])
               {
                   double temp=array[j];
                   array[j]=array[j-1];
                   array[j-1]=temp;
               }
           }
       }
        System.out.print("Минимальные числа: " + array[0] + " ");
        if(array[1]==array[0])
        {
            System.out.print(array[1] + " ");
            if (array[2]==array[1])
            {
                System.out.println(array[2]);
            }
        }


    }
}
