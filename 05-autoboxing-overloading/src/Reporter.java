public class Reporter
{
   public static void report(Object o)
   {
      System.out.println("Object:   " + o);
   }

   public static void report(Circle c)
   {
      System.out.println("Circle:   " + c);
   }

   public static void report(int x, int y)
   {
      System.out.println("Two ints: " + x + " " + y);
   }
}
/*Overload resolution:
1) Exact match
2) Closest Is-A relationship
3) Can it be converted?
Resolution done at compile time (based on static type)
*/




