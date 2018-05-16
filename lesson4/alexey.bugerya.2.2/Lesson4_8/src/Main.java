
public class Main {

    public static void main(String[] args) {
        int total = 0;
        for (int i = 100000; i<=999999; i++) {
            if (isLucky(getArray(i))) {
                System.out.println(i);
                total++;
            }
        }
        System.out.println("There are " + total + " of them!\n" +
        "It is " + luckyTicketChance(total) + "% chance to get one!");

    }
    private static int[] getArray(int i) {
        String numString = Integer.toString(i);
        int[] numArray = new int[6];
        for (int j = 0; j < numString.length(); j++) {
            numArray[j] = numString.charAt(j) - '0';
        }
        return numArray;
    }

    private static double luckyTicketChance ( int total) {
        return (double)total/(999999-100000)*100;
    }

    private static boolean isLucky (int[] array) {
        return array[0]+array[1]+array[2] == array[3]+array[4]+array[5];
    }
}
