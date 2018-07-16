import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static int[] array;
    private static int expectedSum;
    private final static int MIN_SIZE = 5;
    private final static int MAX_SIZE = 10;
    private final static int MIN_VALUE = 0;
    private final static int MAX_VALUE = 10;

    public static void main(String[] args) {
        do {
            initArray(MIN_SIZE, MAX_SIZE, MIN_VALUE, MAX_VALUE);
            System.out.println("Your random array = " + Arrays.toString(array));
            expectedSum = enterExpectedSum();
            checkIfSum();
        } while (oneMore());
    }

    private static void initArray (int minSize, int maxSize, int minValue, int maxValue) {
        int randomSize = ThreadLocalRandom.current().nextInt(minSize, maxSize +1);
        array = new int[randomSize];
        for (int i = 0; i < randomSize; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(minValue, maxValue +1);
        }
    }

    private static int enterExpectedSum (){
        System.out.println("Enter some int:");
        boolean entered = false;
        int sum = 0;
        do {
            try {
                Scanner input = new Scanner(System.in);
                sum = input.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong data entered. Try again typing some int");
                continue;
            }
            entered = true;
        } while (!entered);
        return sum;
    }

    private static void checkIfSum () {
        rootLoop: for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((array[i] + array[j]) == expectedSum) {
                    System.out.println(array[i] + " + " + array[j] + " = " + expectedSum);
                    break rootLoop;
                }
            }
        }
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
