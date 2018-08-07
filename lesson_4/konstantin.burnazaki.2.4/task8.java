import java.util.ArrayList;
import java.util.List;

public class task8 {
    public static void main(String[] args) {
        findyLuckyNumber();

    }

    public static void findyLuckyNumber(){
        List<Integer> luckyNumbers = new ArrayList<Integer>();
        for(int i = 100_000; i <= 999_999; i++){
            int firstDigit = i / 100_000;
            int secondDigit = (i % 100_000) / 10_000;
            int thirdDigit = (i % 10_000) / 1000;
            int fourthDigit = (i % 1000) / 100;
            int fifthDigit = (i % 100) / 10;
            int sixthDigit = (i % 10);
            if((firstDigit + secondDigit + thirdDigit) == (fourthDigit + fifthDigit + sixthDigit)){
                luckyNumbers.add(i);
            }
        }
        System.out.println(luckyNumbers);
    }
}
