package gof.behavioural.visitor;

import gof.behavioural.visitor.visitable.Bacon;
import gof.behavioural.visitor.visitable.Cheese;
import gof.behavioural.visitor.visitable.Mushrooms;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaCookTest {

    private PizzaCook pizzaCook;

    @BeforeEach
    void setUp() {
        pizzaCook = new PizzaCook();
    }

    @Test
    void shouldContainOnlyBacon() {
        // GIVEN
        var expected = "BACON";
        var unexpected = "CHEESE";

        // WHEN
        pizzaCook.visit(new Bacon());
        var actual = pizzaCook.getIngredients();

        // THEN
        assertTrue(actual.contains(expected));
        assertFalse(actual.contains(unexpected));
    }

    @Test
    void shouldContainBaconAndCheese() {
        // GIVEN
        var expected1 = "BACON";
        var expected2 = "CHEESE";
        var unexpected = "MUSHROOMS";

        // WHEN
        pizzaCook.visit(new Bacon());
        pizzaCook.visit(new Cheese());
        var actual = pizzaCook.getIngredients();

        // THEN
        assertTrue(actual.contains(expected1));
        assertTrue(actual.contains(expected2));
        assertFalse(actual.contains(unexpected));
    }

    @Test
    void shouldContainCheeseAndMushrooms() {
        // GIVEN
        var expected1 = "CHEESE";
        var expected2 = "MUSHROOMS";
        var unexpected = "BACON";

        // WHEN
        pizzaCook.visit(new Cheese());
        pizzaCook.visit(new Mushrooms());
        var actual = pizzaCook.getIngredients();

        // THEN
        assertTrue(actual.contains(expected1));
        assertTrue(actual.contains(expected2));
        assertFalse(actual.contains(unexpected));
    }
}