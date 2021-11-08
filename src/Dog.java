public class Dog {
    private String name;
    private double weight;

    public Dog(String n, double weight) {
        name = n;
        this.weight = weight;
    }

    public void bark() {
        System.out.println("Wouff");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
