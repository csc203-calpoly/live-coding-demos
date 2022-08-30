import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        int x = 8;
        int y = 3;
        int z = 2;

        // Integer division
        System.out.println(x / y); // 2 (truncates everything after the decimal point)

        // Type casting
        System.out.println((double) (x / y)); // 8 / 3 ==> 2.0

        HashMap<String, List<String>> myMap = new HashMap<>();
        myMap.put("firstItem", new ArrayList<String>());

        for (Map.Entry<String, List<String>> current : myMap.entrySet()) { //Object
            for (String currString : current.getValue()) {
                // ExampleMap
            }
        }

        System.out.println(Pitcher.INNINGS_PER_GAME);
    }
}
