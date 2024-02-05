import java.awt.*;

public class Square extends ClosedFigure
{
   private int side;

   public Square()
   {
      //Must call super! No default constructor in ClosedFigure
      super(new Point(0,0));  
   // this.location = new Point(0, 0);  //No access to location!
   }

   public Square(Point loc, int side)
   {
      super(loc);
      this.side = side;
   }

   public int side () 
   {
      return side;
   }


   public boolean equals(Object other)
   {
      if (other == null) // Not needed
         return false;
      
      if (!(other instanceof Square)) // Not needed + wrong
         return false;

         return super.equals(other) && side == ((Square)other).side;      
   }  
}




