import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static double total = 0;
    private static String quality = "";
    private static double tips = 0;
    private static HashMap<String, Double> SERVICE_QUALITY_AND_TIPS = new HashMap<String, Double>() {{ //DAYS / LESS MONEY
        put("terrible", 0.0);
        put("poor", 0.05);
        put("good", 0.1);
        put("great", 0.15);
        put("excellent", 0.2);
    }};

    public static void main(String[] args) {
        do {
            enterTotal();
            enterQuality();
            calcTipsAndPrint();
        } while (oneMore());
    }

    private static void enterTotal () {
        boolean entered = false;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter total:");
                total = input.nextDouble();
            } catch (Exception e) {
                System.out.println("Wrong data entered. Try again typing some double");
                continue;
            }
            entered = true;
        } while (!entered);
    }

    private static void enterQuality () {
        boolean entered = false;
        do {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter quality:");
                quality = input.next();
                if (!SERVICE_QUALITY_AND_TIPS.containsKey(quality)) {
                    System.out.println("Wrong data `"+quality+"` entered. Try again typing some of those:");
                    for (String howGood: SERVICE_QUALITY_AND_TIPS.keySet())
                    System.out.println("-" + howGood);
                } else {
                    entered = true;
                }
        } while (!entered);
    }

    private static void calcTipsAndPrint () {
        tips = total * SERVICE_QUALITY_AND_TIPS.get(quality);
        System.out.println("You've gotten " + quality + " service, so please pay " + total +
        "$ + " + tips + "$ tips");
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

