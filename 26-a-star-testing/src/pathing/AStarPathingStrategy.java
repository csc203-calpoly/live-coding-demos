package pathing;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class AStarPathingStrategy
        implements PathingStrategy
{


    public List<Point> computePath(Point start, Point end,
                                   Predicate<Point> canPassThrough,
                                   BiPredicate<Point, Point> withinReach,
                                   Function<Point, Stream<Point>> potentialNeighbors)
    {
        /*
        WorldNode { estimatedDistanceToEnd, distanceFromStart, position, prev }

        initialise the Open List: a PriorityQueue<WorldNode> (give it a comparator)
        initialise the Closed List: HashSet<Point>

        * add the start to the open list
        * as long as the open list is not empty
            - grab the first node from the open list
            - if it's within reach of the target
                - break
            - if it is in the closed list
                * ignore it
            - add it to the closed list
            - potentialNeighbors.apply(current) // Stream<Point>
                .filter(canPassThrough)
                .filter(closed list does not contain the point)
                .map(points to WorldNodes)
                .collect(.....)

             - for each world node
                * if it's not in the open list, add it
                * if it is in the open list, AND the new estimate is better than the old one
                    - add it to the open list

         Backtrack and construct a path

         */
        return new ArrayList<>();
    }
}
