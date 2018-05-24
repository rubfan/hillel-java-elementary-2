import java.util.Arrays;
import java.util.Random;

/**
 * Homework 6
 * @author  Mihail Malomuzh
 * @version 1.0
 */


public class HW6 {

    /**
     * Selection Sort
     * Difficulty O(n^2), n = array length;
     * @param a  array for sorting;
     */

    public static void SelectionSort(int[] a){
        int minIndex ;
        for (int i = 0; i < a.length; i++){
            minIndex = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[minIndex]) minIndex = j;
            if (minIndex != i){
                a[minIndex] = a[minIndex]^a[i];
                a[i] = a[i]^a[minIndex];
                a[minIndex] = a[minIndex]^a[i];
            }
        }
    }

    /**
     * Merge of two sorted arrays.
     * Difficulty O(n + m); n = a.length; m = b.length;
     * @param a,b sorted arrays
     * @return array, array.length = a.length + b.length;
    */
    public static int[] Merge(int[] a, int[] b){
        int i = 0; int aLength = a.length;
        int j = 0; int bLength = b.length;
        int[] res = new int[aLength + bLength];
        for (int k = 0; k < aLength + bLength; k++ ){
            if ((i < aLength) && (j < bLength)){
                if (a[i] > b[j]) res[k] = b[j++];
                else res[k] = a[i++];

            }else{
                if (i < aLength) res[k] = a[i++];
                else res[k] = b[j++];
            }
        }
        return res;
    }

    /**
     * The method try to find two elements of the sorted array, the sum of which is equal to the specified value;
     * Difficulty O(n*ln(n)); n = a.length;
     * @param a sorted array
     * @param sum integer value;
     * @return  true if the numbers are found, or false otherwise
     */

    public static boolean Sum(int[] a, int sum){
        int max = Arrays.binarySearch(a, sum + 1 - a[0]);
        if (max < 0) max = Math.min( -max - 1 , a.length - 1);

        int min = Arrays.binarySearch(a, sum  / 2 );
        if (min < 0) min = Math.min(-min - 2, a.length - 1);

        for (int i = max; i > min; i--){
            int s = Arrays.binarySearch(a, 0, i , sum - a[i]);
            if (s >= 0) {
             //   System.out.println(a[i] + " " + a[s]);
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){

        Random rnd = new Random();
        int[] a = new int[10 + rnd.nextInt(20)];
        for (int i = 0; i < a.length; i++)
            a[i]= rnd.nextInt(200) - 100;
        System.out.println("       Array = " + Arrays.toString(a));

        // task 1
        SelectionSort(a);
        System.out.println("Sorted Array = " + Arrays.toString(a));

        //task 2
        int[] b = {1, 3, 5};
        int[] c = {2, 4, 8, 9, 12};
        System.out.println("Merged Arrays = " + Arrays.toString(Merge(b,c)));

        //task 3
        //Определите сложность следующего алгоритма:
        //https://gist.github.com/anonymous/939fd2dac71cd9dad1e90432d9bbcc59
        //Difficulty O(n^3);
        //Number of operations approximately = 1/6*n^3

        //task 4
        int sum = 19;
       // for (int i = 0; i < 100_000_000; i++) Sum(a, sum);
        System.out.println("Sum = " + sum +" in Sorted Array = " + Sum(a, sum));


    };
}
