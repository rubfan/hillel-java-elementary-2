/**
 * Created by My on 01.08.2018.
 */
public class Clock {
    private int hour;
    private int minute;
    private boolean alarmOn = false;
    private int alarmHour;
    private int alarmMinute;

    public Clock(){
        this.hour = 0;
        this.minute = 0;
    }

    public Clock(int hour, int minute) {
        this.setTime(hour, minute);
    }

    public void setTime(int hour, int minute){
        if(isTimeCorrect(hour,minute)){
            this.hour = hour;
            this.minute = minute;
        }
    }

    private boolean isTimeCorrect(int hour, int minute) {
        boolean correctHour = hour >= 0 && hour <= 24;
        boolean correctMinute = minute >= 0 && minute <= 59;
        boolean result = correctHour && correctMinute;

        if(!result) System.out.println("Incorrect format");

        return result;
    }

    public void showTime(){
        System.out.format("%02d:%02d\n", hour, minute);
    }

    public void setAlarm(int hour, int minute){
        if(isTimeCorrect(hour,minute)){
            alarmOn = true;
            this.alarmHour = hour;
            this.alarmMinute = minute;
            System.out.format("Alarm clock set on %02d:%02d\n", this.alarmHour, this.alarmMinute);
        }
    }

    public void timeUntilAlarm(){
        if(alarmOn){
            int currentTime = hour*60 + minute;
            int allarmTime = alarmHour*60 + alarmMinute;
            int difference = allarmTime - currentTime;

            if(difference < 0){
                difference = 24*60 + difference;
            }

            int hoursLeft = difference/60;
            String pluralHours = hoursLeft > 1 ? "hours" : "hour";

            int minutesLeft = difference%60;
            String pluralMinutes = minutesLeft > 1 ? "minutes" : "minute";

            System.out.printf("Alarm will ring in %d %s and %d %s\n", hoursLeft, pluralHours, minutesLeft, pluralMinutes);
        }else {
            System.out.println("Alarm clock is off");
        }
    }
}
