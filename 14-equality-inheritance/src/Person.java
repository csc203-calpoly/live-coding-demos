import java.util.List;
import java.util.Objects;

public class Person
{
  private String name;
  private int age;

  /**
   * Creates a new Person.
   * 
   * @param name The Person's name
   * @param age The Person's age
   * @throws IllegalArgumentException if age is less than 0 or if name is null or empty
   */
  public Person(String name, int age)
  {
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be a negative number.");
    }

    if (name.length() == 0 || name == null) {
      throw new IllegalArgumentException("Name must not be null or empty");
    }

    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return this.name + ", " + this.age;
  }

  @Override
  public boolean equals(Object other) {
    if (other == null) {
      return false;
    }

    if (!this.getClass().equals(other.getClass())) {
      return false;
    }

    Person otherPerson = (Person) other;
    return this.age == otherPerson.age &&
      this.name.equals(otherPerson.name);
  }
}
