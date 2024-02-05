package part2;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends CenteredShape
{
   private double width, height; 
   
   public Rectangle(double width, double height, Point center, Color color)
   {
      super(center, color);
      this.width = width;
      this.height = height;
   }

   public double getArea() { return width * height; }
   public double getPerimeter() { return 2 * (width + height); }
   
   public double getWidth() { return width; }
   public void setWidth(double w) { width = w; }
   public double getHeight() { return height; }
   public void setHeight(double h) { height = h; }
   
   public boolean contains(Point p)
   {
      return Math.abs(p.x-getCenter().x) < width/2 && Math.abs(p.y-getCenter().y) < height/2;
   }
}