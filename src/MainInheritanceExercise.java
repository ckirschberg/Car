import InheritanceExercise.BaseCar;
import InheritanceExercise.ElectricCar;
import InheritanceExercise.FuelDrivenCar;

import java.util.ArrayList;

public class MainInheritanceExercise {
    public static void main(String[] args) {
        FuelDrivenCar fuelCar = new FuelDrivenCar(4.2,
                2.2, "Red", 24.3, 3.5);

        ElectricCar electricCar = new ElectricCar(4.5, 2.3,
                "Black", 456);

        ArrayList<BaseCar> cars = new ArrayList<>();
        cars.add(fuelCar);
        cars.add(electricCar);

        for(BaseCar car : cars) {
            car.print();
            car.drive();
        }

        int number = 0;
        do {
            System.out.println("Nayeem " + number);
            number++;
        } while (number < 6);





    }
}
