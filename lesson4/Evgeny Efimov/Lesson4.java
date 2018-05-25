import java.util.Arrays;

public class Lesson4 {


    public static void main(String[] args) {
        int[] test = {3666, 4, 2, 3, 5, 4, 7, 4, -1};
        System.out.println("========================");
        System.out.print("первые 55 эдементов ");
        printFirst55(test);
        System.out.println();
        System.out.println("========================");
        System.out.print("все положительные ");
        printAllNonnegative(test);
        System.out.println();
        System.out.println("========================");
        System.out.print("первые 22 эдементов ");
        printFirst22(test);
        System.out.println();
        System.out.println("========================");
        System.out.println("сумма первых n элементов массива " + findAmount(4, test));
        System.out.println("========================");
        System.out.println("найти мин,макс" + findMinMax(test));
        System.out.println("========================");
        System.out.println("сумма чётных и нечётных " + sumEvenSumOdd(test));
        System.out.println("========================");
        System.out.print("четырёхзначные числа массива ");
        printFourDigitNumbers(test);
        System.out.println("========================");
        System.out.print("первые 5 мин элементов массива ");
        printFirstFiveMin(test);
        System.out.println();
        System.out.println("========================");
        System.out.println("сумирование числа ");
        repeatedlyAddDigits(8888);
        System.out.println("========================");
        System.out.println("из десятичной в двоичную " + decimalToBinary(100));
        System.out.println("========================");
        System.out.print("все сщастливые цыфры\n");
        printHappyNumbers();
        System.out.println("========================");
    }

    public static void printFirst55(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 55) break;
            System.out.print(arr[i] + ",");
        }
    }

    public static void printAllNonnegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) System.out.print(arr[i] + ",");

        }
    }

    public static void printFirst22(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 22) break;
            System.out.print(arr[i] + ",");
        }
    }

    public static int findAmount(int n, int[] arr) {
        int amount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == n) break;
            amount += arr[i];
        }
        return amount;
    }

    public static String findMinMax(int[] arr) {

        int min = 0, max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[min] > arr[i + 1]) min = i + 1;
            if (arr[max] < arr[i + 1]) max = i + 1;
        }
        return "min: " + arr[min] + "; max: " + arr[max];
    }

    public static String sumEvenSumOdd(int[] arr) {
        int sumEven = 0, SumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) sumEven += arr[i];
            else SumOdd += arr[i];
        }
        return "sumEven = " + sumEven + " SumOdd = " + SumOdd;
    }

    public static void printFourDigitNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (Integer.toString(arr[i]).length() == 4) System.out.println(arr[i]);
        }
    }

    public static void printFirstFiveMin(int[] arr) {
        int[] a = arr.clone();
        Arrays.sort(a);
        int counter = 0;
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ",");
            counter++;
            if (counter == 5) break;
        }

    }

    public static void printHappyNumbers() {
        int number = 100_000;
        while (number <= 999_999) {
            if (isLucky(number)) System.out.println(number);
            number++;
        }
    }

    public static void repeatedlyAddDigits(int number) {
        String num = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        if (num.length() == 1) return;
        repeatedlyAddDigits(sum);
        System.out.println(sum);

    }

    public static int decimalToBinary(long number) {
        StringBuilder res = new StringBuilder();
        while (number > 0) {
            res.append(number % 2);
            number /= 2;
        }

        return Integer.parseInt(invert((res.toString())));
    }

    private static String invert(String string) {
        char[] chars = string.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        char temp;
        while (i < j) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
            System.out.println();
        }

        return new String(chars);
    }

    private static boolean isLucky(int number) {
        char[] chars = Integer.toString(number).toCharArray();
        int firsSum = 0;
        int secondSum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i <= 2) firsSum += Integer.parseInt(String.valueOf(chars[i]));
            else secondSum += Integer.parseInt(String.valueOf(chars[i]));
        }
        return firsSum == secondSum;
    }


}
