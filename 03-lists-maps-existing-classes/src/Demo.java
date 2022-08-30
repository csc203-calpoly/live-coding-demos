import java.util.ArrayList;
import java.util.HashMap;

public class Demo {
    // Entry point for execution
    public static void main(String args[]) {

        CsCohort myCohort = new CsCohort(2010, 100, 0.50);
        System.out.println(myCohort.getYear());

        CsCohort myOtherCohort = new CsCohort(2021, 30, .85);
//        System.out.println(myOtherCohort.getYear());
//        System.out.println(myCohort);
//        System.out.println(myOtherCohort);

//      CLASSES AND OBJECTS
        String course = "cpe203";

        // ARRAYS AND ARRAYLISTS
        // Fixed size
        // Homogenous <--- statically typed language

        ArrayList<String> myArrayList = new ArrayList<>(); // empty arraylist
        myArrayList.add("cpe203");
        myArrayList.add("csc307");
        System.out.println(myArrayList.size());

        // Boxed data types --> CLASS representations of primitives types
        ArrayList<Integer> myIntList = new ArrayList<>();
        myIntList.add(10); // size = 1
//
//        // HASH MAPS (kind of like "dict" in Python)
        HashMap<String, CsCohort> myMap = new HashMap<>();
        myMap.put("year1", myCohort);
        myMap.put("year2", myOtherCohort);

        CsCohort year1Cohort = myMap.get("year1");
//        System.out.println(year1Cohort.getYear());
    }
}

