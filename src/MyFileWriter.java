import java.io.*;

public class MyFileWriter
{
    public static void main(String[] args) {

        try {
            MyFileWriter writer = new MyFileWriter();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
    public MyFileWriter() throws FileNotFoundException
    {
        File f = new File("results2.txt");
        FileOutputStream fos = new FileOutputStream(f, false);
        PrintStream output = new PrintStream(fos);
        output.println("Hi");
        output.println("dsafd");


        output.close(); //remember to close
    }
}