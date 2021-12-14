package ExamPrep2;

public class Main {
    public static void main(String[] args) {
        Planet p1 = new Planet("Saturn", 1002, false);
        Planet p2 = new Planet("Earth", 101, true);
        Planet p3 = new Planet("Mars", 50, false);

        String name = p1.getName();
        System.out.println(name);

        SolarSystem solarSystem = new SolarSystem();
        solarSystem.addPlanet(0, p2);
        solarSystem.addPlanet(1, p3);
        solarSystem.addPlanet(10, p1);

        solarSystem.printPlanets();

    }
}
