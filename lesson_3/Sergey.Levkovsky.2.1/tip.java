import java.util.Scanner;
public class tip {
    public static void main(String[] args) {
        System.out.println("Enter ur bill");
        Scanner A = new Scanner(System.in);
        int a = A.nextInt();

        System.out.println("Enter the service level");
        Scanner B = new Scanner(System.in);
        String b = B.nextLine();



        int tip = 0;
        switch (b) {
            case "terrible":
                tip = (0 * a) / 100;
                break;
            case "poor":
                tip = (5 * a) / 100;
                break;
            case "good":
                tip = (10 * a) / 100;
                break;
            case "great":
                tip = (15 * a) / 100;
                break;
            case "exellent":
                tip = (20 * a) / 100;
                break;
        }
        System.out.println(tip);
    }

}
