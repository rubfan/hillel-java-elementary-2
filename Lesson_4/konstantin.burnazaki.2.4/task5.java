import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        int i[] = new int[10];
        findTotal(i);


    }

    public static void findTotal(int[] sample) {
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            sample[i] = rand.nextInt();
        }
        for (int specimen : sample) {
            System.out.println(specimen);
        }
        int total = 0;
        for (int specimen : sample) {
            total += specimen;
            }
        System.out.println("Total is: " + total);
    }
}

