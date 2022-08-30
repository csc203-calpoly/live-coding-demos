import java.util.HashSet;

public class Demo {
  static {
    Person p = new Person("Aakash", 28);
    Person p2 = new Person("Aakash", 28);

    HashSet<Person> s = new HashSet<>();
    s.add(p);
    s.add(p2);
  }
}
