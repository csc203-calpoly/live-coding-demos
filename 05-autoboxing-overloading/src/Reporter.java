/**
 * Code annotated using <a href="https://www.cs.mcgill.ca/~martin/casdoc/index.html">Casdoc</a>.
 */
public class Reporter {
   public static void report(Object obj) {
      System.out.println("Object:   " + o);
   }

   public static void report(Circle circ) {
      /*?
       * Keyword:circ
       * When an object is printed, Java will implicitly
       * call that object's <code>toString</code> method.
       * In this code, it is the same as if we had called <code>circ.toString()</code> here.
       * 
       * If we had not written a sensible <code>toString</code> in the <code>Circle</code> class,
       * Java would have instead simply printed the memory address of the object. (e.g., something like) <code>Circle@1a2b3c4d</code>
       */
      System.out.println("Circle:   " + circ);
   }

   public static void report(int x, int y) {
      System.out.println("Two ints: " + x + " " + y);
   }
}





