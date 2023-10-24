import java.util.*;

public class ListTester
{
   public static void main(String[] args) {
      ArrayList<Integer> nums = new ArrayList<>();

      // Remember: Scanner is used to read text input
      Scanner in = new Scanner(System.in);
      int num;
      int sum = 0;
      // ArrayList<int> noCanDo;

      System.out.print("Enter a number (neg to quit): ");
      num = in.nextInt();

      while (num >= 0) {
         nums.add(num);  // autoboxed into an Integer 
         System.out.print("Enter a number (neg to quit): ");
         num = in.nextInt();
      }

      System.out.println("You entered:");

      for (int myInt : nums) {
         sum += myInt;  // unboxed into an int
         System.out.println(myInt + " ");
      }

      System.out.println("\nSum: " + sum);

      Integer i = 34; // autoboxed into an Integer
      System.out.println(i);

      int j = new Integer(55); // unboxed into an int
      System.out.println(j);

      Integer k = new Integer(45);
      int thirtyFive = k - 10; // unboxed into an int
   }
}










