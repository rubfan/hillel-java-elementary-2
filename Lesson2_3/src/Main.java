import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static double Total = 0;
    private static int days = 0;

    private static HashMap<Integer, Double> DISCOUNTS = new HashMap<Integer, Double>() {{ //DAYS / LESS MONEY
        put(5, 20.0);
        put(7, 50.0);
    }};
    private static final double PRICE = 40;

    public static void main(String[] args) {
        do {
            enterDays();
            calcTotal();
        } while (oneMore());
    }

    private static void enterDays () {
        boolean entered = false;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter days:");
                days = input.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong data entered. Try again typing some integer");
                continue;
            }
            entered = true;
        } while (!entered);
    }

    private static void calcTotal () {
        Total = 0;
        double discount = 0;
        for (int d = 1; d <= days; d++) {
            Total += PRICE;
            if (DISCOUNTS.containsKey(d)) {
                discount = DISCOUNTS.get(d);
            }
        }
        Total -= discount;
        System.out.println("Total price for " + days + " days rent would be " + Total);
    }

    private static boolean oneMore () {
        String answer;
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("\nOne more? [Y/N]");
                answer = input.next();
                if (answer.equals("y") || answer.equals("Y")) {
                    return true;
                }
                if (answer.equals("n") || answer.equals("N")) {
                    return false;
                }
            } catch (Exception e) {
                System.out.println("Wrong data entered. Try again typing some integer");
            }
        }
    }
}

