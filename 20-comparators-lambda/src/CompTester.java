import java.util.*;

public class CompTester
{
   public static void main(String[] args)
   {
       ArrayList<Student> studentList = new ArrayList<>();

       studentList.add(new Student("Bob Smidt", 26, 2.67));
       studentList.add(new Student("Julie Workman", 21, 3.84));
       studentList.add(new Student("Jane Johnson", 18, 3.59));
       studentList.add(new Student("Paul Hatalsky", 22, 3.99));
       studentList.add(new Student("Zoe Wood", 21, 3.62));

       printStudents(studentList);

       Comparator<Student> comp1 = new StudentAgeComparator();
       Collections.sort(studentList, comp1);
       printStudents(studentList);

       // lambdas --> unnamed chunks of code
       Comparator<Student> comp2 = (s1, s2) -> s2.age() - s1.age();
       Comparator<Student> comp3 = (s1, s2) -> Double.compare(s1.gpa(), s2.gpa());
       Collections.sort(studentList, comp2);
       printStudents(studentList);

       // Key extractor syntax
       Comparator<Student> comp4 = Comparator.comparing(Student::age);

       /*
        * 1. More lambda Comparator examples.
        * 2. Comparators using the KEY EXTRACTOR syntax.
        * 3. Other types of lambdas!
        */
   }

   private static void printStudents(List<Student> students)
   {
       System.out.println("\nStudent List:");
       for (Student s : students)
           System.out.println("   " + s);  
   }
}