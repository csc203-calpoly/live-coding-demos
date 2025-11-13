package pathing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PathingTestComplete {

    @Test
    public void testSingleStepNoObstacles() {
        // Grid for testing --> 2D array
        boolean[][] grid = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };                                                       

        PathingStrategy ps = new SingleStepPathingStrategy();
        List<Point> path = ps.computePath(
                new Point(0, 0), new Point(2, 2), // start, end
                (p) -> withinBounds(p, grid) && grid[p.y][p.x], // canPassThrough
                (p1, p2) -> p1.adjacent(p2),
                PathingStrategy.CARDINAL_NEIGHBORS
        );

        // expected path => [(0, 1)] <=
        assertEquals(path, Arrays.asList(new Point(0, 1)));
    }

    // Write more tests including obstacles and other edge cases.

    /*
     * Properties of a correct a-star path
     *
     * 1. path length
     * 2. path starts at the start point and ends at the goal
     * 3. path actually contains contiguous nodes
     */

    // property based testing
    private static boolean isValidPath(List<Point> path, int expectedLength, Point expectedStart, Point expectedEnd) {
        // check that path contains exactly `expectedLength` points
        // check the first point in path is adjacent to expectedStart, ditto for end
        // traverse the path and check each point is adjacent to its previous point
    }

    private static boolean withinBounds(Point p, boolean[][] grid) {
        return p.y >= 0 && p.y < grid.length &&
                p.x >= 0 && p.x < grid[0].length;
    }
}
