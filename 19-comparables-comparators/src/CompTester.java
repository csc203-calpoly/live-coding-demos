import java.util.*;

public class CompTester
{
    public static void main(String[] args)
    {
        ArrayList<Student> studentList = new ArrayList<>();
        Student[] studentArray = new Student[5];
        
        studentList.add(new Student("Bob Smidt", 26, 2.67));
        studentList.add(new Student("Julie Workman", 21, 3.84));
        studentList.add(new Student("Jane Johnson", 18, 3.59));
        studentList.add(new Student("Paul Hatalsky", 22, 3.21));
        studentList.add(new Student("Zoë Wood", 21, 3.62));

        studentArray[0] = new Student("Bob Smidt", 26, 2.67);
        studentArray[1] = new Student("Julie Workman", 21, 3.84);
        studentArray[2] = new Student("Jane Johnson", 18, 3.59);
        studentArray[3] = new Student("Paul Hatalsky", 22, 3.21);
        studentArray[4] = new Student("Zoë Wood", 21, 3.62);

        System.out.println("Student List:");
        for (Student s : studentList)
                    System.out.println("   " + s);

        System.out.println("Student Array:");
        for (Student s : studentArray)
                    System.out.println("   " + s);

        System.out.println("\n---- Sorting by Last Name -----\n");
        // Sort in place -- Don't return a sorted list
        Collections.sort(studentList);
        Arrays.sort(studentArray); // Doesn't check if the list contains Comparable items

        System.out.println("Student List:");
        for (Student s : studentList)
                    System.out.println("   " + s);

        System.out.println("Student Array:");
        for (Student s : studentArray)
                    System.out.println("   " + s);

/*
       System.out.println("\n---- Sorting by GPA -----\n");
       Collections.sort(studentList, new StudentGpaComparator());

       System.out.println("Student List:");
       for (Student s : studentList)
                 System.out.println("   " + s);

       System.out.println("\n---- Sorting by Age -----\n");
       Collections.sort(studentList, new StudentAgeComparator());

       System.out.println("Student List:");
       for (Student s : studentList)
                 System.out.println("   " + s);

       System.out.println("\n---- Sorting by Last Name -----\n");
       Collections.sort(studentList);
       Arrays.sort(studentArray);

       System.out.println("Student List:");
       for (Student s : studentList)
                 System.out.println("   " + s);

       System.out.println("\n---- Sorting by Age and Gpa -----\n");
       Collections.sort(studentList, 
         new StudentAgeComparator().thenComparing(new StudentGpaComparator()));

       System.out.println("Student List:");
       for (Student s : studentList)
                 System.out.println("   " + s);

       System.out.println("\n---- Sorting by Gpa Reversed -----\n");
       Collections.sort(studentList, 
               new StudentGpaComparator().reversed());
       System.out.println("Student List:");
       for (Student s : studentList)
                 System.out.println("   " + s);
*/
    }
}
