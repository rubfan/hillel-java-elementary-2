package i18n;

public class I18n {

    public static String reduce(String s){
        if (s.length() <= 4) return  s;
        return s.charAt(0) + Integer.toString(s.length() - 2) + s.charAt(s.length() - 1);
    }

    public static String[] toWord(String s){
        return s.split(" ");
    }

    public static void main(String[] args) {
        for (String s : toWord("internationalization localization cat elephant monitor"))
            System.out.print(reduce(s) + " ");
    }
}
