package ExamPrep3;

import java.util.Random;

public class Dice {
    private int number;
    private Random random = new Random();
    private static int counter;

    public Dice() {
        this.number = random.nextInt(6) +1;
        System.out.println(this.number);
        counter++;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public static int getCounter() {
        return counter;
    }
}
