package gof.structural.bridge.dish;

import gof.structural.bridge.cuisine.Cuisine;

public class Drink extends Dish {

    public Drink(String name) {
        super(name);
    }

    public Drink(String type, Cuisine cuisine) {
        super(type, cuisine);
    }

    public Drink(String type, Cuisine cuisine, String name) {
        super(type, cuisine, name);
    }
}
