public class task1 {
    public static void main(String[] args) {
        int[][] myArr = new int[9][19];
        paskalTriangle(myArr);
    }

    public static void paskalTriangle(int[][] emptyArr) {
        if (emptyArr[0].length % 2 == 0) {
            System.out.println("Number of columns must be odd");//in order to centralize the triangle column number must be odd
        } else {
            int centerColumn = emptyArr[0].length / 2;
            for (int i = 0, expansion = 0; i < (emptyArr.length - 1); i++, expansion++) {
                if (expansion <= (emptyArr[i].length / 2)) {//assignment of "1" along catheters of the triangle
                    emptyArr[i][centerColumn - expansion] = 1;
                    emptyArr[i][centerColumn + expansion] = 1;
                }
                for (int j = 0; j < emptyArr[i].length - 2; j++) {//"-2" condition to avoid ArrayIndexOutOfBoundsException
                    if (expansion == (emptyArr[i].length / 2)){//purpose of this condition is to limit the triangle with "hypotenuse"
                        break;
                    }
                    if ((emptyArr[i][j] > 0) && (emptyArr[i][j + 2] > 0)){//assignment of lower cells with sum of higher two
                        emptyArr[i + 1][j + 1] = emptyArr[i][j] + emptyArr[i][j + 2];
                }
                }
            }
            for (int i = 0; i < emptyArr.length; i++) {//printing out
                for (int j = 0; j < emptyArr[i].length; j++) {
                    System.out.print(emptyArr[i][j] + "\t");
                }
                System.out.println();

            }
        }

    }
}
