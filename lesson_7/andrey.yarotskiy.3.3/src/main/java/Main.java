/**
 * Created by My on 01.08.2018.
 */
public class Main {

    public static void main(String[] args) {
        flash();
        System.out.println();
        player();
        System.out.println();
        clock();


    }

    static public void flash(){
        Flashlight flashlight = new Flashlight();

        System.out.println(flashlight.flicker());
        System.out.println(flashlight.shineBlue());
        System.out.println(flashlight.insertBattery());

        System.out.println(flashlight.shineWhite());
        System.out.println(flashlight.insertBattery());

        System.out.println(flashlight.shineBlue());
        System.out.println(flashlight.insertBattery());

        System.out.println(flashlight.flicker());
    }

    static public void player(){
        MusicPlayer ipod = new MusicPlayer();

        ipod.playNext();

        ipod.addSong("Smells like teen spirit");
        ipod.addSong("Bohemian rhapsody");
        ipod.addSong("Dragostea din tei");
        ipod.addSong("Harder better faster stronger");
        ipod.addSong("Highway to hell");

        ipod.volumeUp();
        ipod.volumeUp();
        ipod.volumeUp();
        ipod.play();
        ipod.play();
        ipod.playPrevious();
        ipod.playPrevious();
        ipod.playPrevious();
        ipod.playNext();
        ipod.playNext();
        ipod.playNext();
        ipod.mute();
    }

    static public void clock(){
        Clock clock = new Clock(4,2);
        clock.showTime();

        clock.setTime(14,20);
        clock.showTime();

        clock.timeUntilAlarm();

        clock.setAlarm(16,21);
        clock.timeUntilAlarm();

        clock.setAlarm(14,10);
        clock.timeUntilAlarm();
    }
}
