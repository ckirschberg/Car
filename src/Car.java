// Car in singular form.
public class Car {
    // Attribute, field, instance variable, etc.
    private String color;
    String brand;
    int numberOfSeats;
    boolean isWorking; // Can the car run?
    double acceleration; // 0-100 km/h

    private Engine engine;




    // Multiple constructors to create objects in different ways.
    public Car()
    {}

    // Takes color and brand to create an object.
    public Car(String color, String brand)
    {
        this.setColor(color);
        this.setBrand(brand);
        //this.color = color;
        //this.brand = brand;
    }
    public Car(String color, String brand, int numberOfSeats)
    {
        this.setColor(color);
        this.setBrand(brand);
        this.setNumberOfSeats(numberOfSeats);
        //this.color = color;
        //this.brand = brand;
    }


    // Method definition - must be in class
    // ** means optional
    // public returnType name(** Type name, Type name)
    // {
    // Code that does something
    // }
    public void printColor()
    {
        System.out.println(this.color);
    }

    // get method for color
    public String getColor() {
        return color;
    }

    // set method for color
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setEngine(Engine myEngine) {
        this.engine = myEngine;
    }


    /*
    public void setColor(String newColor)
    {
        color = newColor;
    }
    */

    // Overwriting the toString method.
    public String toString(){
        return "Brand: " + getColor() + " color: " + color + " seats: " + numberOfSeats + " acceleration: " + acceleration + " horsepower: ";
    }


}
