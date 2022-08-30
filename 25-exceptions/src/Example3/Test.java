package Example3;

public class Test
{
    public static void main(String[] args) 
    {
        someMethod(-3);
    }
    
    public static void someMethod(int x) 
    {
         if (x >0)
            return;

         throw new CustomException(56, "bummer...");
    }
}
