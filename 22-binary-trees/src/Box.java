public class Box<T> {

    private T data;

    public Box(T input) {
        this.data = input;
    }

    public T get() {
        return this.data;
    }

    public void set(T newData) {
        this.data = newData;
    }
}
