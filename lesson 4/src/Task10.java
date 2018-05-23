import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main (String[] args){

        int size;
        System.out.println("Enter size of array:");
        Scanner sc= new Scanner(System.in);
        size= sc.nextInt();
        int[]a= new int[size];

        System.out.println("Input "+size+" numbers");
        for (int i=0; i<size; i++) {a[i]=sc.nextInt();}
        fiveMin(a);
    }

    public static void fiveMin (int a[]){
        Arrays.sort(a);
        System.out.println("Result: ");
        for (int i=0; i<5; i++){
            System.out.println(a[i]);
        }
    }
}
