package gof.behavioural.state.state;

import gof.behavioural.state.PizzaOven;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadyTest {

    private final PizzaOven oven = new PizzaOven();
    private final Ready ready = new Ready(oven);

    @BeforeEach
    void setUp() {
        oven.setOvenState(ready);
    }

    @Test
    void bake() {
        // GIVEN
        var expected = "Baking Pizza";

        // WHEN
        var actual = ready.bake();

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void heatUp() {
        // GIVEN
        var expected = "Heating up";

        // WHEN
        var actual = ready.heatUp();

        // THEN
        assertEquals(expected, actual);
        assertInstanceOf(TooHot.class, oven.getOvenState());
    }

    @Test
    void coolDown() {
        // GIVEN
        var expected = "Cooling down";

        // WHEN
        var actual = ready.coolDown();

        // THEN
        assertEquals(expected, actual);
        assertInstanceOf(TooCold.class, oven.getOvenState());
    }
}