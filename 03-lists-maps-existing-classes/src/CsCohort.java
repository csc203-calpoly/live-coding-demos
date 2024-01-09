/*?
 * Keyword: public class CsCohort
 * This is the <i>declaration</i> of a class called <code>CsCohort</code>.
 * The <code>public</code> keyword means that this class can be used by other classes.
 */
public class CsCohort {

   /*?
    * Block:3
    * These are the <i>instance variables</i> of this class.
    * Each <code>CsCohort</code> object will have its own <code>year</code>, <code>enrolled</code>, and <code>retainedPercent</code>.
    * <code>retainedPercent</code> is also marked as <code>final</code>, which means that its value cannot be changed after it is initialized.
    */
   private int year;
   private final int enrolled;
   private double retainedPercent;

   /*?
    * Block:1
    * Constructor
    * This is the <i>constructor</i> for the <code>CsCohort</code> class.
    * The constructor's job is to create a new <code>CsCohort</code> object.
    * Here, the constructor takes in 3 parameters — the values of these parameters are given to the instance variables.
    */
   public CsCohort(int year, int inEnroll, double inPercent) {
    /*?
    * Keyword:this
    * <code>this</code> is the keyword used for the object to refer to itself. So, in this example, <code>this.year</code>
    * refers to this particular <code>CsCohort</code> object's <code>year</code> instance variable. Notice that some of
    * constructor parameters have the same name as the instance variables. In this case, <code>this</code> is necessary
    * to help the compiler distinguish between the two.
    */
      this.year = year;
      this.enrolled = inEnroll;
      this.retainedPercent = inPercent;
   }

   /*?
    * Block:3
    * Getter method
    * This is a <i>getter</i> method or <i>accessor</i> method.
    * It returns the value of the <code>year</code> instance variable.
    *
    * Keyword:public
    * <code>public</code> indicates that the method is visible to other classes. That is, when other classes have a <code>CsCohort</code> object, they can call this method on that object.
    *
    * Keyword:int
    * <code>int</code> is the return type of this method. It indicates that this method returns an integer value. The return type here is dictated by the data type of the <code>year</code> instance variable.
    */
   public int getYear() {
      return this.year;
   }

   /*?
    * Block:3
    * Setter method
    * This is a <i>setter</i> method or <i>mutator</i> method.
    * It sets the value of the <code>year</code> instance variable.
    *
    * Keyword: int year
    * Unlike the getter method above, it takes in a parameter, which is the new value of the <code>year</code> instance variable. The type of that parameter must match the type of the instance variable.
    *
    * Keyword:void
    * Since this method's job is only to change the value of the <code>year</code> instance variable, it does not return anything. Hence its return type is declared as <code>void</code>. 
    */
   public void setYear(int year) {
      this.year = year;
   }

   /*?
    * Keyword:public int getEnrolled
    * We only provide a getter method for the <code>enrolled</code> instance variable, but not a setter method.
    * This means that no other class that modify this <code>CsCohort</code>'s <code>enrolled</code> value, but they can still read it.
    */
   public int getEnrolled() {
      return this.enrolled;
   }

   public double getPercent() {
      return this.retainedPercent;
   }

   /*?
    * Keyword:public void setRetainedPercent(double newPercent)
    * This is a setter method for the <code>retainedPercent</code> instance variable.
    * We use this setter method to perform some validation on the <code>newPercent</code> parameter, before we
    * assign its value to the <code>retainedPercent</code> instance variable.
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
      return (int) (this.retainedPercent * enrolled);
   }
}

