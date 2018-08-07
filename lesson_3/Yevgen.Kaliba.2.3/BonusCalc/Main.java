import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your paycheck sum: ");
        Scanner MyKeyb = new Scanner(System.in);
        double Paycheck = MyKeyb.nextDouble();

        System.out.println("What do you think about service quality?: (terrible/poor/good/great/excellent");
        String Service = MyKeyb.next();

        int servicePerc;
        switch (Service) {
            case "terrible":
                servicePerc = 0;
                break;
            case "poor":
                servicePerc = 5;
                break;
            case "good":
                servicePerc = 10;
                break;
            case "great":
                servicePerc = 15;
                break;
            case "excellent":
                servicePerc = 20;
                break;
            default:
                servicePerc = 0;
                break;
        }
        System.out.println("You should leave " + Paycheck / 100 * servicePerc + " USD.");
    }
}