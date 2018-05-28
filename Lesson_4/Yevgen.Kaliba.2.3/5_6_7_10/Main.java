import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x5,numToCount=0,z5, mySum=0, arMax=0, arMin=0, sumOdd=0, sumEven=0;
        Scanner MyKeyb=new Scanner(System.in);

        //Generating array and putting it on screen
        int MyIntAr[] = new int[100];
           for (x5=0; x5<MyIntAr.length; x5++) {
               MyIntAr[x5] = (int) (Math.random() * 50);
               System.out.println(x5 + " " +MyIntAr[x5]);
           }
        //Asking for number of elements to count, and counting elements
        System.out.println("Enter number of elements you want to count: ");
           numToCount = MyKeyb.nextInt();
           for (z5=0; z5<numToCount; z5++) {
               mySum += MyIntAr[z5];
           }
        System.out.println("Sum of the first "+numToCount+ " elements = "+mySum );

        //looking for maximum and minimum value in array
        for (z5=1; z5<MyIntAr.length; z5++) {
            if (MyIntAr[z5] > MyIntAr[arMax]) {
                arMax=z5;
            }
            else if (MyIntAr[z5] < MyIntAr[arMin]) {
                arMin = z5;
            }
        }
        System.out.println("Minimum value of array is "+MyIntAr[arMin]+", and maximum value is "+MyIntAr[arMax]+".");

        //looking for the sum of all even and odd elements of an array

        for (z5=0; z5<MyIntAr.length; z5++) {
            if (MyIntAr[z5] % 2 == 0) {
                sumEven+=MyIntAr[z5];
            }
            else if (MyIntAr[z5] % 2 != 0){
                sumOdd+=MyIntAr[z5];
            }
        }
        System.out.println("Sum of EVEN numbers ib array is "+sumEven+", and sum of ODD numbers is "+sumOdd+".");

        //Looking for first five minimum array elements
        System.out.print("First 5 minimal values in this array are: ");
        Arrays.sort(MyIntAr);
        for (z5=0;z5<5;z5++){
            System.out.print(MyIntAr[z5]+", ");
        }
   }
}
