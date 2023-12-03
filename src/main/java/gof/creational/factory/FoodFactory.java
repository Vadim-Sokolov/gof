package gof.creational.factory;

import gof.creational.factory.food.Food;
import gof.creational.factory.food.Lasagne;
import gof.creational.factory.food.MeatLoaf;
import gof.creational.factory.food.Pizza;
import gof.creational.factory.recipe.LasagneRecipe;
import gof.creational.factory.recipe.MeatLoafRecipe;
import gof.creational.factory.recipe.PizzaRecipe;
import gof.creational.factory.recipe.Recipe;

import java.util.Optional;

public class FoodFactory {

    public Optional<Food> createFood(Recipe recipe) {
        var recipeToUse = recipe.getClass();

        if (recipeToUse.equals(LasagneRecipe.class)) {
            return Optional.of(new Lasagne(recipe));
        }
        if (recipeToUse.equals(MeatLoafRecipe.class)) {
            return Optional.of(new MeatLoaf(recipe));
        }
        if (recipeToUse.equals(PizzaRecipe.class)) {
            return Optional.of(new Pizza(recipe));
        }
        return Optional.empty();
    }
}
