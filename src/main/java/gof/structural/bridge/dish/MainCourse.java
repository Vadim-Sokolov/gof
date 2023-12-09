package gof.structural.bridge.dish;

import gof.structural.bridge.cuisine.Cuisine;

public class MainCourse extends Dish {

    public MainCourse(String name) {
        super(name);
    }

    public MainCourse(String type, Cuisine cuisine) {
        super(type, cuisine);
    }

    public MainCourse(String type, Cuisine cuisine, String name) {
        super(type, cuisine, name);
    }
}
