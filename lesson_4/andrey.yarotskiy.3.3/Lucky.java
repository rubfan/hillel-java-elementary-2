public class Lucky {

    public static void main(String[] args) {
        System.out.println("Lucky tickets:");
        int num, half1, half2;
        for (int i = 100000; i < 1000000; i++) {
            num = i;
            half1 = 0;
            half2 = 0;
            for (int j = 0; j < 6; j++) {
                if (j < 3) half2 += num % 10;
                else half1 += num % 10;
                num /= 10;
            }
            if (half1 == half2) System.out.print(i + " ");
        }
    }
}
