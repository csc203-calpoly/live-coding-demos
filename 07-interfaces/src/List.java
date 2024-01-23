/**
 * A super-simplified version the Java List interface.
 * For the actual interface's source code, see
 * 
 * https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/util/List.java
 */
/*?
 * Type:Keyword
 * Anchor:public interface List
 * Sequence:1
 * ---
 * Interface declaration. This interface contains only method signatures, and no method implementations. These types of methods are called "abstract methods". They don't do anything—they merely define a contract that all lists must fulfill.
 */
public interface List {
  /*?
   * Type:Block
   * Range:21
   * Title:Abstract methods
   * Sequence:2
   * ---
   * This method only has a method signature, and no body. This is known as an abstract method. Observe that there are no curly braces after the method signature (i.e., no method body). We also don't include an access modifier (like public or private), since all methods in an interface are public by default.
   * 
   * +++
   * 
   * Type:Block
   * Range:4
   * Title:Documentation is important!
   * Sequence:3
   * ---
   * In addition to the method signature, it's important for interface abstract methods to include Javadoc comments describing the method's purpose. These examples are pared down for simplicity—see the actual Java List interface for the type of detail that might be included in a Javadoc comment.
   */
  /**
   * Returns the element at the specified index.
   * @param index the position from which to return an element.
   */
  /*?
   * Type:Keyword
   * Anchor:E
   * ID: E
   * Sequence:4
   * ---
   * This return type `E` is a placeholder. This list might be used as a list of ints or Strings or anything else.
   * 
   * +++
   * 
   * Type:Internal
   * Parent:E
   * Anchor:placeholder
   * ---
   * We will talk more about _Java generics_ later this quarter.
   */
  E get(int index);

  /**
   * Appends the specified element to the end of the list.
   * @param e element to be appended to this list.
   */
  void add(E e);


  /**
   * Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any)
   * and any subsequent elements to the right.
   * 
   * @param index index at which the specified element is to be inserted.
   * @param e element to be inserted.
   */
  /*?
   * Type:Keyword
   * Anchor:add
   * Sequence:5
   * ---
   * This is an overload of the `add` method. See the lesson on method dispatch for a review of method overloading.
   */
  void add(int index, E e);

  /**
   * Removes the first occurrence of the specified element from this list.
   * 
   * @param e The element to be removed from this list, if present.
   * @return {@code true} if this list contained the specified element.
   */
  boolean remove(E e);

  /**
   * Removes the element at the specified position in this list.
   * Shifts any subsequent elements to the left.
   * 
   * @param index the index of the element to be removed.
   * @return the element at the previously specified position.
   */
  E remove(int index);

  /**
   * Returns {@code true} if this list contains the specified element.
   * 
   * @param e element whose presence in this list is to be tested.
   * @return {@code true} if this list contains the specified element.
   */
  boolean contains(E e);

  /**
   * Returns the number of elements in this list. 
   * @return the number of elements in this list.
   */
  int size();
}
