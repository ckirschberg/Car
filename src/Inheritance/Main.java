package Inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cd cd1 = new Cd("White album", 129, "The Beatles");
        Dvd dvd1 = new Dvd("What women want", 298, "Mel Gibson");

        //cd1.play();
        //dvd1.play();

        ArrayList<Media> media = new ArrayList<>();
        media.add(cd1);
        media.add(dvd1);
        //Media m1 = new Media("fkdjaæ", 12);

        for(Media m : media) {
            m.play();
            if (m instanceof Cd) {
                Cd cd = (Cd) m;
                cd.nextTrack();
            }

            //m.nextTrack();
        }
    }
}
