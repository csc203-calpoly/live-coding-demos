/**
 * A really simple class representing a Circle.
 */
public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /*?
     * Type:Block
     * Range:3
     * Title: `toString`
     * ---
     * The `toString` method is used to provide a string representation of an object. It is a good idea to write a `toString` method for every class you write.
     */
    public String toString() {
        return "Radius: " + this.radius;
    }
}
