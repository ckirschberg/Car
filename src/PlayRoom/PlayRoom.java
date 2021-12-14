package PlayRoom;

import java.util.ArrayList;

public class PlayRoom {
    private ArrayList<Toy> toys = new ArrayList<>();

    public void addToy(Toy toy) {
        if (toy.getWeight() < 1000) {
            toys.add(toy);
        }
    }
    public void average() {
        double weight = 0;
        for(Toy t : toys) {
            weight += t.getWeight();
        }
        System.out.println(toys.size());
        System.out.println(weight / toys.size());
    }
}
