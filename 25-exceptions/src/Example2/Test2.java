package Example2;
import java.util.*;
import java.io.*;

public class Test2
{
    public static void main(String[] args) throws FileNotFoundException {
        // checked and unchecked exceptions
        // Checked exceptions: handled at compile time
        // Unchecked exceptions: ok if not handled at compile time

        readFile();
    }

    public static void readFile() throws FileNotFoundException {
        File inFile = new File("junk.txt");
        Scanner in = new Scanner(inFile);

        while (in.hasNext())
        {
            System.out.println(in.nextLine());
        }
        in.close();
    }
}
