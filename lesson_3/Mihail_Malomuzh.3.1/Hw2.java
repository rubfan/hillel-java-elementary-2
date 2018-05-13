import java.util.Scanner;


public class Hw2 {
          
    public static double min(double a, double b, double c){
        double min;
        min = b < c ? b : c;
        min = a < min ? a : min;
        return min;
    }
    
    public static double max (double a, double b, double c){
        return -min(-a, -b, -c);
    };
    
    private static void mins (double a, double b, double c){
        double m = min(a,b,c);
        System.out.println("minimal numbers");
        if (a == m) System.out.print("d1 = ");
        if (b == m) System.out.print("d2 = ");
        if (c == m) System.out.print("d3 = ");
        System.out.println(m);
    };
     
    public static boolean isEven(int a){
        return  (a>>1) * 2 == a;          
    }
    
    public static boolean isDivable(double a, double b){
        return (a % b) == 0;
    }
    
    public static double nearest(double num, double a, double b){
        if ((num - a)*(num - a) > (num - b)*(num - b))
            return b;
            else if ((num - a)*(num - a) == (num - b)*(num - b))
                return Double.NaN;
                else 
                    return a;
    }
    
    public static int rent(int days){
        return 40 * days - (((days > 5) && (days <= 7)) ? 20 : 0) - (days > 7 ? 50 : 0); 
    };
    
    public static void main(String[] args) {
  
        double d1;
        double d2;
        double d3;
                
        Scanner in = new Scanner(System.in);
        
        System.out.println("input 3 numbers");
        d1 = in.nextDouble();
        d2 = in.nextDouble();
        d3 = in.nextDouble();
        //min
        System.out.println("min = " + min(d1, d2, d3));
        //max
        System.out.println("max = " + -min(-d1, -d2, -d3));
        //mins
        mins(d1, d2, d3);
        System.out.println();
        
        //even-univen
        int n;
        System.out.println("input integer number");
        n = in.nextInt();
        System.out.println("parity of " + n + " = " + isEven(n));
        System.out.println();
        
        //isDivable
        System.out.println("input 2 numbers");
        d1 = in.nextDouble();
        d2 = in.nextDouble();
        System.out.println(d1 + " div " + d2 +" = 0 is " + isDivable(d1, d2));
        System.out.println();
        
        // nearesr number; if result = NaN -> both numbers equally close
        System.out.println("input base number");
        d1 = in.nextDouble();
        System.out.println("input 2 number near the base");
        d2 = in.nextDouble();
        d3 = in.nextDouble();
        System.out.println("nearest to " + d1 + " is " + nearest(d1, d2, d3));
        System.out.println();
        
        //rent
        System.out.println("input amount of days");
        n = in.nextInt();
        System.out.println("rent = " + rent(n));
        
    }
    
}
