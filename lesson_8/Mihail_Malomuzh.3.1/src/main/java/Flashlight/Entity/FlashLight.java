package Flashlight.Entity;

public class FlashLight {
    private int batteriesNumber;
    private LightMode mode = LightMode.OFF;

    public FlashLight(int batNum ) {
        this.batteriesNumber = batNum;
    }

    public boolean setMode(LightMode mode) {
        if (batteriesNumber >= mode.getBatNum()) {
            this.mode = mode;
            return true;
        }
        return false;
    }

    public LightMode getLightMode(){
        return mode;
    }

    public boolean setBatteriesNumber(int bNum)  {
        setMode(LightMode.OFF);
        if (bNum >=0) {
            batteriesNumber = bNum;
            return true;
        }
        throw new IllegalArgumentException("Illegal number of batteries " + bNum);
    }

    public int getBatteriesNumber() {
        return batteriesNumber;
    }

    @Override
    public String toString() {
        return  "Flashlight mode = " + mode;
    }
}
