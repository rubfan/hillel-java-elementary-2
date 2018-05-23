package hw5;

import java.util.Scanner;

public class Homework5 {

    public static int size;

    public static void pascalTriangle(int size){
        int[][] arr = new int[size][size+1];
        System.out.println(arr[0][1] = 1);
        for (int i = 1; i < size; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print((arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j]) + "\t");
            }
            System.out.println();
        }
    }

    public static void spiral(int size){
        int[][] arr = new int[size][size];
        int j = 0, i = 0, a = 0, b = 1, end = size * size;

        while(a < end){
            if(j == size - b){
                arr[i][j] = end;
                break;
            }
            while(j < size - b){
                arr[i][j++] = ++a;
            }
            while(i < size - b){
                arr[i++][j] = ++a;
            }
            while(j > b - 1){
                arr[i][j--] = ++a;
            }
            while(i > b - 1){
                arr[i--][j] = ++a;
            }
            b++;
            i++;
            j++;
        }

        for (int k = 0; k < size; k++) {
            for (int l = 0; l < size; l++) {
                System.out.print(arr[k][l] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter Pascal's triangle size: ");
        size = scan.nextInt();
        pascalTriangle(size);
        System.out.println();

        System.out.print("Enter spiral size: ");
        size = scan.nextInt();
        scan.close();
        spiral(size);
    }
}