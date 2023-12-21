package gof.creational.builder;

import gof.creational.builder.ingredient.*;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PizzaBuilderTest {

    private static final int BOUND = 6;
    private final PizzaBuilder builder = new PizzaBuilder();
    private final Random random = new Random();

    @Test
    void shouldBuildPizza_withCorrectIngredients() {
        // GIVEN
        var ingredients = createIngredients();

        // WHEN
        var actual = builder.buildPizza(ingredients);

        // THEN
        assertEquals(ingredients, actual.getRecipe().getIngredients());
    }

    private Map<String, Ingredient> createIngredients() {
        var ingredients = new HashMap<String, Ingredient>();
        ingredients.put("Bacon", new Bacon(random.nextInt(BOUND)));
        ingredients.put("Cheese", new Cheese(random.nextInt(BOUND)));
        ingredients.put("Mushrooms", new Mushrooms(random.nextInt(BOUND)));
        ingredients.put("Pineapple", new Pineapple(random.nextInt(BOUND)));
        ingredients.put("Seafood", new Seafood(random.nextInt(BOUND)));
        return ingredients;
    }

}