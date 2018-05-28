package tips;

import java.util.Scanner;

public class Tips {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter amount and then service level (Example: terrible, poor, good, great, excellent):");
        double sum=sc.nextInt();
        String service=sc.next();

        if (service.equals("terrible"))
            System.out.println("You ought to pay: "+(sum+(sum*0)));
        else if (service.equals("poor"))
            System.out.println("You ought to pay: "+(sum+(sum*0.05)));
        if (service.equals("good"))
            System.out.println("You ought to pay: "+(sum+(sum*0.1)));
        if (service.equals("great"))
            System.out.println("You ought to pay: "+(sum+(sum*0.15)));
        if (service.equals("excellent"))
            System.out.println("You ought to pay: "+(sum+(sum*0.2)));


    }
}
