package part1;

import java.awt.Color;
import java.awt.Point;

public class Rectangle implements Shape
{
   private Point center;
   private double width, height;
   private Color color;
   
   public Rectangle(double width, double height, Point center, Color color)
   {
      this.width = width;
      this.height = height;
      this.center = center;
      this.color = color;
   }
      
   public Color getColor() { return color; }
   public void setColor(Color c) { color = c; }
   public double getArea() { return width * height; }
   public double getPerimeter() { return 2 * (width + height); }
   public void translate(Point p) { center.translate(p.x, p.y); }
   
   public double getWidth() { return width; }
   public void setWidth(double w) { width = w; }
   public double getHeight() { return height; }
   public void setHeight(double h) { height = h; }
   
   public boolean contains(Point p)
   {
      return Math.abs(p.x-center.x) < width/2 && Math.abs(p.y-center.y) < height/2;
   }
}