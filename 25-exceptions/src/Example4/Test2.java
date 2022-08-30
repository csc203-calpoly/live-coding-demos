package Example4;
import java.util.*;
import java.io.*;

public class Test2
{
    public static void main(String[] args)
    {
        String filename;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a file to sum: ");
        filename = in.next();

        try {
           sum = readFile(filename);
        }
        catch (FileNotFoundException e) 
        {
           System.out.println("Couldn't open file: " + filename +
                              "\n" + e.getMessage());
           return;
        }
        catch (FileFormatException e)
        {
           System.out.println(e.getMessage());
           return;
        }
        
        System.out.println("Sum of the ints: " + sum);
    }
    
    private static int readFile(String filename) throws FileFormatException, FileNotFoundException
    {
        File inFile = new File(filename);
        Scanner in = null;
        int total = 0, position = 0;
        String input = "";
        
        try {
           in = new Scanner(inFile);
           
           while (in.hasNext())
           { 
              position++; 
              input = in.next();
              total += Integer.parseInt(input);
           }
        }
        catch (NumberFormatException e)
        {
            throw new FileFormatException(input, position);
        }
        finally
        {
           if (in != null)
              in.close();
        }
        return total;
    }    
}



