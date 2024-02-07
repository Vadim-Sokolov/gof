package gof.behavioural.state.state;

import gof.behavioural.state.OvenException;
import gof.behavioural.state.PizzaOven;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TooHotTest {

    private final PizzaOven oven = new PizzaOven();
    private final TooHot tooHot = new TooHot(oven);

    @BeforeEach
    void setUp() {
        oven.setOvenState(tooHot);
    }

    @Test
    void bake() {
        // GIVEN
        var expected = "Too hot to bake";

        // WHEN
        var actual = assertThrows(OvenException.class, tooHot::bake);

        // THEN
        assertEquals(expected, actual.getMessage());
    }

    @Test
    void heatUp() {
        // GIVEN
        var expected = "Already too hot";

        // WHEN
        var actual = assertThrows(OvenException.class, tooHot::heatUp);

        // THEN
        assertEquals(expected, actual.getMessage());
    }

    @Test
    void coolDown() {
        // GIVEN
        var expected = "Cooling down";

        // WHEN
        var actual = tooHot.coolDown();

        // THEN
        assertEquals(expected, actual);
        assertInstanceOf(Ready.class, oven.getOvenState());
    }
}