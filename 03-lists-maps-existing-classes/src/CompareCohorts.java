import java.util.HashMap;
import java.util.Map;

/*?
 * We use this class as our "driver", i.e., it contains the entry point for our overall program.
 * This class is responsible for creating the objects that we will use to store our data.
 */
public class CompareCohorts {

   /*?
    * Keyword: public static void main(String[] args)
    * The main method is the entry point for our program.  It is the method that is called when
    * we run the <code>CompareCohorts</code> class. It is important for all parts of this
    * method signature to be present, otherwise it will not be treated as the entry point.
    *
    * We will talk about the meaning of <code>static</code> in the next lecture.
    */
   public static void main(String[] args) {

      /*?
       * Block:4
       * Creating objects
       * Here, we use the constructor from the <code>CsCohort</code> class to create four
       * objects.  Each object represents a cohort of students that entered the CS program.
       * 
       * Keyword: new
       * The <code>new</code> keyword is used in Java to create to new objects.
       */
      CsCohort year1 = new CsCohort(2012, 132, .932);
      CsCohort year2 = new CsCohort(2013, 172, .924);
      CsCohort year3 = new CsCohort(2014, 157, .936);
      CsCohort year4 = new CsCohort(2015, 172, .977);

      /*?
       * Block:8
       * Accessing data
       * We can access data stored within each object by calling its instance methods
       * that expose that data.
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
       * Block:1
       * Mutating data
       * We can use the setter method to change the value of the <code>year1</code> object's
       * <code>retainedPercent</code> field.
       */
      year1.setRetainedPercent(0.95);

      /*?
       * Block:1
       * HashMap
       * We declare a hash map below. Notice that the left-hand side of the declaration
       * uses the <code>Map</code> type, while the right-hand side uses the <code>HashMap</code>
       * type. We will talk about this in week 3.
       */
      Map<String, CsCohort> theCohorts = new HashMap<>();

      /*?
       * Block:4
       * Adding objects to the map
       * We use the <code>put</code> method to add data to the map.
       * The first argument is the key, and the second argument is the value.
       * Duplicate keys are not allowed; if you add an object using a key that already
       * exists in the map, the old value will be overwritten with the new value.
       */
      theCohorts.put("year1", year1); 
      theCohorts.put("year2", year2); 
      theCohorts.put("year3", year3); 
      theCohorts.put("year4", year4); 

      /*?
       * Block:7
       * Iterating over the map
       * We use the <code>entrySet</code> method to get a set of all the key-value pairs
       * in the map. We can then iterate over the set using a for-each loop.
       * 
       * Keyword:Map.Entry
       * This is the <i>data type</i> of each element in the entry set. It looks a little
       * wonky, so here's what each part is saying. The <code>Map.Entry</code> part says that
       * <code>Entry</code> is an internal class within the </code>Map</code> class. The
       * <code><String, CsCohort></code> part says that each entry set, like the map itself,
       * has a key of type <code>String</code> and a value of type <code>CsCohort</code>.
       */
      for (Map.Entry<String, CsCohort> entry : theCohorts.entrySet() ) {
         if (entry.getValue().retained() > 150) {
            System.out.println("More than 150 students for: " + 
                                entry.getKey());
            System.out.println("which is: " + entry.getValue().getYear());
         }
      }  

      /*?
       * Block:8
       * Iterating over the map
       * We can also iterate over the map using the <code>keySet</code> method.
       * This method returns a set of all the keys in the map.
       */
      for (String key : theCohorts.keySet())
      {
         if (theCohorts.get(key).retained() > 150) 
         {
            System.out.println("More than 150 students for: " + key);
            System.out.println("which is: " + theCohorts.get(key).getYear());
         }
      }
   }
}
