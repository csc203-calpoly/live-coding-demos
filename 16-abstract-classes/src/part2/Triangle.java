package part2;

import java.awt.Color;
import java.awt.Point;

/*?
 * Type: Keyword
 * Anchor: extends
 * Sequence: 1
 * ---
 * The `extends` keyword is used to declare that this class is a subclass of
 * `Shape`. This means that `Triangle` inherits all of the instance variables
 * and methods of `Shape`, and that `Triangle` must implement the abstract
 * methods of `Shape`.
 */
public class Triangle extends Shape {
   /*?
    * Type:Block
    * Range:1
    * Title: Instance variables
    * Sequence: 2
    * ---
    * `Triangle` has three instance variables, one for each vertex of the triangle.
    * It also has the `color` instance variable that it inherits from `Shape`.
    */
   private Point a, b, c;
  
   /**
    * Create a triangle with the specified vertices and color.
    * @param a The first vertex.
    * @param b The second vertex.
    * @param c The third vertex.
    * @param color The color of the triangle.
    */
   public Triangle(Point a, Point b, Point c, Color color) {
      /*?
       * Type:Keyword
       * Anchor: super(color);
       * Sequence: 3
       * ---
       * We call the superclass's constructor to initialize the `color` instance variable.
       * This MUST happen as the very first line in the constructor.
       * 
       * If this line is missing, Java will move forward as if you had written
       * `super();` instead. This will cause a compile-time error if the `Shape`
       * class does not have a default constructor (constructor with no parameters).
       */
      super(color);
      this.a = a;
      this.b = b;
      this.c = c;
   }
   
   /*?
    * Type:Block
    * Range: 30
    * Title: Overriding methods 
    * Sequence: 4
    * ---
    * `Triangle` overrides the `getArea`, `getPerimeter`, and `translate` methods of `Shape`.
    */
   /**
    * Compute and return the area of this triangle.
    */
   @Override
   public double getArea() {
      return 0.5 * Math.abs(
         this.a.x * (this.b.y - this.c.y) + 
         this.b.x * (this.c.y - this.a.y) +
         this.c.x * (this.a.y - this.b.y)
      );
   }

   /**
    * Compute and return the perimeter of this triangle.
    */
   @Override
   public double getPerimeter() {
      return a.distance(b) + b.distance(c) + c.distance(a);
   }

   /**
    * Move the triangle by the specified amount.
    * @param p The amount to move the triangle.
    */
   @Override
   public void translate(Point p) { 
      this.a.translate(p.x, p.y); 
      this.b.translate(p.x, p.y); 
      this.c.translate(p.x, p.y); 
   }

   /*?
    * Type:Block
    * Range: 11
    * Title: Accessor methods
    * Sequence: 5
    * ---
    * `Triangle` has accessor methods for its "triangle-specific" instance variables.
    */
   public Point getVertexA() {
      return this.a;
   }

   public Point getVertexB() {
      return this.b;
   }

   public Point getVertexC() {
      return this.c;
   }
}
