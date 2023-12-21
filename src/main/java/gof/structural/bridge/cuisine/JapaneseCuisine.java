package gof.structural.bridge.cuisine;

import gof.structural.bridge.recipe.JapaneseRecipe;

public class JapaneseCuisine implements Cuisine {
    private static final JapaneseRecipe JAPANESE_RECIPE = new JapaneseRecipe();

    @Override
    public JapaneseRecipe getRecipe() {
        return JAPANESE_RECIPE;
    }
}
