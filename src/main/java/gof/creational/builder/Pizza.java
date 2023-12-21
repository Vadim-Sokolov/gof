package gof.creational.builder;

public class Pizza {

    private final Recipe recipe;

    public Pizza(Recipe recipe) {
        this.recipe = recipe;
    }

    public Recipe getRecipe() {
        return recipe;
    }
}
