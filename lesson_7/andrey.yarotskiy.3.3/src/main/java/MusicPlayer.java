import java.util.LinkedList;

/**
 * Created by My on 01.08.2018.
 */
public class MusicPlayer {
    private LinkedList<String> playList;
    private int volume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public MusicPlayer() {
        this.playList = new LinkedList<String>();
        this.volume = 5;

    }

    public void addSong(String songName) {
        playList.add(songName);
    }

    public void play() {
        if (playList.isEmpty()) System.out.println("Empty playlist");
        else {
            System.out.println("Playing \"" + playList.getFirst() + "\"");
        }
    }


    public void playNext() {
        if (!playList.isEmpty()) playList.add(playList.removeFirst());
        play();
    }

    public void playPrevious() {
        if (!playList.isEmpty()) playList.addFirst(playList.removeLast());
        play();
    }

    public void volumeUp() {
        if (volume < maxVolume) volume++;
        System.out.println("Volume level: " + volume);
    }
    public void volumeDown(){
        if (volume > minVolume) volume--;
        System.out.println("Volume level: " + volume);
    }

    public void mute(){
        volume = minVolume;
        System.out.println("Volume level: " + volume);
    }
}
