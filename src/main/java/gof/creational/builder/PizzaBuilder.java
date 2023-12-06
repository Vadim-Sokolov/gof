package gof.creational.builder;

import gof.creational.builder.ingredient.Ingredient;

import java.util.Map;

public class PizzaBuilder {

    public Pizza buildPizza(Map<String, Ingredient> ingredients) {
        return new Pizza(new Recipe(ingredients));
    }
}
