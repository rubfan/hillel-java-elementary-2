import java.util.ArrayList;
import java.util.Scanner;

public class Tip_Calc{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> levels = new ArrayList<String>();
        levels.add("terrible");
        levels.add("poor");
        levels.add("good");
        levels.add("great");
        levels.add("excellent");

        System.out.println("Bill: ");
        double bill = Double.parseDouble(scan.nextLine());
        System.out.println("Service level:");
        String service = scan.nextLine();

        if(!levels.contains(service)) System.out.println("Undefined service");
        else {
            double discount = (levels.indexOf(service)*5)/100.0;
            double result = bill + bill*discount;
            System.out.println("Bill with a tip: ");
            System.out.println(bill + " + " + bill*discount + " = " + result);
        }

        System.out.println();
    }
}
