import java.util.Scanner;

public class Tip {

    public static void main(String[] args) {
        
        String s;
        double sum;
      
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ServiceLevel ( ") ;
        for (ServiceLevel y : ServiceLevel.values())
            System.out.print(y.toString() + " ");
        System.out.print("): ") ;
        s = sc.nextLine();
        
        System.out.print("Sum :  ") ;
        sum = sc.nextDouble();
        ServiceLevel sl = ServiceLevel.valueOf(s); 

        System.out.println("Total : " + sum * (1 + (double) sl.getPercent()/100));
          
    }
    
}
