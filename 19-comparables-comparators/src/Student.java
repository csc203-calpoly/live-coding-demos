// Comparable interface used for "natural" ordering
public class Student implements Comparable<Student>
{
   private final String name;
   private final int age;
   private final double gpa;
   
   public Student(String firstName, int age, double gpa)
   {
      this.name = firstName;
      this.age = age;
      this.gpa = gpa;     
   }   

   public double gpa() {
      return this.gpa;
   }

   public int age() {
      return this.age;
   }

   public String name() {
      return this.name;
   }

   // See a sensible string representation
   public String toString()
   {
      return this.name + " is " + this.age + " with a gpa of "
             + this.gpa + ".";
   }

   /**
    * Compares two Student objects based on their names (ascending) and ages (ascending).
    * @param other the object to be compared.
    * @return
    */
   @Override
   public int compareTo(Student other)
   {
      // Return 0 if the student are equal
      // Return positive number if THIS student is "greater than" other
      // Return negative number if THIS student is "less than" other

      int nameComp = this.name.compareTo(other.name);
      if (nameComp == 0) {
         return this.age - other.age;
      }

      return nameComp;
   }
}

/*
Fernando.compareTo(Matthew) --> negative number
Matthew.compareTo(Fernando) --> positive number
Nika.compareTo(Nika) --> 0
*/

