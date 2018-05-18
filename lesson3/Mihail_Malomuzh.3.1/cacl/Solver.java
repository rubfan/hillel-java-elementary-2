public class Solver {
   
    private double fVar;
    private double sVar;
    private String oper;
    private double res;
    
    public Solver(){
        
    }
    
    public Solver(double a, double b, String o){
        fVar = a;
        sVar = b;
        oper = o;       
    }
    
    public void setData(double a, double b, String o){
        fVar = a;
        sVar = b;
        oper = o;       
    }
    
    private void plus(){
        res = fVar + sVar;
    }
    
    private void minus(){
        res = fVar - sVar;
    }
    
    private void mul(){
        res = fVar * sVar;
    }
    
    private void div(){
        res = fVar / sVar;
    }
    
    private void mod(){
        res = fVar % sVar;
    }
    
    
    private void abs(){
        res = (fVar >= 0) ? fVar: -fVar;
    }
            
    public void solve(){
        switch (oper) {
            case "+" : plus(); break;
            case "-" : minus(); break;
            case "*" : mul(); break;
            case "/" : div(); break;
            case "%" : mod(); break;
            case "abs" : abs(); break;
            default: res = Double.NaN;
        }
    };
    
    public double getResult(){
       return res; 
    }
    
}
