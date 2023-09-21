import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;

public class Demo {

    @Test
    public void basicDataTypes() {
        // ====================== BASIC DATA TYPES ===========================
        // Every variable must have a type that is set at compile time.
        int x = 5; // declaring and initialising
        int z; // can declare a variable without giving it a value
        z = 10; // assign a value to a declared variable
//      z = 10.5;  // This won't compile!
        double y = 2;
        char letter = 'A';
        String make = "Santa Cruz";
        String model = "Bronson";
    }

    @Test
    public void arrays() {
        int[] scores = {83, 42, 77, 92, 73, 95, 81, 42}; // Size is fixed!

        // Index into the array (0-indexed)
        int fortyTwo = scores[1];
        scores[1] = 43;

        int num = scores[12];

        // Arrays have fixed types. Can't do this:
//        scores[5] = "This isn't a number.";
    }

    @Test
    public void primitiveAndReferenceTypes() {
        Point p = new Point(1, 2);
        Point q = new Point(1, 2);

        // p == q --> true or false?

        String make = "Santa Cruz";
        String model = "Bronson";

        // model == "Bronson" --> true or false?
    }

    @Test
    public void looping() {
        // Set up
        int[] scores = {83, 42, 77, 92, 73, 95, 81, 42};
        String make = "Santa Cruz";
        String model = "Bronson";

        // i can only be used (only has scope) inside the for loop
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + i + ": " + scores[i]);
        }

        // val can only be used (only has scope) in the for loop
        // scores is "iterable"
        for (int val : scores) {
            System.out.println(val);
        }

        int i = 0;  // The type of i must be declared.
        while (i < 8) {
            System.out.println(scores[i]);
            i++;  // Doesn't exist in Python
        } // Braces here are very important!!! What would happen without them?

        char[] charArray = model.toCharArray(); // Show String javadoc
        for (char c : charArray)
            System.out.println(c);

        for (i = 0; i < model.length(); i++) { // String javadoc
//            System.out.println(model[i]); // Can't index String
        }
    }

    /**
     * This is a function that multiplies the given string by the given number
     * The "void" in the first line indicates that the function does not return a value.
     * @param s A string
     * @param n A number
     */
    public static void printMult(String s, int n) // parameters must have types
    {
        for (int i = 0; i < n; i++)
            System.out.println(s);
    }
}
