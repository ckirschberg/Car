public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sam", 12);
        Dog dog2 = new Dog("Frans", 32);
        Dog dog3 = new Dog("Lars", 21);
        Dog dog4 = new Dog("Peter", 45);

        dog1.bark();
        dog1.setWeight(22);

        DogHotel hotel = new DogHotel();
        hotel.assignDog(0, dog1);
        hotel.assignDog(1, dog2);
        hotel.assignDog(2, dog3);
        hotel.assignDog(3, dog4);

        Dog ligtest = hotel.findLightestDog();
        System.out.println(ligtest.getName());
    }
}
