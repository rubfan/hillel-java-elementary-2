public class task9 {
    public static void main(String[] args) {
        int samle = 2122;
        decimalToBinary(samle);
    }

        public static void decimalToBinary(int number){
            int container[] = new int[100];
            int i = 0;
            while (number > 0) {
                container[i] = number % 2;
                i++;
                number = number / 2;
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(container[j]);
            }

        }

}