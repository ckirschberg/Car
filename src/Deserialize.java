import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//https://www.tutorialspoint.com/java/java_serialization.htm
public class Deserialize {

    public static CarDealer readCarDealer() {
        CarDealer dealer = null;
        try {
            FileInputStream fileIn = new FileInputStream("carDealer.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            dealer = (CarDealer) in.readObject(); // type casting
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("CarDealer class not found");
            c.printStackTrace();
            return null;
        }
        System.out.println(dealer);
        System.out.println("Deserialized carDealer...");

        return dealer;
    }

    public static void main(String[] args) {
        CarDealer dealer = Deserialize.readCarDealer();
    }
}
