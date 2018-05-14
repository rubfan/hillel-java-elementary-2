import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    private static ArrayList<Double> numbersList = new ArrayList<>();
    private static final int AMOUNT = 2;
    public static final int CLOSEST_TO = 10;

    public static void main(String[] args) {
        do {
            enterNumbers(AMOUNT);
            System.out.println("\nTask 5:");
            isDividable();
            System.out.println("\nTask 6:");
            findClosestTo(CLOSEST_TO);
        } while (oneMore());
    }

    private static void isDividable () {
        if (numbersList.get(0) % numbersList.get(1) == 0) {
            System.out.println("Dividable");
        } else {
            System.out.println("Undividable");
        }
    }

    private static void findClosestTo (double closest) {
        if (Math.abs(numbersList.get(0)- closest)-Math.abs(numbersList.get(1)- closest)==0) {
            System.out.println("Numbers are equidistant from " + closest);
        }
        if (Math.abs(numbersList.get(0)- closest)-Math.abs(numbersList.get(1)- closest)>0) {
            System.out.println("Number2 (" + numbersList.get(1) + ") is closer to " + closest);
        }
        if (Math.abs(numbersList.get(0)- closest)-Math.abs(numbersList.get(1)- closest)<0) {
            System.out.println("Number1 (" + numbersList.get(0) + ") is closer to " + closest);
        }
    }

    private static void enterNumbers (int amount) {
        boolean entered = false;
        do {
            try {
                Scanner input = new Scanner(System.in);
                for (int i=1; i <=amount; i++) {
                    System.out.println("Enter number " + i + ":");
                    numbersList.add(input.nextDouble());
                }
            } catch (Exception e) {
                System.out.println("Wrong data entered. Try again typing some double");
                continue;
            }
            entered = true;
        } while (!entered);
    }

    private static boolean oneMore (){
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
