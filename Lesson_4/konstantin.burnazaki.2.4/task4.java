public class task4 {
    public static void main(String[] args) {
        printFirstTwenty();
    }
    public static void printFirstTwenty() {
        int loopCount = 0;
        for(int i = 2; loopCount < 21; i *= 2){
            loopCount += 1;
            System.out.println(i);

        }
    }
}
