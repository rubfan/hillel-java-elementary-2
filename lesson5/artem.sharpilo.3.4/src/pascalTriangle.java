/**
 * @author artem_sharpilo
 */

import java.util.Scanner;

public class pascalTriangle {


    /**
     calculation of calcFactorial
      @param f int
      @return int result
     */
     public int calcFactorial (int f){
        int result=1;
        for (int i=1; i<=f; i++){
            result*=i;
        }
        return result;
    }

    /**
     *  initialisation of array
     * @param  a [int][int]
     *
     */
     public void initArray(int[][] a) {

        int center=a.length/2;
        System.out.println(center);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int down= (calcFactorial(j)*(calcFactorial((i-j))));
                if (i==0 && j==0)
                {a[i][j]=1;}

                if (  i>0  && j >= 0 )
                {a[i][j]= calcFactorial(i)/down; }


                if (a[i][j]!=0) System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

    }
    /**
     * main method, scans for array size and shows PascalTriangle
     * @param args int
     */
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt() + 1;
        int[][] a = new int [size][size];
        pascalTriangle p = new pascalTriangle();
        p.initArray(a);

    }

}


