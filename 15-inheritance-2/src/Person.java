import java.util.List;
import java.util.Objects;

import java.lang.Math; 

public class Person
{
  private String name;
  private int age;

  /**
   * Creates a new Person.
   * 
   * @param name The Person's name
   * @param age The Person's age
   * @throws IllegalArgumentException if age < 0 or name is empty
   */
  public Person(String name, int age)
  {
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be a negative number.");
    }

    if (name.length() == 0) {
      throw new IllegalArgumentException("name must be non-empty.");
    }

    this.name = lastName;
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

  /*
  @Override
  public int hashCode() {
    int rand = (int) (Math.random() * 10);
    return rand + Objects.hash(lastName, age);
  }
  */

 @Override
 public int hashCode()
 {
   int result = 1;

   result = result * 37 + ((this.name == null) ? 0 : this.firstName.hashCode());
   result = result * 37 + age;

   return result;
 }

  /*
   * Contract:
   * (1) If you write an equals method, you should also write a hashCode method
   * (2) If two Objects are equal, their hashCodes should also be equal
   * (3) As far as possible, an Object should have a unique hashCode
   */
}
