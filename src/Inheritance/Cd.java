package Inheritance;

public class Cd extends Media {
    private String artistName; //

    public Cd(String title, int length, String artistName) {
        super(title, length);
        this.artistName = artistName;
    }

    public void play() {
        System.out.println("Now playing " + title + " for " + length + " by " + artistName);
    }
    public void nextTrack() {
        System.out.println("Now playing next track on " + title);
    }


}
