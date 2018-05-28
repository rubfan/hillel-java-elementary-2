import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Asking for manual sum input
        Scanner myScaner = new Scanner(System.in);
        System.out.println("Input sum to find:");
        int sum = myScaner.nextInt();

        //First, let me generate new sorted array:
        int myArr[] = GenerateArray(100);
        ShowArray(myArr);

        //Finding sum of every two elements in array, and comparing it to sum;

        for (int a = 0; a < myArr.length; a++) {
            for (int b = 0; b < myArr.length; b++) {
                if (myArr[a] + myArr[b] == sum) {
                    System.out.println(myArr[a] + "+" + myArr[b]);
                }
            }
        }
    }

    // This method i will use for random int array generation;
    private static int[] GenerateArray(int z) {
        int tempAr[] = new int[z];
        for (int x = 0; x < z; x++) {
            tempAr[x] = (int) (Math.random() * 50);
        }
        Arrays.sort(tempAr);
        return tempAr;
    }

    // And this method will output array in cl;
    private static void ShowArray(int d[]) {
        for (int x = 0; x < d.length; x++) {
            System.out.print(d[x] + " ");
        }
        System.out.println(System.lineSeparator());
    }
}
