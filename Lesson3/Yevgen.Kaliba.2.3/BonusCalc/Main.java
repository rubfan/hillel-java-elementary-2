import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your paycheck sum: ");
        Scanner MyKeyb = new Scanner(System.in);
        double Paycheck = MyKeyb.nextDouble();
        System.out.println("What do you think about service quality?: (terrible/poor/good/great/excellent");
        String Service = MyKeyb.next();
        int ServPerc;
    switch(Service) {
        case "terrible":
            ServPerc = 0;
            break;
        case "poor":
            ServPerc = 5;
            break;
        case "good":
            ServPerc = 10;
            break;
        case "great":
            ServPerc = 15;
            break;
        case "excellent":
            ServPerc = 20;
            break;
        default:
            ServPerc = 0;
            break;
       }
    System.out.println("You should leave "+Paycheck/100*ServPerc +" USD.");
    }
    }