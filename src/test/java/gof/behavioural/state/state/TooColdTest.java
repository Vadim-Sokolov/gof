package gof.behavioural.state.state;

import gof.behavioural.state.OvenException;
import gof.behavioural.state.PizzaOven;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TooColdTest {

    private final PizzaOven oven = new PizzaOven();
    private final TooCold tooCold = new TooCold(oven);

    @BeforeEach
    void setUp() {
        oven.setOvenState(tooCold);
    }

    @Test
    void bake() {
        // GIVEN
        var expected = "Too cold to bake";

        // WHEN
        var actual = assertThrows(OvenException.class, tooCold::bake);

        // THEN
        assertEquals(expected, actual.getMessage());
    }

    @Test
    void heatUp() {
        // GIVEN
        var expected = "Heating up";

        // WHEN
        var actual = tooCold.heatUp();

        // THEN
        assertEquals(expected, actual);
        assertInstanceOf(Ready.class, oven.getOvenState());
    }

    @Test
    void coolDown() {
        // GIVEN
        var expected = "Already too cold";

        // WHEN
        var actual = assertThrows(OvenException.class, tooCold::coolDown);

        // THEN
        assertEquals(expected, actual.getMessage());
    }
}