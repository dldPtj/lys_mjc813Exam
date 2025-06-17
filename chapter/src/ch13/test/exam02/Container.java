package ch13.test.exam02;

public class Container<T> {
    private T t;
    // 582페이지
    //Getter
    public T get() {
        return t;
    }

    //Setter
    public void set(T t) {
        this.t = t;
    }
}
