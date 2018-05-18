public class Calc_m3 {
    
    public static void main(String[] args){
        
        Solver sol = new Solver();
        double v1 = 0;
        double v2 = 0;
        String op = "";
        
        if (args.length ==0 ){
            System.out.println("no args"); 
            return;    
        } 
                
        v1 = Double.parseDouble(args[0]);
        if (args.length >= 2)
            v2 = Double.parseDouble(args[2]);
        op = args[1];
        sol.setData(v1, v2, op);
        sol.solve();
        System.out.println("Result = " + sol.getResult());
    }
    
}
