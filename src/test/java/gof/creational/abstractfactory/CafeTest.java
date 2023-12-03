package gof.creational.abstractfactory;

import gof.creational.abstractfactory.cuisine.Cuisine;
import gof.creational.abstractfactory.cuisine.ItalianCuisine;
import gof.creational.abstractfactory.lunch.ItalianLunch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    void whenMakeLunch_andCuisineIsValid_shouldReturnCorrectLunch() throws CafeException {
        // GIVEN
        var cafe = new Cafe(new LunchAbstractFactory());

        // WHEN
        var actual = cafe.makeLunch(new ItalianCuisine());

        // THEN
        assertEquals(actual.getClass(), ItalianLunch.class);
        assertEquals("Pranzo", actual.getName());
    }

    @Test
    void whenUnknownCuisineIsUsed_shouldThrowException() {
        // GIVEN
        var cafe = new Cafe(new LunchAbstractFactory());

        // WHEN
        CafeException thrown = Assertions.assertThrows(CafeException.class, () -> {
            cafe.makeLunch(new UnknownCuisine());
        });

        // THEN
        Assertions.assertEquals("Can not cook lunch for unknown cuisine", thrown.getMessage());
    }

    static class UnknownCuisine implements Cuisine {
    }
}