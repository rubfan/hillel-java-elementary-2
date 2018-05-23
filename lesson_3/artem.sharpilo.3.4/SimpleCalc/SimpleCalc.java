package SimpleCalc;

public class SimpleCalc {
    public static void main (String[] args ){

        int first= 5;
        int second =2;
        String plus = "addition";
        String minus = "subtraction";
        String multiply = "multiplication";
        String divide = "division";
        String remaind= "remainder";
        String mod = "modulus";

        System.out.println(plus + " of "+first+" and "+second+ " results in: "+ (first+second));
        System.out.println(minus + " of "+first+" and "+second+ " results in: "+ (first-second));
        System.out.println(multiply + " of "+first+" and "+second+ " results in: "+ (first*second));
        System.out.println(divide + " of "+first+" and "+second+ " results in: "+ ((double)first/second));
        System.out.println(remaind + " of "+first+" and "+second+ " results in: "+ (first%second));
        System.out.println(mod + " of "+first+" and "+second+ " results in: "+ (Math.abs(first))+" and "+ Math.abs(second));



    }
}
