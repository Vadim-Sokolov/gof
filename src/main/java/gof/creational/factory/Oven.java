package gof.creational.factory;

import gof.creational.factory.food.Food;
import gof.creational.factory.recipe.Recipe;

public class Oven {

    private final FoodFactory factory;

    public Oven(FoodFactory factory) {
        this.factory = factory;
    }

    public Food cook(Recipe recipe) throws FoodException {
        var newFoodOptional = factory.createFood(recipe);
        if (newFoodOptional.isPresent()) {
            newFoodOptional.get().cook();
            return newFoodOptional.get();
        } else {
            System.out.println("Can not cook unknown recipe");
            throw new FoodException("Unknown recipe");
        }
    }
}
