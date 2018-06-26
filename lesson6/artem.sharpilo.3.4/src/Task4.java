
public class Task4 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 8, 9, 10};
        int sum = 15;
        System.out.println(CheckArr(a, sum));
    }

    static boolean CheckArr(int[] a, int sum) {
        int res = 0;

        for (int i = 0; i < a.length - 1; ++i) {
            if (a[i] + a[i + 1] == sum) {
                ++res;
            }
        }

        return res > 0;
    }
}