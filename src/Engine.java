import java.io.Serializable;

public class Engine implements Serializable {
    private int horsepower;
    private double displacement;
    private int numberOfCylinders;

    public Engine(int horse, double displacement, int cylinders) {
        horsepower = horse;
        this.displacement = displacement;
        numberOfCylinders = cylinders;
    }

    public String toString() {
        return " horsepower: " + horsepower + " displayment" + displacement +
                " numberOfCyl " + numberOfCylinders;
    }
}
