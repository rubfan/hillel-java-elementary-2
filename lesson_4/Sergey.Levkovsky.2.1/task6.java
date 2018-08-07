package lesson4;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int[] a;
        Scanner A = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = A.nextInt();
        a = new int[n];
        for (int i = 0; i <= (n - 1); i++) { //Принимаем все числа массива
            Scanner B = new Scanner(System.in);
            System.out.println("Enter" + " " + i + " " + "number of the array");
            int b = B.nextInt();
            a[i] = b;
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            if(a[i] < min)
            min = a[i];
        }
        System.out.println("minimum value is " + max);
        System.out.println("maximum value is " + min);
    }
}