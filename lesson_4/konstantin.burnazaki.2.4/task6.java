import java.util.Arrays;
import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        int i[] = new int[10];
        findMinMaxNumber(i);

    }

    public static void findMinMaxNumber(int[] sample){
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            sample[i] = rand.nextInt();
            System.out.println(sample[i]);
        }

        Arrays.sort(sample);
        System.out.println("Min value: " + sample[0]);
        System.out.println("Max value: " + sample[sample.length - 1]);
    }
}
