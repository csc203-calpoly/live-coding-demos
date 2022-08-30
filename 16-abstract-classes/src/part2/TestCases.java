package part2;

import java.awt.Color;
import java.awt.Point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCases
{
   public static final double DELTA = 0.00001;

   @Test
   public void testCircleGetArea()
   {
      Circle c = new Circle(5.678, new Point(2,3), Color.BLACK);

      assertEquals(101.2839543, c.getArea(), DELTA);
   }

   @Test
   public void testCircleGetPerimeter()
   {
      Circle c = new Circle(5.678, new Point(2,3), Color.BLACK);

      assertEquals(35.6759261, c.getPerimeter(), DELTA);
   }

   @Test
   public void testRectangleGetArea()
   {
      Rectangle r = new Rectangle(1.234, 5.678, new Point(2,3), Color.BLACK);

      assertEquals(7.006652, r.getArea(), DELTA);
   }

   @Test
   public void testRectangleGetPerimeter()
   {
      Rectangle r = new Rectangle(1.234, 5.678, new Point(2,3), Color.BLACK);

      assertEquals(13.824, r.getPerimeter(), DELTA);
   }

   @Test
   public void testTriangleGetArea()
   {
      Triangle t = new Triangle(new Point(0,0), new Point(3,0), new Point(2,-4), Color.BLACK);

      assertEquals(6.0, t.getArea(), DELTA);
   }

   @Test
   public void testTriangleGetPerimeter()
   {
      Triangle t = new Triangle(new Point(0,0), new Point(2,3), new Point(-2,4), Color.BLACK);

      assertEquals(12.20079, t.getPerimeter(), DELTA);
   }

   // Should probably add a bunch more tests.  :)

}
