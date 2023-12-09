package gof.structural.bridge.dish;

import gof.structural.bridge.cuisine.Cuisine;

public class Dessert extends Dish {

    public Dessert(String name) {
        super(name);
    }

    public Dessert(String type, Cuisine cuisine) {
        super(type, cuisine);
    }

    public Dessert(String type, Cuisine cuisine, String name) {
        super(type, cuisine, name);
    }
}
