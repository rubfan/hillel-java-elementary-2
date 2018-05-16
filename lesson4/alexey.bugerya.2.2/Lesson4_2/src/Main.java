public class Main {

    public static void main(String[] args) {
        int startNum = 1;
        int inc = 2;
        int currentNum = startNum;

        for (int i = 1; i<=55; i++) {
            System.out.println(i + " - " + currentNum);
            currentNum += inc;
        }
    }
}
