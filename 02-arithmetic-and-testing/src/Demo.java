public class Demo {
  public static void main(String[] args) {

    // ARRAYS
    // homogeneous
    // fixed sizes

    // implicit declaration
    int[] a = { 1, 2, 3, 4 }; // array of size 4
    a[0] = 10;
    System.out.println(a.length);

    String[] strArray = { "cpe203", "csc123" };
    String str = "abcd";

    // explicit declaration
    int[] b = new int[4];
    for (int current : b) {
      System.out.println(current);
    }
//    b[0] = 1;
//    b[1] = 2;
//    b[2] = 3;
//    b[3] = 4;

    int[] x = new int[10];

    // ------------------------------------------------------------------------
    // LOOPS

    // for loop -------> "do something this number of times"

    for (int i = 0; i < str.length(); i = i + 1) {
//            System.out.print(str.charAt(i));
    }

    // for each loop ------> "do something for each item in a list"

    for (String item : strArray) {
//            System.out.println(item);
    }

    // while loop -------> "do something as long as this condition is true"

    // precondition
    int i = 0;
    while (i < a.length) {
        // do something
//            System.out.println("i is " + i);
        i++;
    }

    // i is 4 after this loop

//        System.out.println("-----");
    // do while loop --------> "do something, and then keep doing it as long as this condition is true"
    // i is 4 to start off with
    // postcondition while loop
    do {
//            System.out.println("i is " + i);
        i++;
    } while (i < a.length);
  }
}
