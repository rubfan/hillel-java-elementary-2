import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 8, 9, 12};
        int[] c = new int[a.length+b.length];

        if(b.length < a.length){
            int temp[] = a;
            a = b;
            b = temp;
        }

        for (int i = 0; i < c.length; i++) {
            int min;
            if(a.length != 0 && a[0] < b[0]){
                min = a[0];
                a = Arrays.copyOfRange(a,1,a.length);
            }else {
                min = b[0];
                b = Arrays.copyOfRange(b,1,b.length);
            }
            c[i] = min;
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}