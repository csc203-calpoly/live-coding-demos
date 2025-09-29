package PACKAGE_NAME;
import java.util.*;
import java.awt.Point;

public class ArraysDemo {
    public static void main (String args[]) {
        // Only standard arrays use square brackets []
        // Classes, like ArrayList, use carrot style brackets <> to reference input types
        ArrayList<String> list = new ArrayList<>();
        list.add("alpha");
        list.add("beta");
        // Print formatter with sting, number and newline
        System.out.printf("%s, %d %n",list.get(0), list.size());

        // Boxed types Integer, Character, etc. are objects that wrap primitives
        // Notice how we can't use int here, can't mix primitive and boxed types
        int[] immutableList = {3,4,5};
        Integer[] theSameList = {3,4,5};
        LinkedList<Integer> numbers = new LinkedList<Integer>(Arrays.asList(theSameList));
        numbers.add(6);
        System.out.println(numbers);

        // Maps are like python dict
        // Note, input types can be any object
        HashMap<Integer, Point> locations = new HashMap<>();
        locations.put(1, new Point(3, -5));
        locations.put(2, new Point(4, 2));
        System.out.println(locations);
        System.out.println(locations.containsKey(3));
    }
}
