public class Tip {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println(calcTip(100,"terrible"));
        System.out.println("=======================");
    }
    public static double calcTip(double amount, String serviceLevel) {
        double percent = 0;
        if (serviceLevel.equals("terrible")) percent = 0;
        if (serviceLevel.equals("poor")) percent = 5;
        if (serviceLevel.equals("good")) percent = 10;
        if (serviceLevel.equals("great")) percent = 15;
        if (serviceLevel.equals("excellent")) percent = 20;
        return (amount / 100 * percent) + amount;
    }

}
