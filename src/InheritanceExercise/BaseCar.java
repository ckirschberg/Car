package InheritanceExercise;

public abstract class BaseCar {
    protected double length;
    protected double width;
    protected String color;

    public BaseCar() {}
    public BaseCar(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public abstract void drive();

    public void print() {
        System.out.println("BaseCar - length: " + length + " - width: " + width + " - color: " + color);
    }
}
