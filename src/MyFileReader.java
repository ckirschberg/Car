import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileReader {
    public static void main(String[] args) {
        MyFileReader fileReader = new MyFileReader();
        boolean didOpen = fileReader.openFile("/Users/christiankirschberg/IdeaProjects/Car/src/filename1.txt");

        if (didOpen) {
            while (fileReader.getScanner().hasNextLine()) {
                System.out.println(fileReader.readAndReturnOneLine());
            }

            fileReader.closeFileAfterUse();
        }
    }

    private Scanner input;
    private ArrayList<String> strings = new ArrayList<>();

    public Boolean openFile(String filename)
    {
        Boolean success = false;
        File f = new File(filename);

        try {
            input = new Scanner(f); //Notice how this generates an error. You are forced to define how to handle an exception thrown here.
            success = true;
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error. File not found");
        }

        return success;
    }

    public Scanner getScanner() {
        return input;
    }

    public void closeFileAfterUse()
    {
        //insert code here to close the file after use.
        input.close();
    }

    public String readAndReturnOneLine()
    {
        String line = "";

        //insert code here to read a line in the file.
        //if (input.hasNextLine()) {
            line = input.nextLine();
        //}


        return line;
    }
}
