package gof.creational.singleton;

public class MySingleton {

    private static MySingleton instance;

    private MySingleton () {}

    static {
        MySingleton instance = new MySingleton();
    }

    public static MySingleton getInstance() {
        return instance;
    }
}
