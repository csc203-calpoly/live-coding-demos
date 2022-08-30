import java.awt.*;

public class JavaSample
{
   // In Java, everything must be inside a class
   // When the class is run, the method below will run
   public static void main(String[] args) // 
   {
      // Every variable must have a type that is set at compile time.
      int x = 5; // declaring and initialising
      int z; // can declare a variable without giving it a value
      z = 10; // assign a value to a declared variable
//      z = 10.5;  // This won't compile!
      double y = 12;
      char letter = 'A';
      String make = "Santa Cruz";
      String model = "Bronson";

      int[] scores = {83, 42, 77, 92, 73, 95, 81, 42}; // Size is fixed!

      Point p = new Point(1, 2);
      Point q = new Point(1, 2);

      System.out.println("p == q --> " + (p == q)); // false
      System.out.println("p.equals(q) --> " + p.equals(q)); // true

      // Equality comparisons for Strings
      System.out.println("model == \"Bronson\"" + (model == "Bronson")); // true
      // The line above will print "true" because the String literal "Bronson" has been
      // "interned" (or cached) by the compiler. So the model variable is pointing to the same
      // value in memory.
      // You should still use .equals to compare Strings!
      if (x == 10) {
         x = 3;
      } // Are the braces needed?

      // i can only be used (only has scope) inside the for loop
      for (int i = 0; i < scores.length; i++) // Could also use scores.length
         System.out.println("Score " + i + ": " + scores[i]);

      // val can only be used (only has scope) in the for loop
      for (int val : scores) // scores is "iterable"
         System.out.println(val);

      i = 0;  // The type of i must be declared.
      while (i < 8) {
         System.out.println(scores[i]);
         i++;  // Doesn't exist in Python
      } // Braces here are very important!!! What would happen without them?

      char[] charArray = model.toCharArray(); // Show String javadoc
      for (char c : charArray)
         System.out.println(c);

      for (i = 0; i < model.length(); i++)    // String javadoc
         System.out.println(model[i]); // Can't index String

      double pow = Math.pow(x, 3); // No ** operator (also no // operator)
      System.out.println(pow);

      printMult(model, 10);
      //printMult(10, 5); //Can't do, because of type checking
   }
   public static void printMult(String s, int n) // parameters must have types
   {
      for (int i = 0; i < n; i++)
         System.out.println(s);
   }
}
