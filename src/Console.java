import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Console {
    public static void main(String[] args) throws IOException
    {
        boolean hitMe = true;
        ArrayList<Integer> randomNumbers = new ArrayList();
        Random random = new Random();
        while(hitMe) {
            System.out.println("Would you like another random number?");
            System.out.println("Write Yes or No");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String response = reader.readLine();
            if (response.equalsIgnoreCase("No")) {
                hitMe = false;
            }
            else if (response.equalsIgnoreCase("Yes")) {
                int randomNumber = random.nextInt(10);
                randomNumbers.add(randomNumber);
                System.out.println("Your random number was " + randomNumber);
            } else {
                System.out.println("You must answer Yes or No");
            }
        }
        if (randomNumbers.size() != 0) {
            System.out.println("Your random numbers: ");
            for (Integer integer : randomNumbers) {
                System.out.print(integer + " ");
            }
        } else {
            System.out.println("You quit before generating a random number");
        }
    }
}
