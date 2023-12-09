package gof.structural.bridge.recipe;

import gof.structural.bridge.dish.Dish;

import java.util.Map;

public interface Recipe {
    Map<String, Dish> getRecipes();
}
