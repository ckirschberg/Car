package Inheritance;

public abstract class Media {
    protected String title;
    protected int length; // seconds

    public Media(String title) {
        this.title = title;
    }
    public Media(String title, int length) {
        this.title = title;
        this.length = length;
    }


    public abstract void play();

/*    public void play() {
        System.out.println("Now playing " + title + " for " + length + " seconds");
    }
    */

}
