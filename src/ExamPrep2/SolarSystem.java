package ExamPrep2;

import java.util.Arrays;

public class SolarSystem {
    private Planet[] planets = new Planet[10];

    public void addPlanet(int index, Planet planet) {
        try {
            planets[index] = planet;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index. Planet is not set in the solar system.");
        }
    }
    public void printPlanets() {
        System.out.println(Arrays.toString(planets));

        /*
        for (Planet p : planets) {
            System.out.println(p);
        }
        */
    }
}
