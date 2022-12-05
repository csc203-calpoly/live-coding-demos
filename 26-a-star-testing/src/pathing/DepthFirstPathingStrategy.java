package pathing;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DepthFirstPathingStrategy implements PathingStrategy {

    @Override
    public List<Point> computePath(Point start, Point end,
                                   Predicate<Point> canPassThrough,
                                   BiPredicate<Point, Point> withinReach,
                                   Function<Point, Stream<Point>> potentialNeighbors) {
        List<Point> path = dfsHelper(start, end, canPassThrough, withinReach,
                PathingStrategy.CARDINAL_NEIGHBORS, new HashSet<>());

        if (path.isEmpty()) {
            return path;
        } else {
            return path.subList(1, path.size());
        }

    }

    private List<Point> dfsHelper(Point start, Point end,
                              Predicate<Point> canPassThrough,
                              BiPredicate<Point, Point> withinReach,
                              Function<Point, Stream<Point>> potentialNeighbors,
                                  HashSet<Point> visitedNodes) {
        if (withinReach.test(start, end)) {
            return List.of(start);
        }

        visitedNodes.add(start);

        Optional<List<Point>> pathOpt = potentialNeighbors.apply(start)
                .filter(canPassThrough)
                .filter(p -> !visitedNodes.contains(p))
                .map(p -> dfsHelper(p, end, canPassThrough, withinReach, potentialNeighbors, visitedNodes))
                .filter(npath -> !npath.isEmpty())
                .findFirst(); // Grab the first recursive line that actually returned a path

        if (pathOpt.isPresent()) {
            List<Point> path = new ArrayList<>(List.of(start));
            path.addAll(pathOpt.get());
            return path;
        } else {
            return new ArrayList<>();
        }
    }
}
