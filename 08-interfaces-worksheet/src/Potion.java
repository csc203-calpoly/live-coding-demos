public class Potion implements Movable {

    private String name;

    public Potion(String name) {
        this.name = name;
    }

    public Potion mix(Potion other) {
        return other;
    }
}
