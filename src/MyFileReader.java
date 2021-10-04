import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader {
    private Scanner input;

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
    }

    public String readAndReturnOneLine()
    {
        String line = "";

        //insert code here to read a line in the file.

        return line;
    }
}
