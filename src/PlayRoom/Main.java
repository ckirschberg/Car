package PlayRoom;

public class Main {
    public static void main(String[] myArgs) {
        Toy toy1 = new Toy("Car", 102);
        Toy toy2 = new Toy("Ball", 2);
        Toy toy3 = new Toy("Aquarium", 1023);
        Toy toy4 = new Toy("Barbie", 21);

        System.out.println(toy1.getName());

        double weight = toy1.getWeight();
        System.out.println(weight);

        PlayRoom p1 = new PlayRoom();
        p1.addToy(toy1);
        p1.addToy(toy2);
        p1.addToy(toy3);
        p1.addToy(toy4);

//        System.out.println(p1.average());


    }
}
