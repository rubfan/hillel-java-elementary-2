import java.util.Arrays;
import java.util.Random;

public class task10 {

    public static void main(String[] args) {
        int listOfNums[] = new int[10];
        findFiveMinimalValues(listOfNums);

    }

    public static void findFiveMinimalValues(int[] sample){
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            sample[i] = rand.nextInt();
            System.out.println(sample[i]);
        }

        Arrays.sort(sample);
        for(int i = 0; i < 5; i++){
            System.out.println((i+1) + ") Minimal value " + sample[i]);
    }
}
}
