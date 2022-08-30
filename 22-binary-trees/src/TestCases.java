import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCases
{

   @Test
   public void testFind1()
   {
      BinaryTree t = new BinaryTree(new int[] {34, 23, 76, 45, 12, 32, 26, 78, 47, 55});
      assertTrue(t.find(34));
      assertArrayEquals(new Integer[] {12, 23, 34}, t.getPath().toArray());
      assertTrue(t.find(23));
      assertArrayEquals(new Integer[] {12, 23}, t.getPath().toArray());
      assertTrue(t.find(76));
      assertArrayEquals(new Integer[] {12, 23, 76}, t.getPath().toArray());
      assertTrue(t.find(45));
      assertArrayEquals(new Integer[] {12, 23, 76, 45}, t.getPath().toArray());
      assertTrue(t.find(12));
      assertArrayEquals(new Integer[] {12}, t.getPath().toArray());
      assertTrue(t.find(32));
      assertArrayEquals(new Integer[] {12, 78, 32}, t.getPath().toArray());
      assertTrue(t.find(26));
      assertArrayEquals(new Integer[] {12, 78, 32, 26}, t.getPath().toArray());
      assertTrue(t.find(78));
      assertArrayEquals(new Integer[] {12, 78}, t.getPath().toArray());
      assertTrue(t.find(47));
      assertArrayEquals(new Integer[] {12, 78, 47}, t.getPath().toArray());
      assertTrue(t.find(55));
      assertArrayEquals(new Integer[] {12, 78, 47, 55}, t.getPath().toArray());
      assertFalse(t.find(0));
      assertArrayEquals(new Integer[] {}, t.getPath().toArray());
   }
   
   @Test
   public void testFind2()
   {
      BinaryTree t = new BinaryTree(new int[] {});
      assertFalse(t.find(34));
      assertArrayEquals(new Integer[] {}, t.getPath().toArray());
   }
   
   @Test
   public void testFind3()
   {
      BinaryTree t = new BinaryTree(new int[] {1});
      assertTrue(t.find(1));
      assertArrayEquals(new Integer[] {1}, t.getPath().toArray());
      assertFalse(t.find(34));
      assertArrayEquals(new Integer[] {}, t.getPath().toArray());
   }
}
