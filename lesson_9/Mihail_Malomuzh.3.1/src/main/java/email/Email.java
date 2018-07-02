package email;

public class Email {

    public static String symbolReplacer(String em){
         String s = em.replace(".", "[ dot ]");
         s = s.replace("@", "[ at ]");
        return  s;
    }

    public static void main(String[] args) {
        System.out.println(symbolReplacer("java.elementary.2@hillel.com"));
    }
}
