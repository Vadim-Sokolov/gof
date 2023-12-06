package gof.creational.singleton;

public class MySingleton {

    private static final MySingleton instance;

    private MySingleton() {
    }

    static {
        instance = new MySingleton();
    }

    public static MySingleton getInstance() {
        return instance;
    }
}
