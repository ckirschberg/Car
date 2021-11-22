package Inheritance;

public class Dvd extends Media {
    private String director;

    public Dvd(String title, String director) {
        super(title);
        this.director = director;
    }
    public Dvd(String title, int length, String director) {
        super(title, length);
        this.director = director;
    }

    @Override
    public void play() {
        System.out.println("Now playing " + title + " for " + length + " with " + director);
    }

}
