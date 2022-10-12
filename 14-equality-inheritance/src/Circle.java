import java.awt.*;

public class Circle extends ClosedFigure
{
   private int radius;

   public Circle()
   {
      super(new Point(0,0));  // Must call super constructor
   }

   public Circle(Point loc, int radius)
   {
      super(loc);
      this.radius = radius;
   }

   public int radius () 
   {
      return radius;
   }

//   public String toString()
//   {
//      return super.toString() + "   rad: " + radius + " Things: "
//        + thing + " " + this.thing + " " + super.thing;
//   }

   public boolean equals(Object other)
   {
      // No null check or type check.  Why not?      
      return super.equals(other) && radius == ((Circle)other).radius;      
   }  
}




