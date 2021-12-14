package ExamPrep2;

public class Planet {
    private String name;
    private double size;
    private boolean isHabitable;

    public Planet(String name, double size, boolean isHabitable) {
        this.name = name;
        this.size = size;
        this.isHabitable = isHabitable;
    }

    public String toString() {
        return this.name + " " + this.size + " is habitable: " + isHabitable;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public boolean isHabitable() {
        return isHabitable;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setHabitable(boolean habitable) {
        isHabitable = habitable;
    }
}
