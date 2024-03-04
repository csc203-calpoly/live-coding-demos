import java.util.ArrayList;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.swing.*;
import javax.swing.Timer;
public class LambdaTests
{
   public static void main(String[] args) {
      List<Album> albums = List.of(
           new Album("Rubber Soul", "The Beatles", 1965, 19.99),
           new Album("1989", "Taylor Swift", 2015, 19.99),
           new Album("1989 (Taylor's Version)", "Taylor Swift", 2023, 19.99),
           new Album("Leaving Eden", "The Carolina Chocolate Drops", 2012, 19.99)
      );

      // Predicates

      // Functions

      // Consumers
   }
     
   private static ArrayList<Album> filterIt(List<Album> list, Predicate<Album> pred) {
      ArrayList<Album> results = new ArrayList<>();
      for (Album current : list)
      {
         if (pred.test(current))
         {
            results.add(current);
         }
      }
      return results;
   }

   private static ArrayList<Album> otherFilter(List<Album> list) {
      ArrayList<Album> results = new ArrayList<>();
      for (Album current : list) {
         if (current.getYear() > 2000) {
            results.add(current);
         }
      }

      return results;
   }
   
   private static void printList(List<Album> students)
   {
       System.out.println("\nStudent List:");
       for (Album s : students)
           System.out.println("   " + s.getTitle());
   }
}
