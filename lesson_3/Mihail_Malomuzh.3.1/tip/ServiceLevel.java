public enum ServiceLevel {
    terrible(0),
    poor(5),
    good(10),
    great(15),
    excellent(20);
    
    private int p;
    
    private ServiceLevel(int p){
        this.p = p;
    }
    
    public int getPercent(){
        return p;
    }
    
}
