package gof.structural.bridge.cuisine;

import gof.structural.bridge.recipe.ItalianRecipe;

public class ItalianCuisine implements Cuisine {
    private static final ItalianRecipe ITALIAN_RECIPE = new ItalianRecipe();

    @Override
    public ItalianRecipe getRecipe() {
        return ITALIAN_RECIPE;
    }
}
