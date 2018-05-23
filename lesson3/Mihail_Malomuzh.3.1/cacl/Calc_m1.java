import java.util.Scanner;

public class Calc_m1 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Solver sol = new Solver();
        double v1;
        double v2;
        String op;
        
        do {
           System.out.print("First double value: ");
           v1 = sc.nextDouble();
           System.out.print("Second double value: ");
           v2 = sc.nextDouble();
           sc.nextLine();
           System.out.print("Action (+ - * / % abs): ");
           op = sc.nextLine();
           sol.setData(v1, v2, op);
           sol.solve();
           System.out.println("Result = " + sol.getResult());
           System.out.print("Continue (yes/no) : ");
        } while (sc.nextLine().equals("yes"));
        
        sc.close();
        
    }
    
}
