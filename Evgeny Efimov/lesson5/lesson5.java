public class lesson5 {
    public static void main(String[] args) {
        pascalTriangle(10);
    }
    public static void pascalTriangle(int lines) {
        int[][] arr = new int[10][];
        for (int i = 0; i < 2; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;
            }
        }

        for (int i = 2; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                arr[i][i] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
