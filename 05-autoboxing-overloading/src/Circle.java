/**
 * Code annotated using <a href="https://www.cs.mcgill.ca/~martin/casdoc/index.html">Casdoc</a>.
 */
public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /*?
     * Block:3
     * toString
     * The <code>toString</code> method is used to provide a string representation of an object.
     * It is a good idea to write a <code>toString</code> method for every class you write.
     */
    public String toString() {
        return "Radius: " + this.radius;
    }
}
