public class Main {

    public static void main(String[] args) {
        int startNum = 1000;
        int inc = 3;
        int currentNum = startNum;

        while (getLength(currentNum) == 4) {
            System.out.println(currentNum);
            currentNum += inc;
        }
    }
    private static int getLength (int number) {
        return (int)(Math.log10(number)+1);
    }
}
