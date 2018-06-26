import java.util.Arrays;
import java.util.Scanner;
/* Время зависит от позиции минимального элемента, в худшем случае O(N^2);
*/
public class Task1 {
    public static void main (String[] args){
        long startTime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int[] a= new int[sc.nextInt()];

        selectionSort(a);
        long SpentTime = System.currentTimeMillis() - startTime;
        System.out.println("Run takes : " + SpentTime/1000 + " sec");
    }

    public static void selectionSort(int[] a){
        int min, temp;
        for (int i=0; i< a.length; i++){
            a[i]=(int)(Math.random()*100000000+1);
        }
        for (int i=0; i<a.length-1; i++) {
            min = i;
            for (int j=1; j<a.length; j++){
                if (a[j] < a[min]){
                    min=j;
                }
            }
            temp= a[min];
            a[min]=a[i];
            a[i]=temp;

        }
        System.out.println("Minimal number is " + a[0]);
    }

}
