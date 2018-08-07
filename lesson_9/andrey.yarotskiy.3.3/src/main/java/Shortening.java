import java.util.Scanner;

/**
 * Created by My on 07.08.2018.
 */
public class Shortening {
    public static void main(String[] args) {
        System.out.println(cut());
    }

    public static String cut() {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();

        String[] wordList = words.split(" ");
        String[] resultList = new String[wordList.length];

        for (int i = 0; i < wordList.length; i++) {
            String str = wordList[i];
            if (str.length() <= 4) {
                resultList[i] = str;
            } else {
                int num = str.length() - 2;
                resultList[i] = str.charAt(0) + Integer.toString(num) + str.charAt(str.length() - 1);
            }
        }

        String result = resultList[0];

        for (int i = 1; i < resultList.length; i++) {
            result += " " + resultList[i];
        }

        return result;
    }
}
