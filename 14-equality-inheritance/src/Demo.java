import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;

public class Demo {

    @Test
    public void testSuperEquals() {
        Circle c1 = new Circle(new Point(1,1), 32);
        Circle c2 = new Circle(new Point(1,1), 32);

        assertEquals(c1, c2);
    }

    @Test
    public void testSuperEquals2() {
        ClosedFigure c1 = new ClosedFigure(new Point(1, 1));
        ClosedFigure c2 = new ClosedFigure(new Point(1, 1));

        assertEquals(c1, c2);
    }

    @Test
    public void testInstanceOf() {
        ClosedFigure cf = new ClosedFigure(new Point(1, 1));
        Circle circle = new Circle();
//        assertWhat(circle instanceof ClosedFigure);
    }

    @Test
    public void testGetClass() {
        ClosedFigure cf = new ClosedFigure(new Point(1, 1));
        Circle circle = new Circle();
//        assertWhat(circle.getClass().equals(ClosedFigure.class));
    }

}
