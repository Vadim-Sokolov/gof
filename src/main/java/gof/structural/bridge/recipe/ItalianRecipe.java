package gof.structural.bridge.recipe;

import gof.structural.bridge.dish.*;

import java.util.HashMap;
import java.util.Map;

public class ItalianRecipe implements Recipe {

    private static final Map<String, Dish> RECIPES = new HashMap<>();

    static {
        RECIPES.put("Soup", new Soup("Minestrone"));
        RECIPES.put("Main course", new MainCourse("Pizza"));
        RECIPES.put("Drink", new Drink("Cappucino"));
        RECIPES.put("Dessert", new Dessert("Tiramisu"));
    }

    @Override
    public Map<String, Dish> getRecipes() {
        return RECIPES;
    }
}
