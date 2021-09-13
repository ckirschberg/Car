public class Main {

    public static void main(String[] args) {
        // Create an object
        // Classname name = new Classname();
        Car mustang = new Car("Blue", "Ford");
        Engine v6 = new Engine(600,  6.0, 6);
        mustang.setEngine(v6);
        System.out.println(mustang);

        Car c1 = new Car();
        c1.setColor("Blue");
        c1.setBrand("Honda");
        c1.setNumberOfSeats(4);
        System.out.println(c1);



        // breaking encapsulation rule on purpose
        // access attributes: objectname.attributename
//      mustang.setColor("Blue");
        //mustang.brand = "Ford";
        mustang.numberOfSeats = 5;
        mustang.isWorking = false;
        mustang.acceleration = 4.3;

        mustang.printColor();
        //System.out.println("The mustang is: " + mustang.color);


        // Calling a method
        // objectName.methodName(*parameters*);
        mustang.setColor("Black");

        System.out.println("The mustang is now: " + mustang.getColor());




        Car mercedes = new Car();
        mercedes.setColor("Black");
        mercedes.brand = "Mercedes";
        mercedes.numberOfSeats = 7;
        mercedes.isWorking = true;
        mercedes.acceleration = 4.6;

        System.out.println("Is the mercedes working? " + mercedes.isWorking);
        System.out.println(mercedes);







    }
}
