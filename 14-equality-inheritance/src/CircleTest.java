import java.awt.*;

public class CircleTest
{
   public static void main(String[] args)
   {
      ClosedFigure cf = new ClosedFigure(new Point(2, 3));
      Circle c = new Circle(new Point(2, 3), 5);
      
      System.out.println(c);

      System.out.println("c.equals(cf): " + c.equals(cf)); //false
      System.out.println("cf.equals(c): " + cf.equals(c)); //true?
 
      Circle c1 = new Circle(new Point(1,2), 10);
      Circle c2 = new Circle(new Point(1,2), 10);
      ClosedFigure cf1 = new ClosedFigure(new Point(1,2));
      ClosedFigure cf2 = c2;

      System.out.println();
      System.out.println("c1.equals(c2):  " + c1.equals(c2));  
      System.out.println("c1.equals(cf1): " + c1.equals(cf1)); 
      System.out.println("c2.equals(cf2): " + c2.equals(cf2)); 
      System.out.println("cf2.equals(c1): " + cf2.equals(c1)); 
      System.out.println("cf1.equals(c1): " + cf1.equals(c1));  
   }
}
