public class Main {
//    Создайте функцию, которая заполняет 2-мерный массив треугольником
//    Паскаля (элемент, который на строчке ниже, равен сумме 2х верхних элементов,
//             которые стоят рядом; по бокам стоят единицы), изображение на картинке:
    private static int SIZE = 10;
    private static int [][] pascal = new int[SIZE][SIZE];

    public static void main(String[] args) {
        createPascalSides();
        fillPascalArray();
        printPascalArray();
    }

    private static void createPascalSides () {
        for (int i = 0; i<SIZE; i++) {
            pascal[i][0] = 1;
            pascal[i][i] = 1;
        }
    }

    private static void fillPascalArray () {
        for (int i = 2; i<SIZE; i++) {
            for  (int j = 1; j <= i-1; j++) {
                pascal[i][j] = pascal[i-1][j-1]+pascal[i-1][j];
            }
        }
    }

    private static void printPascalArray () {
        for (int i = 0; i < SIZE; i++) {
            StringBuilder eachPascalString = new StringBuilder();
            for (int j = 0; j <=i; j++) {
                eachPascalString.append(pascal[i][j]).append("\t");
            }
            System.out.println(eachPascalString.toString());
        }
    }
}
