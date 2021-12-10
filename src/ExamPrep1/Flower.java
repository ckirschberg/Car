package ExamPrep1;

public class Flower {
    private String name;
    private double price;

    // Constructor - no return type and same name as class
    public Flower(double price, String name) {
        this.name = name;
        this.price = price;
    }

    // public returnType name(*parameters: Type name, Type name, ...*)
    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }










}
