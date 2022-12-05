package pathing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PathingTestComplete {

    private enum GridValues { OBSTACLE, BACKGROUND, GOAL };

    @Test
    public void testSingleStepNoObstacles() {
        // Grid for testing --> 2D array
        GridValues[][] grid = {
                { GridValues.BACKGROUND, GridValues.BACKGROUND, GridValues.BACKGROUND},
                { GridValues.BACKGROUND, GridValues.BACKGROUND, GridValues.BACKGROUND},
                { GridValues.BACKGROUND, GridValues.BACKGROUND, GridValues.GOAL}
        };                                                       // ^^^^^^  goal

        PathingStrategy ps = new SingleStepPathingStrategy();
        List<Point> path = ps.computePath(
                new Point(0, 0), new Point(2, 2), // start, end
                (p) -> withinBounds(p, grid) && grid[p.y][p.x] != GridValues.OBSTACLE, // canPassThrough
                (p1, p2) -> p1.adjacent(p2),
                PathingStrategy.CARDINAL_NEIGHBORS
        );

        // expected path => [(0, 1)] <=
        assertEquals(path, Arrays.asList(new Point(0, 1)));
    }

    @Test
    public void testDepthFirstSearchWithNoObstacles() {
        GridValues[][] grid = {
                { GridValues.BACKGROUND, GridValues.BACKGROUND, GridValues.BACKGROUND},
                { GridValues.BACKGROUND, GridValues.BACKGROUND, GridValues.BACKGROUND},
                { GridValues.BACKGROUND, GridValues.BACKGROUND, GridValues.GOAL}
        };

        PathingStrategy ps = new DepthFirstPathingStrategy();
        List<Point> path = ps.computePath(
                new Point(0, 0), new Point(2, 2), // start, end
                (p) -> withinBounds(p, grid) && grid[p.y][p.x] != GridValues.OBSTACLE, // canPassThrough
                (p1, p2) -> p1.adjacent(p2),
                PathingStrategy.CARDINAL_NEIGHBORS
        );

        assertEquals(path, Arrays.asList(new Point(0, 1), new Point(0, 2), new Point(1, 2)));
    }

    private static boolean withinBounds(Point p, GridValues[][] grid) {
        return p.y >= 0 && p.y < grid.length &&
                p.x >= 0 && p.x < grid[0].length;
    }
}
