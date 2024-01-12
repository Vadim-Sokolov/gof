package gof.behavioural.command;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTest {

    private Pizza pizza;

    @BeforeEach
    void setUp() {
        pizza = new Pizza(new HashMap<>());
    }

    @Test
    void testAddBacon() {
        // WHEN
        pizza.addBacon();

        // THEN
        assertEquals(1, pizza.ingredients.getOrDefault(Ingredient.BACON, 0));
    }

    @Test
    void testRemoveBacon() {
        // GIVEN
        pizza.ingredients.put(Ingredient.BACON, 2);

        // WHEN
        pizza.removeBacon();

        // THEN
        assertEquals(1, pizza.ingredients.getOrDefault(Ingredient.BACON, 0));
    }

    @Test
    void testRemoveBaconWhenNotPresent() {
        // WHEN
        pizza.removeBacon();

        // THEN
        assertEquals(0, pizza.ingredients.getOrDefault(Ingredient.BACON, -7));
    }

    @Test
    void testAddCheese() {
        // WHEN
        pizza.addCheese();

        // THEN
        assertEquals(1, pizza.ingredients.getOrDefault(Ingredient.CHEESE, 0));
    }

    @Test
    void testRemoveCheese() {
        // GIVEN
        pizza.ingredients.put(Ingredient.CHEESE, 2);

        // WHEN
        pizza.removeCheese();

        // THEN
        assertEquals(1, pizza.ingredients.getOrDefault(Ingredient.CHEESE, 0));
    }

    @Test
    void testRemoveCheeseWhenNotPresent() {
        // WHEN
        pizza.removeCheese();

        // THEN
        assertEquals(0, pizza.ingredients.getOrDefault(Ingredient.CHEESE, -7));
    }

    // Similar tests for other ingredient methods (addMushrooms, removeMushrooms, etc.)

    @Test
    void testAddTomato() {
        // WHEN
        pizza.addTomato();

        // THEN
        assertEquals(1, pizza.ingredients.getOrDefault(Ingredient.TOMATO, 0));
    }

    @Test
    void testRemoveTomato() {
        // GIVEN
        pizza.ingredients.put(Ingredient.TOMATO, 2);

        // WHEN
        pizza.removeTomato();

        // THEN
        assertEquals(1, pizza.ingredients.getOrDefault(Ingredient.TOMATO, 0));
    }

    @Test
    void testRemoveTomatoWhenNotPresent() {
        // WHEN
        pizza.removeTomato();

        // THEN
        assertEquals(0, pizza.ingredients.getOrDefault(Ingredient.TOMATO, -7));
    }
}
