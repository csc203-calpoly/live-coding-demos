package part1;

public interface OtherInterface {

    default String getShapeType() {
        return "Conflict!";
    }
}
