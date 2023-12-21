package gof.structural.decorator;

import gof.structural.decorator.pizza.Bacon;
import gof.structural.decorator.pizza.Mozzarella;
import gof.structural.decorator.pizza.Mushrooms;
import gof.structural.decorator.pizza.PlainPizza;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KitchenTest {

    private final Kitchen kitchen = new Kitchen();

    @Test
    void shouldReturnCorrectPizza() {
        // GIVEN
        var expectedDescription = "Thin Doe, Bacon, Mushrooms, Mozzarella";
        var expectedCost = 6.0;

        // WHEN
        var actual = kitchen.cookPizza(new ArrayList<>(List.of(
                new Bacon(new PlainPizza()), new Mushrooms(new PlainPizza()), new Mozzarella(new PlainPizza()))));

        // THEN
        assertEquals(expectedDescription, actual.getDescription());
        assertEquals(expectedCost, actual.getCost());
    }
}