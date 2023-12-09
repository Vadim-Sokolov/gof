package gof.structural.bridge.recipe;

import gof.structural.bridge.dish.*;

import java.util.HashMap;
import java.util.Map;

public class AmericanRecipe implements Recipe {
    private static final Map<String, Dish> RECIPES = new HashMap<>();

    static {
        RECIPES.put("Soup", new Soup("Chowder"));
        RECIPES.put("Main course", new MainCourse("Barbeque"));
        RECIPES.put("Drink", new Drink("Mountain Dew"));
        RECIPES.put("Dessert", new Dessert("Cheesecake"));
    }

    @Override
    public Map<String, Dish> getRecipes() {
        return RECIPES;
    }
}
