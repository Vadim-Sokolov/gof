package gof.structural.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoratorTest {

    @Test
    void testDecorator() {
        // GIVEN
        var expectedDescription = "Thin Doe, Mozzarella, Mushrooms, Bacon";
        var expectedCost = 6.0;

        // WHEN
        var actual = new Bacon(new Mushrooms(new Mozzarella(new PlainPizza())));

        // THEN
        assertEquals(expectedDescription, actual.getDescription());
        assertEquals(expectedCost, actual.getCost());
    }
}