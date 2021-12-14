package PlayRoom;

public class Toy {
    private String name;
    private double weight;

    public Toy(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
