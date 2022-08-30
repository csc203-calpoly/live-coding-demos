import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashThings
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Cody", "Coderson", 21);
		Person p2 = new Person("Cody", "Coderson", 21);
//		Person p3 = new Person("Carly", "Coderson", 21);

		System.out.println("P1 hashes to: " + p1.hashCode());
		System.out.println("P2 hashes to: " + p2.hashCode());
//		System.out.println("P3 hashes to: " + p3.hashCode());
//
		System.out.println(p1.equals(p2)); // false

		HashMap<Person, String> map = new HashMap<>();
		map.put(p1, "p1");
		map.put(p2, "p2");
//		map.put(p3, "p3");


		for (Map.Entry<Person, String> current : map.entrySet()) {
			System.out.println(current.getKey() + " ===> " + current.getValue());
		}
	}
}
