
/**This class calculates Pascal Triangle
 * @author artem.sharpilo
**/
import java.util.Scanner;

public class pascalTriangle {

    /**
     * Main class. Takes array size from scanner and run program.
     * @param args String
     */
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt() + 1;
        int[][] a = new int [size][size];
        initArray(a);

    }

    /**
     *
     * @param f int
     * @return factorial
     */

     public static int calcFactorial (int f){

        int result=1;
        for (int i=1; i<=f; i++){
            result*=i;
        }
        return result;
    }

    /**
     *
     * @param a int[][]
     */
    public static void initArray(int[][] a) {


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

}


