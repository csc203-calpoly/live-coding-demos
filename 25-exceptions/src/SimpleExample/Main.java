package SimpleExample;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        // What is an exception

        // try-catch syntax and semantics

        try {
            // Do some work that may or not result in an exception
            // but an exception is possible
            transformString(null);
        } catch(NullPointerException | IllegalArgumentException e) {
            System.out.println("An exception was thrown " + e.getMessage());
        } catch(FileNotFoundException fnfe) {

        }

        // throws declarations and the throw keyword
    }

    public static void transformString(String str) throws FileNotFoundException {
        System.out.println(str.toLowerCase());
    }
}
