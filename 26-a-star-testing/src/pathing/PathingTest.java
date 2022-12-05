package pathing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PathingTest {

    @Test
    public void testSingleStepNoObstacles() {
        boolean[][] grid = {
                // start
                { true, true, true},
                { true, true, true},
                { true, true, true}
                             // ^^^ goal
        };

        List<Point> actual = new SingleStepPathingStrategy().computePath(
                new Point(0, 0),
                new Point(2, 2),
                (Point p) -> grid[p.y][p.x],
                (Point p1, Point p2) -> p1.adjacent(p2),
                PathingStrategy.CARDINAL_NEIGHBORS
        );

        assertEquals(List.of(new Point(0, 1)), actual);
    }

    @Test
    public void testDFSNoObstacles() {
        boolean[][] grid = {
                // start
                { true, true, true},
                { true, true, true},
                { true, true, true}
                            // ^^^ goal
        };

        List<Point> actual = new DepthFirstPathingStrategy().computePath(
                new Point(0, 0), new Point(2, 2),
                (Point p) -> withinBounds(p, grid) && grid[p.y][p.x],
                Point::adjacent,
                PathingStrategy.CARDINAL_NEIGHBORS
        );

        // (0, 1), (0, 2), (1, 2)
        assertEquals(List.of(new Point(0, 1), new Point(0, 2), new Point(1, 2)), actual);
    }

    private static boolean withinBounds(Point p, boolean[][] grid) {
        return p.y >= 0 && p.y < grid.length &&
                p.x >= 0 && p.x < grid[0].length;
    }
}
