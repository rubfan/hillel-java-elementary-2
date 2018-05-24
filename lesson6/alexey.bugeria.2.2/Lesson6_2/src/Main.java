import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 8, 9, 12};
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
