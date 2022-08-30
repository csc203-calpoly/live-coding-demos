import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticTest {

  @Test
  public void testIntegerAdditionAndSubtraction() {
    int a = 1;
    int b = 1;
    assertEquals(2, a + b);
  }

  @Test
  public void testDoubleArithmetic() {
    double j = 2;
    int i = 1; // 4 bytes

    // int + - / * int --> int
    // int + - / * double --> double

    assertEquals(0.33, i / j, 0.00001);
  }

  @Test
  public void testIntResult() {
    // Type casting --> We tell the compiler to treat one type as another type
    int result = (int) (2.5 * 2); // the result is casted to an int

    assertEquals(5, result);
  }
}
