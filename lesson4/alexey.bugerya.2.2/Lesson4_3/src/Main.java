public class Main {

    public static void main(String[] args) {
        int startNum = 90;
        int inc = -5;
        int currentNum = startNum;

        while (currentNum >= 0) {
            System.out.println(currentNum);
            currentNum += inc;
        }
    }
}
