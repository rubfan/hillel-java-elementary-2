import java.util.Random;

public class task7 {
    public static void main(String[] args) {
        int i[] = new int[10];
        findSumOddEven(i);

    }

    public static void findSumOddEven(int[] i){
        for (int n = 0; n < 10; n++) {
            Random rand = new Random();
            i[n] = rand.nextInt();
        }

        int totalOdd = 0;
        int totalEven = 0;
        for(int n = 0; n < i.length; n++){
            if (isEven(i[n])){
                totalEven += i[n];
                System.out.println("Even number to add: " + i[n] + ". Current even total: " + totalEven);
            }else{
                totalOdd += i[n];
                System.out.println("Odd number to add: " + i[n] + ". Current odd total: " + totalOdd);
            }
        }
        System.out.println(totalEven);
        System.out.println(totalOdd);

    }

    public static boolean isEven(int a){
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
