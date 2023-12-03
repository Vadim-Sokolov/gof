package gof.creational.factory;

import gof.creational.factory.food.Lasagne;
import gof.creational.factory.recipe.LasagneRecipe;
import gof.creational.factory.recipe.Recipe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OvenTest {

    @Test
    void whenCook_ThenCorrectItemShouldBeCooked() throws FoodException {
        // GIVEN
        var oven = new Oven(new FoodFactory());

        // WHEN
        var actual = oven.cook(new LasagneRecipe());

        // THEN
        assertEquals(actual.getClass(), Lasagne.class);
    }

    @Test
    void whenUnknownRecipeIsUsed_shouldThrowException() {
        // GIVEN
        var oven = new Oven(new FoodFactory());

        // WHEN
        FoodException thrown = Assertions.assertThrows(FoodException.class, () -> {
            oven.cook(new UnknownRecipe());
        });

        // THEN
        Assertions.assertEquals("Unknown recipe", thrown.getMessage());
    }

    static class UnknownRecipe implements Recipe {
        @Override
        public void becomeFood() {
            System.out.println("Make a mess!!");
        }
    }
}