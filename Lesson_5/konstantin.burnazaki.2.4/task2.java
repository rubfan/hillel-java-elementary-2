public class task2 {
    public static void main(String[] args) {
        int[][] myArray = new int[15][15];
        spiralFillUp(myArray);
    }

    public static void spiralFillUp(int[][] arrayToFillUp) {
        for (int row = 0, reverse = 1, count = 1; row < arrayToFillUp.length; row++, reverse++) {
            for (int column = 0; column < arrayToFillUp[row].length; column++, count++) {
                if (reverse % 2 == 0) {
                    arrayToFillUp[row][arrayToFillUp[row].length - (column + 1)] = count;
                } else {
                    arrayToFillUp[row][column] = count;
                }
            }
        }
        for (int row = 0; row < arrayToFillUp.length; row++) {
            for (int column = 0; column < arrayToFillUp[row].length; column++) {
                System.out.print(arrayToFillUp[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
