import java.util.HashMap;
import java.util.Map;

/*?
* Type:Keyword
* Anchor:public class CompareCohorts
* Sequence:1
* ---
* We use this class as our "driver", i.e., it contains the entry point for our overall program.
* This class is responsible for creating the objects that we will use to store our data.
*
* Although we don't intend to create _instances_ of the `CompareCohorts` class, we still need to wrap this code inside a class, because all Java code must be run inside a class. So it goes.
*/
public class CompareCohorts {
   /*?
   * Type:Keyword
   * Anchor:public static void main(String[] args)
   * ID:main-method
   * Sequence:2
   * ---
   * The main method is the entry point for our program.  It is the method that is called when we run the `CompareCohorts` class.
   * It is important for all parts of this method signature to be present, otherwise it will not be treated as the entry point.
   *
   * We will talk about the meaning of `static` in the next lesson.
   * 
   * +++
   * 
   * Type:Internal
   * Parent:main-method
   * Anchor:method signature
   * Sequence:3
   * ---
   * The _signature_ of a method is composed of its **name**, **parameter list**, **return type**, and any modifiers like `public` and `static`. The first two components (name and parameter list)together will uniquely identify a method within a class. I.e., there can never exist multiple methods in one class with the same name and parameter types.
   */
   public static void main(String[] args) {
      /*?
      * Type:Block
      * Range:4
      * Title:Creating objects
      * Sequence: 4
      * ---
      * Here, we use the constructor from the `CsCohort` class to create four
      * objects.  Each object represents a cohort of students that entered the CS program.
      * 
      * +++
      * 
      * Type:Keyword
      * Anchor: new
      * Sequence: 5
      * ---
      * The `new` keyword is used in Java to create new objects.
      */
      CsCohort year1 = new CsCohort(2012, 132, .932);
      CsCohort year2 = new CsCohort(2013, 172, .924);
      CsCohort year3 = new CsCohort(2014, 157, .936);
      CsCohort year4 = new CsCohort(2015, 172, .977);

      /*?
       * Type:Block
       * Range:8
       * Title:Accessing data
       * Sequence: 6
       * ---
       * We can access data stored within each object by calling its instance methods that expose that data.
       * 
       * In the code below, if we try to directly access data from the object, e.g., by writing `year1.year`, our code would not compile. The `year` variable is marked as `private` in the `CsCohort` class, so it is not visible here except through the public `getYear` method.
       */
      System.out.println("The number of students still enrolled after one"
          + " year: " +  year1.retained() + " in " + year1.getYear());
      System.out.println("The number of students still enrolled after one"
          + " year: " +  year2.retained() + " in " + year2.getYear());
      System.out.println("The number of students still enrolled after one"
          + " year: " +  year3.retained() + " in " + year3.getYear());
      System.out.println("The number of students still enrolled after one"
          + " year: " +  year4.retained() + " in " + year4.getYear());

      /*?
       * Type:Block
       * Range:1
       * Title:Mutating data
       * Sequence: 7
       * ---
       * We can use the setter method to change the value of the `year1` object's `retainedPercent` field.
       */
      year1.setRetainedPercent(0.95);

      /*?
       * Type:Block
       * Range: 1
       * Title: HashMap
       * Sequence: 8
       * ---
       * We declare and initialise a HashMap here.
       * Notice that the left-hand side of the declaration
       * uses the `Map` type, while the right-hand side uses the `HashMap` type. We will talk about this when we talk about [interfaces](../07-interfaces/).
       */
      Map<String, CsCohort> theCohorts = new HashMap<>();

      /*?
       * Type:Block
       * Range:4
       * Title:Adding objects to the map
       * Sequence: 9
       * ---
       * We use the `put` method to add data to the map.
       * The first argument is the _key_, and the second argument is the _value_.
       * Duplicate keys are not allowed; if you add an object using a key that already
       * exists in the map, the old value will be overwritten with the new value.
       */
      theCohorts.put("year1", year1); 
      theCohorts.put("year2", year2); 
      theCohorts.put("year3", year3); 
      theCohorts.put("year4", year4); 

      /*?
       * Type:Block
       * Range:5
       * Title:Iterating over the map
       * Sequence: 10
       * ---
       * We use the `entrySet` method to get a set of all the key-value pairs
       * in the map. We can then iterate over the set using a for-each loop.
       *
       * +++
       *  
       * Type:Keyword
       * Anchor:Map.Entry<String, CsCohort>
       * Sequence:11
       * ---
       * This is the _data type_ of each element in the entry set. It looks a little
       * wonky, so here's what each part is saying. The `Map.Entry` part says that
       * `Entry` is an internal class within the `Map` class (i.e., a class within a class; sometimes this is okay). The
       * `<String, CsCohort>` part says that each map entry, like the map itself,
       * has a key of type `String` and a value of type `CsCohort`.
       */
      for (Map.Entry<String, CsCohort> entry : theCohorts.entrySet() ) {
         if (entry.getValue().retained() > 150) {
            System.out.println("More than 150 students for: " + entry.getKey());
            System.out.println("which is: " + entry.getValue().getYear());
         }
      }  

      /*?
       * Type:Block
       * Range:6
       * Title:Iterating over the map
       * Sequence:12
       * ---
       * We can also iterate over the map using the `keySet` method.
       * This method returns a set of all the keys in the map.
       * By looping over the set of keys, we can obtain all the values one at a time.
       */
      for (String key : theCohorts.keySet()) {
         if (theCohorts.get(key).retained() > 150) {
            System.out.println("More than 150 students for: " + key);
            System.out.println("which is: " + theCohorts.get(key).getYear());
         }
      }
   }
}

