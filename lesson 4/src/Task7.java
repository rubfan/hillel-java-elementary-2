import java.util.Scanner;

public class Task7 {
    public static void main (String[] args){

        int size;
        System.out.println("Enter size of array:");
        Scanner sc= new Scanner(System.in);
        size= sc.nextInt();
        int[]a= new int[size];

        System.out.println("Input "+size+" numbers");
        for (int i=0; i<size; i++) {a[i]=sc.nextInt();}

        System.out.println("Sum of even elements is: "+sumEven(a));
        System.out.println("Sum of odd elements is: "+ sumOdd(a));
    }

    public static int sumEven (int[] a){
        int sum=0;
        for (int i=0; i<a.length; i++){
            if ((a[i]%2)==0) sum+=a[i];
        }
        return sum;
    }
    public static int sumOdd (int[] a){
        int sum=0;
        for (int i=0; i<a.length; i++){
            if ((a[i]%2)!=0) sum+=a[i];
        }
        return sum;
    }
}
