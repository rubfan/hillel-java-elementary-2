/**
 * Created by My on 01.08.2018.
 */
public class Flashlight {
    int battery;


    public Flashlight() {
        battery = 0;
    }

    public String insertBattery(){
        if(battery>=5) return "Flashlight is full";
        else {
            battery++;
            return "Flashlight has " + battery + " batteries";
        }
    }


    public String shineWhite(){
        if(battery >= 1) return "Shining white";
        else return "Not enough batteries";
    }
    public String shineRed(){
        if(battery >= 2) return "Shining red";
        else return "Not enough batteries";
    }
    public String shineGreen(){
        if(battery >= 2) return "Shining green";
        else return "Not enough batteries";
    }
    public String shineBlue(){
        if(battery >= 2) return "Shining blue";
        else return "Not enough batteries";
    }
    public String flicker(){
        if(battery >= 3) return "Flickering";
        else return "Not enough batteries";
    }

}
