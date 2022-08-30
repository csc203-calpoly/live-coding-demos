/*examples to work on day 2 of 203 - actual data on size of CSC frosh class with one year retention data */

public class CsCohort
{
   // notice that we don't start with "public static void main"

   // instance variables
   private int year;
   private int enrolled;
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
   public int getEnrolled() { return this.enrolled; }
   public double getPercent() { return retainedPercent; }
   public void setRetainedPercent(double newPercent) {
      if (newPercent >= 0 && newPercent <= 1) {
         this.retainedPercent = newPercent;
      } else {
         // break
         System.out.println("Expected a value between 0 and 1");
      }
   }
   public int retained() { return (int)(retainedPercent*enrolled); }
}

