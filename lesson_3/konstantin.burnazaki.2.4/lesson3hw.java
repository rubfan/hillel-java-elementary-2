public class lesson3hw {
    public static void main(String[] args) {
//        System.out.print("Enter operation: ");
//        Scanner sc = new Scanner(System.in);
//        String operation = sc.next();
//        System.out.print("Enter first operand: ");
//        int firstOperand = sc.nextInt();
//        System.out.print("Enter second operand: ");
//        int secondOperand = sc.nextInt();
//        System.out.println(calculator(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        System.out.println(tipsCalc(2300, "good"));

    }

    public static java.lang.Integer calculator(String operation, int firstOperand, int secondOperand) {
        if (operation.equals("multiplication")) {
            return firstOperand * secondOperand;
        }
        if (operation.equals("division")) {
            return firstOperand / secondOperand;
        }
        if (operation.equals("addition")) {
            return firstOperand + secondOperand;
        }
        if (operation.equals("subtraction")) {
            return firstOperand - secondOperand;
        }
        if (operation.equals("modulus")) {
            return firstOperand % secondOperand;
        }
        if (operation.equals("absolute")) {
            System.out.println(Math.abs(firstOperand));
            System.out.println(Math.abs(secondOperand));
        }
        return null;
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

