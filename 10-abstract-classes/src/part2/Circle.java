package part2;

import java.awt.Color;
import java.awt.Point;

public class Circle extends CenteredShape
{
   private double radius;
   
   public Circle(double radius, Point center, Color color)
   {
      super(center, color);
      this.radius = radius;
   }
   public double getArea() { return Math.PI * radius * radius; }
   public double getPerimeter() { return 2 * Math.PI * radius; }
   
   public double getRadius() { return radius; }
   public void setRadius(double r) { radius = r; }
   public boolean contains(Point p)
   {
      return p.distance(getCenter()) < radius;
   }
}

   