package part2;

import java.awt.Color;
import java.awt.Point;

public abstract class CenteredShape extends Shape
{
   private Point center;
   
   public CenteredShape(Point center, Color color)
   {
      super(color);
      this.center = center;
   }
   
   public void translate(Point p) { center.translate(p.x, p.y); } 
   public Point getCenter() { return center; }
   abstract boolean contains(Point p);
}
