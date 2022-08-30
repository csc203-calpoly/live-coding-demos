import java.util.ArrayList;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.swing.*;
import javax.swing.Timer;
public class LambdaTests
{
   public static void main(String[] args)
   {
      
      ArrayList<Student> students = new ArrayList<>();
      ArrayList<Student> filtered;
      
      students.add(new Student("Paul", 22, 3.84));
      students.add(new Student("Bob", 26, 2.67));
      students.add(new Student("Julie", 21, 3.62));
      students.add(new Student("Zoe", 18, 3.22));

      // Predicates --> functions that return a boolean
      Predicate<Student> pred = s -> s.gpa() > 3.0;
      System.out.println(pred.test(students.get(2)));

      filtered = filterIt(students, pred);
      filtered = filterIt(filtered, s -> s.name().contains("a"));
      printList(filtered);

//      filtered = filterIt(students, getGpaPredicate(3.5));
//      printList(filtered);



  //    Function<Student, String> f = (Student s) -> s.getName();
      Function<Student, String> f = Student::name;
      Function<Student, String> lowerCaseName = s -> s.name().toLowerCase();

      for (Student s : students)
         System.out.println(f.apply(s));


      System.out.println();
      Consumer<String> p = System.out::println;
      //Consumer<String> p = s -> System.out.println(s);
      for (Student s : students)
         p.accept(f.apply(s));

      System.out.println();


      /*
      //Function<String, String> u = String::toUpperCase;
      Function<String, String> u = s -> s.toUpperCase();

      Function<Student, String> fu = u.compose(f);
      for (Student s : students)
         p.accept(fu.apply(s));
      */

      /*
      Timer t = new Timer(1000, event ->
         System.out.println("The time is " + new Date()));
      t.start();
      */

      // keep program running until user selects "Ok"
//      JOptionPane.showMessageDialog(null, "Quit program?");
//      System.out.println("DONE");
//
//      System.exit(0);
   }
     
   private static Predicate<Student> getGpaPredicate(double minGpa)
   {
      return s -> s.gpa() >= minGpa;
   }
   
   private static <T> ArrayList<T> filterIt(List<T> list, Predicate<T> pred)
   {
      ArrayList<T> results = new ArrayList<>();
      for (T value : list)
      {
         if (pred.test(value))
         {
            results.add(value);
         }
      }
      return results;
   }

   private static ArrayList<Student> otherFilter(List<Student> list) {
      ArrayList<Student> results = new ArrayList<>();
      for (Student current : list) {
         if (current.gpa() > 3.0) {
            results.add(current);
         }
      }

      return results;
   }
   
   private static void printList(List<Student> students)
   {
       System.out.println("\nStudent List:");
       for (Student s : students)
           System.out.println("   " + s.name());
   }
}
