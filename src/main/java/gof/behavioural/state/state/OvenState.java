package gof.behavioural.state.state;

import gof.behavioural.state.OvenException;
import gof.behavioural.state.PizzaOven;

public interface OvenState {

    String bake() throws OvenException;

    String heatUp() throws OvenException;

    String coolDown() throws OvenException;
}
