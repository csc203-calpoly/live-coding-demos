/*examples to work on day 2 of 203 - actual data on size of CSC frosh class with one year retention data */
import java.util.HashMap;
import java.util.Map;

public class CompareCohorts {
   public static void main(String[] args) {

      CsCohort year1 = new CsCohort(2012, 132, .932);
      CsCohort year2 = new CsCohort(2013, 172, .924);
      CsCohort year3 = new CsCohort(2014, 157, .936);
      CsCohort year4 = new CsCohort(2015, 172, .977);

      System.out.println("The number of students still enrolled after one"
          + " year: " +  year1.retained() + " in " + year1.getYear());
      System.out.println("The number of students still enrolled after one"
          + " year: " +  year2.retained() + " in " + year2.getYear());
      System.out.println("The number of students still enrolled after one"
          + " year: " +  year3.retained() + " in " + year3.getYear());
      System.out.println("The number of students still enrolled after one"
          + " year: " +  year4.retained() + " in " + year4.getYear());

      //example map
      Map<String, CsCohort> theCohorts = new HashMap<>();

      //put the data into the map
      theCohorts.put("year1", year1); 
      theCohorts.put("year2", year2); 
      theCohorts.put("year3", year3); 
      theCohorts.put("year4", year4); 

      // iterate through the map with a for each loop
      for (Map.Entry<String, CsCohort> entry : theCohorts.entrySet() ) {
         if (entry.getValue().retained() > 150) {
            System.out.println("More than 150 students for: " + 
                                entry.getKey());
            System.out.println("which is: " + entry.getValue().getYear());
         }
      }  

      // another way to do the same thing
      for (String key : theCohorts.keySet())
      {
         if (theCohorts.get(key).retained() > 150) 
         {
            System.out.println("More than 150 students for: " + key);
            System.out.println("which is: " + theCohorts.get(key).getYear());
         }
      }
   }
}
