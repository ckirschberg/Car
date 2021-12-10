package ExamPrep1;

public class FlowerStore {
    private String name;
    private double balance;
    private Flower[][] flowers = new Flower[4][3];


    public void setFlower(int x, int y, Flower flower) {
        flowers[x][y] = flower;
    }

    public FlowerStore(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean sellFlower(Customer customer, int x, int y) {
        //customer.subtractAmount(flowers[x][y].getPrice());

        Flower flower = flowers[x][y];
        if (flower == null) {
            System.out.println("There is no flower at that position");
            return false;
        }
        double price = flower.getPrice();
        if (customer.getBalance() >= price) {
            customer.subtractAmount(price);
            balance += price;
            flowers[x][y] = null;
            System.out.println(flowers[x][y]);
            return true;
        }
        return false;
    }




    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
}
