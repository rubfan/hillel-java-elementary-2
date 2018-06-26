// сложность алгоритма сортировки О(n^2)
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        selectionSort(a);
        long SpentTime = System.currentTimeMillis() - startTime;
        System.out.println("Run takes : " + SpentTime / 1000L + " sec");
    }

    public static void selectionSort(int[] a) {
        int i;
        for(i = 0; i < a.length; ++i) {
            a[i] = (int)(Math.random() * 1.0E8D + 1.0D);
        }

        for(i = 0; i < a.length - 1; ++i) {
            int min = i;

            for(int j = 1; j < a.length; ++j) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        System.out.println("Minimal number is " + a[0]);
    }
}
