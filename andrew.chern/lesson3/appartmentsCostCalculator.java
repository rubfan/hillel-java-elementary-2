public class appartmentsCostCalculator {
    public void counter (int days, int cost, int discountMoreFiveDays, int discountMoreSevenDays){

        int totalSum;

        totalSum = days*cost;

        if (days > 5 && days < 7){
            totalSum=totalSum-discountMoreFiveDays;
        }

        if (days > 7){
            totalSum=totalSum-discountMoreSevenDays;
        }
        System.out.println("Appartments cost for " + days + " is " + totalSum);
    }
}
