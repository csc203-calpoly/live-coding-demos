import java.awt.*;

public class ClosedFigure
{
   private Point location;
   public int thing;

   public ClosedFigure(Point location)
   {
      this.location = location;
      this.thing =  25;
   }

   public Point location() 
   {
      return location;
   }

   public void moveTo (Point newLocation) 
   {
      location = newLocation;
   }

   @Override
   public String toString()
   {
      return "x: " + location.x + "   y: " + location.y + "CF Thing"  + thing;
   }

   @Override
   public boolean equals(Object other)
   {
      if (other == null)
         return false;

      if (getClass() != other.getClass())
      //if (!(other instanceof ClosedFigure))  // Why not this?
         return false;
         
      return location.equals(((ClosedFigure)other).location); 
      /* Why not:
      return location == ((ClosedFigure)other).location; */
   }
}






