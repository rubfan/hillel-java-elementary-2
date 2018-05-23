import java.util.Scanner;

public class Spiral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print spiral's size: ");
        int len = sc.nextInt();
        int spiral[][] = new int[len][len];

        int k = 0, l = 0;
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral.length; j++) {
                spiral[k][l] = j + 1 + i * spiral.length;
                if (k == spiral.length - len && l < len - 1) {
                    l++;
                } else if (k < len - 1 && l == len - 1) {
                    k++;
                } else if (k == len - 1 && l > spiral.length - len) {
                    l--;
                } else if (k > spiral.length - len + 1) {
                    k--;
                } else {
                    l++;
                    len--;
                }
            }
        }
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral.length; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
    }
}