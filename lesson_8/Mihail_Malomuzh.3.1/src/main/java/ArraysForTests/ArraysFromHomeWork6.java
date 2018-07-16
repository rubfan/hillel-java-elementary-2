package ArraysForTests;

import java.util.Arrays;

public class ArraysFromHomeWork6 {

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

    public static boolean Sum(int[] a, int sum){
        int max = Arrays.binarySearch(a, sum + 1 - a[0]);
        if (max < 0) max = Math.min(- max - 1, a.length - 1);

        int min = Arrays.binarySearch(a, (sum - 1 )  / 2 );
        if (min < 0) min = Math.min(- min - 1, a.length - 1);

        for (int i = max; i >= min; i--){
            int s = Arrays.binarySearch(a, 0, max , sum - a[i]);
            if (s >= 0) {
                //   System.out.println(a[i] + " " + a[s]);
                return true;
            }
        }
        return false;
    }
}
