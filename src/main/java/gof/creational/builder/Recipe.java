package gof.creational.builder;

import gof.creational.builder.ingredient.Ingredient;

import java.util.Map;

public class Recipe {

    private final Map<String, Ingredient> ingredients;

    public Recipe(Map<String, Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Map<String, Ingredient> getIngredients() {
        return ingredients;
    }
}
