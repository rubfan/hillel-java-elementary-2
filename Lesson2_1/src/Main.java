import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static HashMap<String, Double> numbersList = new HashMap<>();
    private static final int AMOUNT = 3;

    public static void main(String[] args) {
        do {
            enterNumbers(AMOUNT);
            System.out.println("\nTask 1:\n" +
                    "Min value is - " + findMinValue());
            System.out.println("\nTask 2:\n" +
                    "Max value is - " + findMaxValue()+"\n"+
                    "Max value is - " + findMinValue());
            System.out.println("\nTask 3:");
            if (findMinNames().size()==1) {
                System.out.println("Min numbers is - " + findMinNames().toString() + " = " + findMinValue());
            } else {
                System.out.println("Min numbers are - " + findMinNames().toString() + " = " + findMinValue());
            }
            System.out.println("\nTask 4:");
            checkIfEven(); //task4
        } while (oneMore());
    }

    private static void enterNumbers (int amount) {
        boolean entered = false;
        do {
            try {
                Scanner input = new Scanner(System.in);
                for (int i=1; i <=amount; i++) {
                    System.out.println("Enter number " + i + ":");
                    numbersList.put("number"+i,input.nextDouble());
                }
            } catch (Exception e) {
                System.out.println("Wrong data entered. Try again typing some double");
                continue;
            }
            entered = true;
        } while (!entered);
    }

    private static Double findMaxValue () {
        Double maxAmount=Double.NaN;
        for (String numberName: numbersList.keySet()) {
            if (maxAmount.isNaN() || numbersList.get(numberName) > maxAmount ) {
                maxAmount = numbersList.get(numberName);
            }
        }
        return maxAmount;
    }

    private static Double findMinValue () {
        Double minAmount=Double.NaN;
        for (String numberName: numbersList.keySet()) {
            if (minAmount.isNaN() || numbersList.get(numberName) < minAmount ) {
                minAmount = numbersList.get(numberName);
            }
        }
        return minAmount;
    }

    private static ArrayList<String> findMinNames () {
        Double minAmount=Double.NaN;
        ArrayList<String> minNames=new ArrayList<>();
        for (String numberName: numbersList.keySet()) {
            if ( minAmount.isNaN() || numbersList.get(numberName) <= minAmount) {
                if (minAmount.isNaN() || numbersList.get(numberName) < minAmount ) {
                    minNames.clear();
                }
                minAmount = numbersList.get(numberName);
                minNames.add(numberName);
            }
        }
        return minNames;
    }

    private static void checkIfEven () {
        for (String numberName: numbersList.keySet()) {
            if (numbersList.get(numberName)%2 ==1) {
                System.out.println(numberName + " (" + numbersList.get(numberName) + ") isn't Even");
            } else {
                System.out.println(numberName + " (" + numbersList.get(numberName) + ") is Even");
            }
        }
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
