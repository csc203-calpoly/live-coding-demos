package Example4;
import java.util.*;
import java.io.*;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        String filename;
        int sum;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a file to sum: ");
        filename = in.next();
        
        sum = readFile(filename);
        
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



