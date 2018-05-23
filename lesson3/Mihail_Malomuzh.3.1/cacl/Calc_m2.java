public class Calc_m2 {
    
    public static void main(String[] args){
        
         Solver sol = new Solver();
        double v1 = 10;
        double v2 = 8;
        String op = "%";
        sol.setData(v1, v2, op);
        sol.solve();
        System.out.println("Result = " + sol.getResult());
    }
    
}
