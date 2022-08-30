package part2;

import java.awt.Color;
import java.awt.Point;

public class Triangle extends Shape
{
   private Point a, b, c;
   
   public Triangle(Point a, Point b, Point c, Color color)
   {
      super(color);
      this.a = a;
      this.b = b;
      this.c = c;
   }
      
   public double getArea() { return 0.5 * Math.abs(a.x*(b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)); }
   public double getPerimeter() { return a.distance(b) + b.distance(c) + c.distance(a); }
   public void translate(Point p) 
   { 
      a.translate(p.x, p.y); 
      b.translate(p.x, p.y); 
      c.translate(p.x, p.y); 
   }

   public Point getVertexA() { return a; }
   public Point getVertexB() { return b; }
   public Point getVertexC() { return c; }
}
