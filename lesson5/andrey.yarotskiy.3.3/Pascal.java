import java.util.Scanner;

public class Pascal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print triangle's size: ");
        int len = sc.nextInt();
        int triangle[][] = new int[len][len];
        triangle = fillTriangle(triangle);
        printTriangle(triangle);
    }
    public static int[][] fillTriangle(int triangle[][]){
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle.length; j++) {
                if(j>i) triangle[i][j] = 0;
                else if(j==0 || i==j) triangle[i][j] = 1;
                else {
                    triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
                }
            }
        }
        return triangle;
    }

    public static void printTriangle(int[][] traingle) {
        for (int i = 0; i < traingle.length; i++) {
            for (int j = 0; j < traingle.length; j++) {
                if (j <= i) {
                    if(j == 0) System.out.print(repeat("\t",traingle.length-i-1) + traingle[i][j]);
                    else System.out.print("\t\t" + traingle[i][j]);
                }
            }
            System.out.println();

        }
    }

    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }

}
