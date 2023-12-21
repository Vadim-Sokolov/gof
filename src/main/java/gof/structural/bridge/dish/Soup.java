package gof.structural.bridge.dish;

import gof.structural.bridge.cuisine.Cuisine;

public class Soup extends Dish {

    public Soup(String name) {
        super(name);
    }

    public Soup(String type, Cuisine cuisine) {
        super(type, cuisine);
    }

    public Soup(String type, Cuisine cuisine, String name) {
        super(type, cuisine, name);
    }
}
