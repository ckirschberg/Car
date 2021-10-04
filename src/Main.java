public class Main {

    public static void main(String[] args) {
        // Create an object
        // Classname name = new Classname();
        Car mustang = new Car("Blue", "Ford");
        Engine v6 = new Engine(600,  6.0, 6);
        mustang.setEngine(v6);
        System.out.println(mustang);

        Car c1 = new Car();
        Engine slow = new Engine(45, 1.0, 3);
        c1.setEngine(slow);
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
        Engine e1 = new Engine(200, 3, 6);
        mercedes.setEngine(e1);
        mercedes.setColor("Black");
        mercedes.brand = "Mercedes";
        mercedes.numberOfSeats = 7;
        mercedes.isWorking = true;
        mercedes.acceleration = 4.6;

        System.out.println("Is the mercedes working? " + mercedes.isWorking);
        System.out.println(mercedes);

        CarDealer dealer1 = new CarDealer("Zaland's special cars");
        dealer1.addCar(mustang);
        dealer1.addCar(mercedes);
        dealer1.addCar(c1);

        dealer1.printCars();
        dealer1.printCarsOfColor("black");


        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 4;
        System.out.println("---------------");
        for(int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        Car[] cars = new Car[2];
        cars[0] = new Car("Black", "Citroen");
        cars[1] = new Car("Red", "Ferrari");
        System.out.println(cars[0].getColor());
        for(int i=0; i < cars.length; i++) {
            System.out.println(cars[i].getColor());
        }

        MyMath myMath1 = new MyMath();
        MyMath myMath2 = new MyMath();
        System.out.println("result of 1+2: " +
                MyMath.add(1,2));

        System.out.println(myMath1.add(1,2));
        System.out.println(myMath1.a);

        myMath1.a = 2;

        System.out.println(myMath2.a);

        System.out.println(MyMath.add(1.5, 1.3));

        int[][] numbersIn2Dim = new int[2][3];
        numbersIn2Dim[0][0] = 1;
        numbersIn2Dim[0][1] = 2;
        numbersIn2Dim[0][2] = 3;

        numbersIn2Dim[1][0] = 4;
        numbersIn2Dim[1][1] = 5;
        numbersIn2Dim[1][2] = 6;

        for(int i=0; i < numbersIn2Dim.length; i++) {
            for(int j=0; j < numbersIn2Dim[i].length; j++) {
                System.out.println(numbersIn2Dim[i][j]);
            }
        }

    }
}
