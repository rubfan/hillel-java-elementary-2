import java.util.Scanner;

public class Task6 {
    public static void main (String[] args){

        int size;
        System.out.println("Enter size of array:");
        Scanner sc= new Scanner(System.in);
        size= sc.nextInt();
        int[]a= new int[size];

        System.out.println("Input "+size+" numbers");
        for (int i=0; i<size; i++) {a[i]=sc.nextInt();}

        System.out.println("Minimal element is: "+minOfArray(a));
        System.out.println("Maximum element is: "+maxOfArray(a));
    }

    public static int minOfArray (int[] a){
        int min=a[0];
        for (int i=1; i<a.length; i++){
            if (min>a[i]) min=a[i];
        }
        return min;
    }
    public static int maxOfArray (int[] a){
        int max=a[0];
        for (int i=1; i<a.length; i++){

            if (max<a[i]) max=a[i];
        }
        return max;
    }
}
