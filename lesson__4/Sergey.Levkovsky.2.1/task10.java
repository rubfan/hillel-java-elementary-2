package lesson4;

import java.util.Scanner;

public class task10 {
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

           String numbers = a.toString();

        }
    }
