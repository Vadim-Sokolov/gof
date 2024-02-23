package gof.behavioural.state;

import gof.behavioural.state.state.OvenState;
import gof.behavioural.state.state.Ready;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class PizzaOvenTest {

    private final OvenState ready = mock(Ready.class);
    private final PizzaOven oven = new PizzaOven();

    @BeforeEach
    void setUp() {
        oven.setOvenState(ready);
    }

    @Test
    void bake() throws OvenException {
        // WHEN
        oven.bake();

        // THEN
        verify(ready, times(1)).bake();
    }

    @Test
    void heatUp() throws OvenException {
        // WHEN
        oven.heatUp();

        // THEN
        verify(ready, times(1)).heatUp();
    }

    @Test
    void coolDown() throws OvenException {
        // WHEN
        oven.coolDown();

        // THEN
        verify(ready, times(1)).coolDown();
    }
}