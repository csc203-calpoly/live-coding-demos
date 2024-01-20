/**
 * A utility class containing several overloads of a report method.
 */
public class Reporter {
   public static void report(Object obj) {
       /*?
        * Type:Keyword
        * Anchor:obj 
        * ---
        * When an object is printed, Java will implicitly call that object's `toString` method. In this code, it is the same as if we had called `obj.toString()` here.
        * The default `toString` behaviour for an `Object` is not terribly useful---it simply prints the object's class name and memory address.
        */
       System.out.println("Object:   " + obj);
   }

   public static void report(Circle circ) {
       /*?
        * Type:Keyword
        * Anchor: circ
        * ---
        * When an object is printed, Java will implicitly call that object's `toString` method. In this code, it is the same as if we had called `circ.toString()` here.
        */
       System.out.println("Circle:   " + circ);
   }

   public static void report(int x, int y) {
       System.out.println("Two ints: " + x + " " + y);
   }
}




