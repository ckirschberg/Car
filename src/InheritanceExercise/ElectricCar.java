package InheritanceExercise;

public class ElectricCar extends BaseCar {
    private double range;

    public ElectricCar(double length, double width, String color, double range) {
        super(length, width, color);
        this.range = range;
    }

    public void drive() {
        System.out.println("Real silent electric car running");
    }
    public void print() {
        System.out.println("length: " + length + ", width: " +
                width + ", color: " + color + ", range: " + range);
    }
}
