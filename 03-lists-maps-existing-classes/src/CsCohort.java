/*?
 * Type: Keyword
 * Anchor: public class CsCohort
 * ID: class-declaration 
 * Sequence:0
 * ---
 * This is the *declaration* of a public class called `CsCohort`.
 * 
 * +++
 * 
 * Type: Internal
 * Parent: class-declaration
 * Anchor: public
 * Sequence: 1
 * ---
 * `public` indicates that this class is visible to and can be used by other classes.
 */
public class CsCohort {

   /*?
   * Type: Block
   * Title: Instance variables
   * ID: instance-vars
   * Range: 11
   * Sequence:2
   * ---
   * These are the _instance variables_ of this class.
   * Each `CsCohort` object will have its own `year`, `enrolled`, and
   * `retainedPercent`.
   */ 
   private int year;
   /*?
    * Type: Keyword
    * Anchor: final 
    * Sequence: 3
    * ---
    * `final` indicates that this variable's value cannot be changed after it is initialized.
    */
   private final int enrolled;
   private double retainedPercent;

   /*?
    * Type: Block
    * Range: 17
    * Title: Constructor
    * Sequence: 4
    * ---
    * This is the `constructor` for the `CsCohort` class.
    * The constructor's job is to create a new `CsCohort` object.
    * Here, the constructor takes in 3 parameters — the values of these parameters are given to the instance variables.
    */
   public CsCohort(int year, int inEnroll, double inPercent) {
      /*?
      * Type:Keyword
      * Anchor:this
      * Sequence: 5
      * ---
      * `this` is the keyword used for the object to refer to itself.
      * So, in this example, `this.year` refers to this particular `CsCohort` object's `year` instance variable.
      * Notice that some of constructor parameters have the same name as the instance variables.
      * In this case, `this` is necessary to help the compiler distinguish between the two.
      * For variables where the instance variable and local variables are not named the same, you don't _need_ to use `this`, but I still recommend it because it makes your code more clear.
      */
      this.year = year;
      this.enrolled = inEnroll;
      this.retainedPercent = inPercent;
   }

   /*?
   * Type:Block
   * Range:71
   * Title: Instance methods
   * Sequence:6
   * ---
   * These are the _behaviours_ that each `CsCohort` can perform, using
   * its instance variables. We refer to these behaviours as _instance methods_.
   * 
   * +++
   * 
   * Type:Block
   * Range:3
   * Title:Getter method
   * Sequence:7
   * ---
   * This is a _getter_ method or _accessor_ method.
   * It returns the value of the `year` instance variable.
   * 
   * +++
   * 
   * Type:Keyword
   * Anchor:public
   * Sequence:8
   * ---
   * `public` indicates that the method is visible to other classes. That is, when other classes have a `CsCohort` object, they can call this method on that object.
   * 
   * +++
   *
   * Type:Keyword
   * Anchor:int
   * Sequence:9
   * ---
   * `int` is the return type of this method. It indicates that this method returns an integer value. The return type here is dictated by the data type of the `year` instance variable.
   */
   public int getYear() {
      return this.year;
   }

   /*?
   * Type:Block
   * Range:3
   * Title:Setter method
   * Sequence:10
   * ---
   * This is a _setter_ method or _mutator_ method.
   * It sets the value of the `year` instance variable.
   * 
   * +++
   * 
   * Type:Keyword
   * Anchor: int year
   * Sequence:12
   * ---
   * Unlike the getter method above, this setter method takes in a parameter, which is the new value to be given to the `year` instance variable. The type of that parameter needs to match the type of the instance variable.
   * 
   * +++
   *
   * Type:Keyword
   * Anchor:void
   * Sequence:11
   * ---
   * Since this method's job is only to change the value of the `year` instance variable, it does not return anything. Hence its return type is declared as `void`. 
   */
   public void setYear(int year) {
      this.year = year;
   }

   /*?
   * Type:Block
   * Range:3
   * Title: public int getEnrolled
   * Sequence: 13
   * ---
   * We only provide a getter method for the `enrolled` instance variable, but not a setter method.
   * This means that no other class that modify this `CsCohort`'s `enrolled` value, but they can still read it.
   */
   public int getEnrolled() {
      return this.enrolled;
   }

   public double getPercent() {
      return this.retainedPercent;
   }

   /*?
   * Type:Block
   * Range:8
   * Title: setRetainedPercent(double newPercent)
   * Sequence: 14
   * ---
   * This is a setter method for the `retainedPercent` instance variable.
   * We use this setter method to perform some validation on the `newPercent` parameter, before we assign its value to the `retainedPercent` instance variable.
   */
   public void setRetainedPercent(double newPercent) {
      if (newPercent >= 0 && newPercent <= 1) {
         this.retainedPercent = newPercent;
      } else {
         // newPercent is not a valid value; print an error message
         System.out.println("Expected a value between 0 and 1");
      }
   }

   public int retained() {
      return (int) (this.retainedPercent * this.enrolled);
   }
}

