package Flashlight;

import Flashlight.Entity.FlashLight;
import Flashlight.Entity.LightMode;

public class FlashLightTest {
    public static void main(String[] args)  {
        FlashLight fl = new FlashLight(3);
        fl.setMode(LightMode.RED);
        System.out.println(fl.toString());
        fl.setMode(LightMode.FLASH);
        System.out.println(fl.toString());
        fl.setBatteriesNumber(1);
        fl.setMode(LightMode.FLASH);
        System.out.println(fl.toString());
        fl.setMode(LightMode.RED);
        System.out.println(fl.toString());
        fl.setMode(LightMode.OFF);
        System.out.println(fl.toString());
       // fl.setBatteriesNumber(-1);
    }
}
