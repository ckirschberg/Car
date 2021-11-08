public class DogHotel {
    Dog[] dogs = new Dog[4];

    public void assignDog(int index, Dog dog) {
        dogs[index] = dog;
    }

    public Dog findLightestDog() {
        Dog ligtestDog = dogs[0];
        for(int i=1; i < dogs.length; i++) {
            if (ligtestDog.getWeight() > dogs[i].getWeight()) {
                ligtestDog = dogs[i];
            }
        }
        return ligtestDog;
    }
}
