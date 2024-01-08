public class CsCohort {
   // notice that we don't start with "public static void main"

   // instance variables
   private int year;
   private final int enrolled; // "final" means the variable's value cannot be changed after its initialization
   private double retainedPercent;

   // constructor
   public CsCohort(int year, int inEnroll, double inPercent) {
      this.year = year;
      this.enrolled = inEnroll;
      this.retainedPercent = inPercent;
   }

   public int getYear() {
      return this.year;
   }

   public void setYear(int year) {
      this.year = year;
   }
   public int getEnrolled() {
      return this.enrolled;
   }

   public double getPercent() {
      return this.retainedPercent;
   }

   public void setRetainedPercent(double newPercent) {
      if (newPercent >= 0 && newPercent <= 1) {
         this.retainedPercent = newPercent;
      } else {
         // newPercent is not a valid value; print an error message
         System.out.println("Expected a value between 0 and 1");
      }
   }

   public int retained() {
      return (int) (retainedPercent * enrolled);
   }
}

