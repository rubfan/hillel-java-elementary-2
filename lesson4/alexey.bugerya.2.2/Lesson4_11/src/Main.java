import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        do {
            System.out.println(findDigitalRoot(enterInt()));
        }while (oneMore());
    }

    private static int findDigitalRoot (int i) {
        while (i > 9) {
            i = sumDigits(i);
        }
        return i;
    }

    private static int sumDigits(int i){
        if (i>10)
            return i%10 + sumDigits(i/10);
        return i;
    }

    private static int enterInt () {
        boolean entered = false;
        int i = 0;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter some integer to find its digital root:");
                i = input.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong data entered. Try again typing some integer");
                continue;
            }
            if (!(i>0)) {
                System.out.println("Write non-negative, not-null integer!");
                continue;
            }
            entered = true;
        } while (!entered);
        return i;
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
