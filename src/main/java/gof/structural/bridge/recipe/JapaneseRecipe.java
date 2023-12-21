package gof.structural.bridge.recipe;

import gof.structural.bridge.dish.*;

import java.util.HashMap;
import java.util.Map;

public class JapaneseRecipe implements Recipe {

    private static final Map<String, Dish> RECIPES = new HashMap<>();

    static {
        RECIPES.put("Soup", new Soup("Ramen"));
        RECIPES.put("Main course", new MainCourse("Sushi"));
        RECIPES.put("Drink", new Drink("Matcha"));
        RECIPES.put("Dessert", new Dessert("Mochi"));
    }

    @Override
    public Map<String, Dish> getRecipes() {
        return RECIPES;
    }
}
