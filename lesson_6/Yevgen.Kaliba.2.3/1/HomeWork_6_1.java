import java.util.Scanner;

public class HomeWork_6_1 {

    public static void main(String[] args) {

        int x5, z5, arMin = 0;
        Scanner MyKeyb = new Scanner(System.in);

        System.out.println("Input array lengh:");
        int arrLengh = MyKeyb.nextInt();

// Recording time of script start
        long startTime = System.currentTimeMillis();

//Generating array and putting it on screen
        int MyIntAr[] = new int[arrLengh];
        for (x5 = 0; x5 < MyIntAr.length; x5++) {
            MyIntAr[x5] = (int) (Math.random() * 5000);
            System.out.println(x5 + " " + MyIntAr[x5]);
        }

//looking for minimum value in array
        for (z5 = 1; z5 < MyIntAr.length; z5++) {
            if (MyIntAr[z5] < MyIntAr[arMin]) {
                arMin = z5;
            }
        }

//Recording time of script end
        long endTime = System.currentTimeMillis();
// Getting result on the screen
        System.out.println("Minimum value of array is " + MyIntAr[arMin] + ", and it took " + (endTime - startTime) + " milliseconds to find it.");
    }
}
