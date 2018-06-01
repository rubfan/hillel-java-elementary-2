public class task4 {
    public static void main(String[] args) {
        System.out.println(tipsCalc(2300, "good"));

    }

    public static double tipsCalc(int bill, String serviceSutisfaction) {
        if (serviceSutisfaction.equals("terrible")) {
            double terribleTipsPercentage = 0;
            return bill * terribleTipsPercentage;
        }
        if (serviceSutisfaction.equals("poor")) {
            double poorTipsPercentage = 0.05;
            return bill * poorTipsPercentage;
        }
        if (serviceSutisfaction.equals("good")) {
            double goodTipsPercentage = 0.1;
            return bill * goodTipsPercentage;
        }
        if (serviceSutisfaction.equals("great")) {
            double greatTipsPercentage = 0.15;
            return bill * greatTipsPercentage;
        }
        if (serviceSutisfaction.equals("excellent")) {
            double excellentTipPercentage = 0.2;
            return bill * excellentTipPercentage;
        }
        return 0;
    }
}

