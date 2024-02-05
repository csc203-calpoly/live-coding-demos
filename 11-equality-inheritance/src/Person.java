public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    if (name == null) {
        throw new IllegalArgumentException("Name cannot be null.");
    }

    if (age <= 0) {
        throw new IllegalArgumentException("Age must be > 0");
    }

    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return this.name + ", " + this.age;
  }

  /**
   * Check if this object is equal to the other object.
   * @param other 
   */
  @Override
  /*?
   * Type:Block
   * Range:67
   * Title: The equals method
   * Sequence:1
   * ---
   * The equals method should be overridden for all classes that you create.
   * It checks whether the calling object is equal to the argument. 
   *
   * +++
   *
   * Type:Keyword
   * Anchor:public boolean equals(Object other)
   * Sequence:2
   * ---
   * This method signature (return type, name, and parameter type) _must_
   * match the signature for the equals method from the `Object` class.
   * Otherwise, it will not override the `Object::equals` method.
   */
  public boolean equals(Object other) {
    /*?
     * Type:Block
     * Range:3
     * Sequence:3
     * Title: nullness check
     * ---
     * First, we check if the `other` object is `null`. 
     * If it is `null`, then `this` object is clearly not equal to 
     * the `other` object, and we return `false`.
     */
    if (other == null) {
      return false;
    }

    /*?
     * Type:Block
     * Range:3
     * Sequence:4
     * Title:Type check
     * ---
     * Next, we check if `this` object and the `other` object have the
     * same dynamic type. We get the type of each object
     * using the `getClass` method, and check if they the same.
     * If they aren't, the objects cannot be equal.
     *
     * +++
     *
     * Type:Keyword
     * Anchor:getClass
     * Sequence:5
     * ---
     * This same check could be done using the `instanceof` operator.
     * That is, you could rewrite this line as
     *
     * `other instanceof Person`
     *
     * However, `instanceof` checks if an object is _a child type_
     * of the right-hand-side, whereas using `getClass` lets us check
     * if `this` and the `other` object are an _exact match_. 
     */
    if (!this.getClass().equals(other.getClass())) {
      return false;
    }

    /*?
     * Type:Block
     * Range:11
     * Title:Check the fields
     * Sequence:6
     * ---
     * Finally, if all the previous checks pass, we know that we
     * have two objects of the same type. Now we actually check if they have
     * equal values for their instance variables.
     */
    Person otherPerson = (Person) other;
    return this.age == otherPerson.age &&
      /*?
       * Type:Keyword
       * Anchor:this.name.equals(otherPerson.name);
       * Sequence:7
       * ---
       * Since other classes have their own `equals` methods, we should use those
       * to compare data of other reference types. 
       */
      this.name.equals(otherPerson.name);
  }
}

