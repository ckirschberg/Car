import java.util.ArrayList;

public class CarDealer {
    private String name;
    private ArrayList<Car> carsForSale = new ArrayList<Car>();

    public CarDealer(String name) {
        this.name = name;
    }

    public void addCar(Car car) {
        carsForSale.add(car);
    }
    public void printCars() {
        System.out.println("Currently we stock the following cars:");
        for(Car currentCar: carsForSale) {
            System.out.println(currentCar);
        }
    }

    public void printCarsOfColor(String color) {
        System.out.println("We have the following " + color + " cars for sale:");

        boolean foundMatch = false;
        for(Car currentCar: carsForSale) {
            if(currentCar.getColor().equalsIgnoreCase(color)) {
                System.out.println(currentCar);
                foundMatch = true;
            }
        }
        if (!foundMatch) {
            System.out.println("There are no such cars");
        }


    }


}
