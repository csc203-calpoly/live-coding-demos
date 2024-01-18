/**
 * A  JUnit test class to test the Pitcher class
 *
 * @author Julie Workman
 * @version 4/3/2016 (Written to JUnit-4.12)
 */

import static org.junit.Assert.*;
import org.junit.*;

public class PitcherTests
{
   @Test 
   public void defaultConstructorTest()
   {
      Pitcher p = new Pitcher();
      assertEquals(0.0, p.inningsPitched(), .0000001);
      assertEquals(0, p.runsScored());
      assertEquals(0, p.wins());
      assertEquals(0, p.losses());
   }
   
   @Test 
   public void otherConstructorTest()
   {
      Pitcher p = new Pitcher(6,3,1,4);
      
      assertEquals(6.0, p.inningsPitched(), .0000001);
      assertEquals(3, p.runsScored());
      assertEquals(1, p.wins());
      assertEquals(4, p.losses());
   }
   
   @Test 
   public void eraTest()
   {
      Pitcher p = new Pitcher();
      assertEquals(0.0, p.ERA(), 000001);
      
      p = new Pitcher(6,3,1,0);
      assertEquals(4.5, p.ERA(), .0000001);
      
      p = new Pitcher(7,3,1,0);
      assertEquals(3.8571428571, p.ERA(), .0000001);
   }
}