package Beer.Entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Beer {
    private String tm;
    private Calendar expData;
    private double volume;
    private double alcohol;
    private SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
    private int bestTemperature;
    private int temperature;

    public Beer(String tm, String expData, double volume, double alcohol, int bestTemperature) {
        this.tm = tm;
        this.expData = Calendar.getInstance() ;
        String[] ymd = expData.split("\\.");
        this.expData.set(Integer.parseInt(ymd[0]),Integer.parseInt(ymd[2]) - 1 ,Integer.parseInt(ymd[2]));
        this.volume = volume;
        this.alcohol = alcohol;
        this.bestTemperature = bestTemperature;
    }

    public String getTM() {
        return tm;
    }

    public Calendar getExpData() {
        return expData;
    }

    public double getVolume() {
        return volume;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isExpired(){
        Calendar curDate = Calendar.getInstance();
        if (curDate.getTimeInMillis() > expData.getTimeInMillis())
            return true;
        return false;
    }

    public boolean isReadyToDrink(){
        if ((isExpired() == false) && (Math.abs(temperature - bestTemperature) < 2))
            return  true;
        return false;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "tm='" + tm + '\'' +
                ", expData=" + format.format(expData.getTime()) +
                ", volume=" + volume +
                ", aclohol=" + alcohol +
                '}';
    }

}
