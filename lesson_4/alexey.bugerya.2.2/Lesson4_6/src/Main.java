import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static int[] array;
    private final static int MIN_SIZE = 10;
    private final static int MAX_SIZE = 20;
    private final static int MIN_VALUE = 0;
    private final static int MAX_VALUE = 10;

    public static void main(String[] args) {
        do {
            initArray(MIN_SIZE, MAX_SIZE, MIN_VALUE, MAX_VALUE);
            System.out.println("Your random array = " + Arrays.toString(array));
            findMaxAndPrint();
            findMinAndPrint();
        } while (oneMore());
    }

    private static void initArray (int minSize, int maxSize, int minValue, int maxValue) {
        int randomSize = ThreadLocalRandom.current().nextInt(minSize, maxSize +1);
        array = new int[randomSize];
        for (int i = 0; i < randomSize; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(minValue, maxValue +1);
        }
    }

    private static void findMaxAndPrint () {
        int max = MIN_VALUE;
        for (int i: array) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max value of this array is " + max);
    }

    private static void findMinAndPrint () {
        int min = MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Max value of this array is " + min);
    }


    private static boolean oneMore () {
        String answer;
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("\nOne more? [Y/N]");
                answer = input.next();
                if (answer.equals("y") || answer.equals("Y")) {
                    return true;
                }
                if (answer.equals("n") || answer.equals("N")) {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Wrong data entered. Try again typing some integer");
            }
        }
    }
}
