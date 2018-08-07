import java.util.Arrays;
import java.lang.Math;

public class HomeWork_6_2 {

    public static void main(String[] args) {

        //Lets generate two sorted arrays for this task:
        int a[] = GenerateArray(10);
        int b[] = GenerateArray(20);

        //Creating new array and putting contents fo first two arrays in it:
        int c[] = new int[a.length + b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        Arrays.sort(c);

        ShowArray(a);
        ShowArray(b);
        ShowArray(c);

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

    // And this method will output array ib cl;
    private static void ShowArray(int d[]) {
        for (int x = 0; x < d.length; x++) {
            System.out.print(d[x] + " ");
        }
        System.out.println(System.lineSeparator());
    }
}
