import java.util.Arrays;

public class TwoArrSum {
    public static void main (String[] args){
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 8, 9, 12};
        arrSum(a,b);

    }

    static void arrSum (int[]a, int[] b){
        int[] c= new int[a.length+b.length];
        int i1=0;
        for (int i=0; i<c.length; i++){
            if (i < a.length) c[i]=a[i];
            else {c[i]=b[i1];
            i1++;}

        }
        Arrays.sort(c);

        int o=0;
        while (o<c.length)
        {
            System.out.print(c[o] + " ");
        o++;}

    }
}
