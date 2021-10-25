import java.io.*;

public class MyFileWriter
{
    private File f = new File("results2.txt");
    private FileOutputStream fs = new FileOutputStream(f, false);
    private PrintStream output = new PrintStream(fs);

    public MyFileWriter() throws FileNotFoundException
    {

    }

    public static void main(String[] args) {

        try {
            MyFileWriter writer = new MyFileWriter();

            //writer.writeCarToFile(new Car("Black", "Ford"));

            Car[] myCars = new Car[2];
            myCars[0] = new Car("Yellow", "Citroen");
            myCars[1] = new Car("Red", "Jaguar");

            writer.writeCarArraytoFile(myCars);
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch(Exception e) {

        }



    }

    public void writeCarArraytoFile(Car[] cars) {
        for(int i=0; i < cars.length; i++) {
            writeCarToFile(cars[i]);
        }
    }


    public void writeCarToFile(Car c) {
        output.print(c.getColor() + " ");
        output.print(c.brand + " ");
        output.println();
    }

    public void testWrite() {

        output.println("Christian 42 179");
        output.print("Hans ");
        output.print("22 ");
        output.print("189 ");
        output.println();
        output.println("Helle 24 167");
        output.close(); //remember to close
    }

}