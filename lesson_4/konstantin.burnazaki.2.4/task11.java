import java.util.ArrayList;
import java.util.List;

public class task11 {
    public static void main(String[] args) {
        int number = 555_555;
        System.out.println(iterSumOfDigitsUntilSingleDigit(number));
    }

    public static int iterSumOfDigitsUntilSingleDigit(int number) {
        while (String.valueOf(number).length() != 1) {
            number = sumOfAllDigits(number);
        }
        return number;
    }


    public static int sumOfAllDigits(int number) {
        List<Integer> container = new ArrayList<Integer>();
        int i = 0;
        while (number > 0) {
            container.add(number % 10);
            i++;
            number = number / 10;
        }
        int sum = 0;
        for (int j = container.size() - 1; j != -1; j--) {
            sum += container.get(j);
        }
        return sum;
    }
}
