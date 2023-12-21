package gof.structural.bridge;

import gof.structural.bridge.cuisine.AmericanCuisine;
import gof.structural.bridge.cuisine.ItalianCuisine;
import gof.structural.bridge.cuisine.JapaneseCuisine;
import gof.structural.bridge.dish.Dessert;
import gof.structural.bridge.dish.Dish;
import gof.structural.bridge.dish.MainCourse;
import gof.structural.bridge.dish.Soup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    private final Restaurant restaurant = new Restaurant(new Kitchen());

    @Test
    void shouldReturnCorrectDish() throws RestaurantException {
        // GIVEN
        var expected1 = "Ramen";
        var expected2 = "Barbeque";
        var expected3 = "Tiramisu";

        // WHEN
        var actual1 = restaurant.cook(new Soup("Soup", new JapaneseCuisine()));
        var actual2 = restaurant.cook(new MainCourse("Main course", new AmericanCuisine()));
        var actual3 = restaurant.cook(new Dessert("Dessert", new ItalianCuisine()));

        // THEN
        assertEquals(expected1, actual1.getName());
        assertEquals(expected2, actual2.getName());
        assertEquals(expected3, actual3.getName());
    }

    @Test
    void shouldThrowError() {
        // GIVEN
        var expected = "Can not cook unknown dish type: UnknownDish";

        // WHEN
        RestaurantException thrown = Assertions.assertThrows(RestaurantException.class, () -> {
            restaurant.cook(new UnknownDish("Babaganoosh"));
        });

        // THEN
        Assertions.assertEquals(expected, thrown.getMessage());
    }

    static class UnknownDish extends Dish {
        public UnknownDish(String name) {
            super(name);
        }
    }

    @Test
    void whenDishIsNull_shouldThrowException() {
        // GIVEN
        var expected = "Dish can not be null";

        // WHEN
        RestaurantException thrown = Assertions.assertThrows(RestaurantException.class, () -> {
            restaurant.cook(null);
        });

        // THEN
        Assertions.assertEquals(expected, thrown.getMessage());
    }
}
