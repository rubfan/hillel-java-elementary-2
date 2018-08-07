import com.sun.deploy.util.StringUtils;

/**
 * Created by My on 07.08.2018.
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(howManyPalindromes("deleveled, evitative, cat, dog, deified"));
    }
    public static String howManyPalindromes(String sentence){
        String[] words = sentence.split(", ");
        int counter = 0;

        for (int i = 0; i < words.length; i++) {
            if(isPalindrome(words[i])) counter++;
        }

        String toBe = counter == 1?"is":"are";
        String plural = counter == 1?"":"s";

        return String.format("There %s %d palindrome%s in the text",toBe,counter,plural);
    }
    public static boolean isPalindrome(String str){
        str = str.trim();
        str = str.toLowerCase();

        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        }
        return true;
    }
}
