import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите сумму, которую необходимо заплатить: ");
        Scanner MyKeyb = new Scanner(System.in);
        double Paycheck = MyKeyb.nextDouble();
        System.out.println("Оцените качество сервиса: ");
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
    System.out.println("Вы должны оставить "+Paycheck/100*ServPerc +" тугриков чаевых");
    }
    }