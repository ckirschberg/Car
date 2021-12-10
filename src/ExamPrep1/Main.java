package ExamPrep1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Classname name = new Classname();
        /*
        ArrayList<Flower> flowers = new ArrayList<>();
        flowers.add(new Flower());
        flowers.get(0).setName("Tulip");
        */

        Flower f1 = new Flower(12.0, "Rose");

        // Objectname.methodName(*params values*)
        f1.setName("Forglemigej");

        Customer c1 = new Customer("Emie", 1000);
        c1.subtractAmount(20);
        System.out.println(c1.getBalance());

        FlowerStore store = new FlowerStore("Maggie's flowers", 5000);
        store.setFlower(0,0, f1);
        store.setFlower(0, 1, new Flower(10, "Rose"));
        store.setFlower(0,2, new Flower(15, "Narcis"));
        store.setFlower(3, 2, new Flower(16, "Waterlily"));

        System.out.println("Customer balance " + c1.getBalance());
        System.out.println("Store balance " + store.getBalance());
        store.sellFlower(c1,3,2);
        System.out.println("Customer balance " + c1.getBalance());
        System.out.println("Store balance " + store.getBalance());

        Customer c2 = new Customer("Emil", 10);
        if (!store.sellFlower(c2, 0, 2)) {
            System.out.println("Sorry, you do not have enough funds. Try again.");
        }
        if (store.sellFlower(c2, 0, 1)) {
            System.out.println("Good you found something you can afford.");
        }
        store.sellFlower(c1, 2, 2);
    }
}









