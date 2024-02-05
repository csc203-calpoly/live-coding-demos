import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReporterTest
{
   @Test
   public void testReportCircle() {
      Circle circle1 = new Circle(5);
      Reporter.report(circle1);
   }

   @Test
   public void testReportInt() {
      int a = 72;
      Reporter.report(a);
      Reporter.report(23);
   }

   @Test
   public void testReportDouble() {
      Reporter.report(23.0);
   }

   @Test
   public void testReportTwoInts() {
      int a = 72;
      Reporter.report(-10, a);
   }

   @Test
   public void testReportCircle2() {
      Reporter.report(new Circle(11));
   }

   @Test
   public void testObject() {
   }

   @Test
   public void testEquality() {
   }
}
