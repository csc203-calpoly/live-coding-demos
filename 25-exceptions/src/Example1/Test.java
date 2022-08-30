package Example1;
import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        // someMethod(3);
        junkFunc(null);
        try
        {
            double div = someMethod(5);
        } catch (NullPointerException e) {
           System.out.println("NullPointer Exception: " + e.getMessage());
           return;
        } catch (ArithmeticException e) {
           System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Guaranteed to run
           System.out.println("out of try-catch block");
        }

        System.out.println("Continuing main...");
    }
    
    public static double someMethod(int x) 
    {
        return x / 0;
    }
    
    public static void otherFunc(Random r)
    {
        r.nextInt();
    }

    public static void junkFunc(Random r) throws NullPointerException
    {
        try {
           r.nextInt();
        }
        catch (NullPointerException e)
        {
            System.out.println("Not cool...");
        }
    }

}
