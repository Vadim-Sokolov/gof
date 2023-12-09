package gof.structural.bridge.dish;

import gof.structural.bridge.cuisine.Cuisine;

public abstract class Dish {

    private String type;
    private Cuisine cuisine;
    private String name;

    public Dish(String name) {
        this.name = name;
    }

    public Dish(String type, Cuisine cuisine) {
        this.type = type;
        this.cuisine = cuisine;
    }

    public Dish(String type, Cuisine cuisine, String name) {
        this.type = type;
        this.cuisine = cuisine;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public String getName() {
        return name;
    }
}
