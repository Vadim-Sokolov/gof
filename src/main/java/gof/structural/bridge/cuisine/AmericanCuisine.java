package gof.structural.bridge.cuisine;

import gof.structural.bridge.recipe.AmericanRecipe;

public class AmericanCuisine implements Cuisine {
    private static final AmericanRecipe AMERICAN_RECIPE = new AmericanRecipe();

    @Override
    public AmericanRecipe getRecipe() {
        return AMERICAN_RECIPE;
    }
}
