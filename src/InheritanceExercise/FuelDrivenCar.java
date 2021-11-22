package InheritanceExercise;

public class FuelDrivenCar extends BaseCar {
    private double mpg;
    private double engineSize;

    public FuelDrivenCar(double length, double width, String color, double mpg, double engineSize) {
        super(length, width, color);
        this.mpg = mpg;
        this.engineSize = engineSize;
    }

    public void drive() {
        System.out.println("Noisy fuel driven car running");
    }

    public void print() {
        System.out.println("length " + length + ", width: " + width +
                ", color" + color + ", mpg" + mpg + ", engineSize: " + engineSize);
    }
}
