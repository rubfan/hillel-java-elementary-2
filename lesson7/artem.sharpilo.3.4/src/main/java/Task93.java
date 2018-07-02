import java.util.Scanner;

public class Task93 {
    public static void main(String[] args) {
        System.out.println("Enter your words to check palindroms:");
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1=s.split(",");
        checkPalindrom(s1);

    }

    static void checkPalindrom(String[] s1){
        int count=0;
        for (int i=0; i<s1.length; i++){
            s1[i]=s1[i].trim();
            String s2= new StringBuffer(s1[i]).reverse().toString();
            if (s1[i].equals(s2)) count++;
        }
        System.out.println("There are " + count + " palindroms in the text");
    }
}
