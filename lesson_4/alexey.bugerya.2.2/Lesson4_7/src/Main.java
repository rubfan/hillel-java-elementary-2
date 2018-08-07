import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static int[] array;
    private final static int MIN_SIZE = 5;
    private final static int MAX_SIZE = 10;
    private final static int MIN_VALUE = 0;
    private final static int MAX_VALUE = 10;

    public static void main(String[] args) {
        do {
            initArray(MIN_SIZE, MAX_SIZE, MIN_VALUE, MAX_VALUE);
            System.out.println("Your random array = " + Arrays.toString(array));
            calcTotalAndPrint();
        } while (oneMore());
    }

    private static void initArray (int minSize, int maxSize, int minValue, int maxValue) {
        int randomSize = ThreadLocalRandom.current().nextInt(minSize, maxSize +1);
        array = new int[randomSize];
        for (int i = 0; i < randomSize; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(minValue, maxValue +1);
        }
    }

    private static void calcTotalAndPrint () {
        int sumEven = 0;
        StringBuilder sumEvenString = new StringBuilder();
        int sumOdd = 0;
        StringBuilder sumOddString = new StringBuilder();
        for (int i = 0 ; i < array.length; i++) {
            if (isEven(array[i])) {
                sumEven += array[i];
                sumEvenString.append(array[i]).append(" + ") ;
            } else {
                sumOdd += array[i];
                sumOddString.append(array[i]).append(" + ") ;
            }
        }
        System.out.println("Total of all even in array is \n" +
                sumEvenString.substring(0, sumEvenString.length() - 3 ) + " = " + sumEven);
        System.out.println("Total of all odd in array is \n" +
                sumOddString.substring(0, sumOddString.length() - 3 ) + " = " + sumOdd);
    }

    private static boolean isEven (int n) {
        return n%2 == 0;
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
