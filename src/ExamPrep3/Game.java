package ExamPrep3;

public class Game {

    public Game() {
        Dice d = null;
        //int counter = 0;

        do {
            d = new Dice();
            //counter++;
        } while(d.getNumber() != 6);

        System.out.println("Created " + Dice.getCounter() + " dices to get a 6");
    }
}
