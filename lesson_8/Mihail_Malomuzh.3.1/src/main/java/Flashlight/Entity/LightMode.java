package Flashlight.Entity;

public enum LightMode {
    OFF(0),
    RED(1),
    WHITE(2),
    FLASH(3);

    private int batNum;

    private LightMode(int batNum){
        this.batNum = batNum;
    }

    public int getBatNum(){
        return batNum;
    }

}
