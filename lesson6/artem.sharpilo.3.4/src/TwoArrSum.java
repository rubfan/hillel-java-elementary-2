import java.util.Arrays;

public class TwoArrSum {

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5};
        int[] b = new int[]{2, 4, 8, 9, 12};
        arrSum(a, b);
    }

    static void arrSum(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i1 = 0;

        int o;
        for(o = 0; o < c.length; ++o) {
            if (o < a.length) {
                c[o] = a[o];
            } else {
                c[o] = b[i1];
                ++i1;
            }
        }

        Arrays.sort(c);

        for(o = 0; o < c.length; ++o) {
            System.out.print(c[o] + " ");
        }

    }
}
