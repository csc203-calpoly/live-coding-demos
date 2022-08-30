import java.awt.*;

public class Student implements Comparable<Student>
{
   private String name;
   public int age;
   private double gpa;

   public Student(String name, int age, double gpa)
   {
      this.name = name;
      this.age = age;
      this.gpa = gpa;
   }

   public double gpa() { return this.gpa; }
   public int age() { return this.age; }
   public String name() { return this.name; }

   public String toString()
   {
      return this.name + " is " + this.age + " with a gpa of "
             + this.gpa + ".";
   }

   public int compareTo(Student other)
   {
      return this.name.compareTo(other.name);
   }
}

