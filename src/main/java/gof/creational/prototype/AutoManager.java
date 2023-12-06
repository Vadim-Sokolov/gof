package gof.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class AutoManager {

    private static final Map<Integer, Automobile> automobiles = new HashMap<>();

    static {
        automobiles.put(1, new Automobile("Car"));
        automobiles.put(2, new Automobile("Truck"));
        automobiles.put(3, new Automobile("Minivan"));
    }

    public static Automobile getAutomobile(Integer key) {
        return automobiles.get(key).clone();
    }
}
