package lesson5;

import java.util.Scanner;

class practice {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter number of strings");
        int strings = a.nextInt();
        System.out.println("enter number of columns");
        int columns = a.nextInt();
        int[][] array = new int[strings][columns];
        int z = 1;                                         //создаем массив с количество строк и столбцов введеных с клавиатуры

         for (int y = 0; y < columns; y++) {                //заполняем первую строку массива
            array[0][y] = z;
                    z++;
        }
         for (int x = 1; x < strings; x++) {                // заполняем крайний столб массива
            array[x][columns - 1] = z;
            z++;
        }
         for (int y = columns - 1; y >= 0; y--) {           //заполняем нижную строку массива
            array[strings - 1][y] = z;
            z++;
        }
         for (int x = strings - 2; x > 0; x--) {            //заполняем первый столб массива
            array[x][0] = z;
            z++;
        }
            int c = 1;
            int d = 1;
         while (z < strings * columns) {                    //заполняем центр массива
         while (array[c][d + 1] == 0) {
                array[c][d] = z++;
                d++;
        }
            while (array[c + 1][d] == 0) {
                array[c][d] = z++;
                c++;
        }
            while (array[c][d - 1] == 0) {
                array[c][d] = z++;
                d--;
        }
        }
            for (int x = 0; x < strings; x++) {
            for (int y = 0; y < columns; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = z;
                }
            }
        }
            for (int x = 0; x < strings; x++) {
                for (int y = 0; y < columns; y++) {
                    if (array[x][y] < 10) {

                        System.out.print(array[x][y] + "  ");
                    } else {
                        System.out.print(array[x][y] + " ");
                    }
                }
                System.out.println("");

            }
        }
    }




