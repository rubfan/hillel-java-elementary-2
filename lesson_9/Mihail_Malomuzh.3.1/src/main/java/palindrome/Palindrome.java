package palindrome;

public class Palindrome {

    public static String[] toWord(String s){
        String temp[] = s.split(",");
        for (int i = 0; i < temp.length; i++)
            temp[i] = temp[i].trim();
        return  temp;
    }

    public static boolean isPalindrome(String s){
        for (int i = 0; i < s.length() / 2; i++){
            if (s.charAt(i)!=s.charAt(s.length() - 1 - i))
                return  false;
        }
        return true;
    }



    public static void main(String[] args) {
        int pNum = 0;
        for (String s : Palindrome.toWord("deleveled, evitative, cat, dog, deified"))
            if (Palindrome.isPalindrome(s)) pNum++;
        System.out.println("There are " + pNum + " palindromes in the text");
    }
}
