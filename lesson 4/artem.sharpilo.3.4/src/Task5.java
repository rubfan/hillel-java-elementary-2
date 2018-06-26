import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int much;
        int size;

        System.out.println("How much elements will be in array?");
        size = sc.nextInt();
        int[] a= new int[size];

        System.out.println("Input " + size + " numbers");
        for (int i=0; i<size; i++)
        {a[i]=sc.nextInt();}


        System.out.println("How much elements do you want to sum?");
        much= sc.nextInt();

        System.out.println("sum is: "+elementSum(a, much));
    }

    public static int elementSum (int[] a, int much) {
        int sum=0;

        for (int i = 0; i <much; i++){
            sum+=a[i];
        }
        return sum;

    }
}


