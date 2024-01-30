package part2;

import java.awt.Color;
import java.awt.Point;

/*?
 * Type: Keyword
 * Anchor: abstract
 * Sequence: 1
 * ---
 * The `abstract` keyword is used to declare that this is an abstract class.
 * This does two things:
 * 1. It allows the class to have abstract methods.
 * 2. It prevents the class from being instantiated.
 */
public abstract class Shape {
   /*?
    * Type:Block
    * Range:1
    * Title: Instance variables
    * Sequence: 2
    * ---
    * Abstract classes _can_ have instance variables. Here, all `Shape`s have a
    * `color`, so we put this instance variable in this abstract class. All 
    * subclasses of `Shape` will inherit this instance variable.
    * 
    * +++
    * 
    * Type:Keyword
    * Anchor: protected
    * Sequence: 3
    * ---
    * The `protected` keyword is used to declare that this instance variable is
    * visible to subclasses of this class. If we had used `private` instead,
    * the variable would not be visible to subclasses. In that case, they would
    * need to use the `getColor` and `setColor` methods to access the variable.
    */
   protected Color color;
  
   /*?
    * Type:Block
    * Range:3
    * Sequence: 4
    * Title: constructor
    * ---
    * Even though we can't create a `Shape` object, we still have a constructor
    * in this class. This constructor's job is to initialize the instance variables
    * that are declared at this level, namely `color`.
    */
   public Shape(Color color) {
      this.color = color;
   }
   
   /*?
    * Type:Block
    * Range:7
    * Title: Concrete methods
    * Sequence: 5
    * ---
    * These are the abstract class's concrete methods. They have method bodies (or implementations).
    * Subclasses _can_ override these methods, but they don't have to. They can inherit these methods
    * if they want.
    */
   public Color getColor() {
      return this.color;
   }

   public void setColor(Color c) {
      this.color = c;
   }

   /*?
    * Type:Block
    * Range: 3
    * Title: Abstract methods
    * Sequence: 6
    * ---
    * These are the abstract class's abstract methods. They do not have method bodies (or implementations).
    * Subclasses _must_ override these methods. They cannot inherit these methods, since there's nothing
    * to inherit.
    * 
    * +++
    * 
    * Type:Keyword
    * Anchor: abstract
    * Sequence: 7
    * ---
    * The `abstract` keyword is used to declare that this is an abstract method.
    */
   abstract double getArea();
   abstract double getPerimeter();
   abstract void translate(Point p);
}


   
