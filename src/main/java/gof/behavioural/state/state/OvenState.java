package gof.behavioural.state.state;

import gof.behavioural.state.OvenException;

public interface OvenState {

    String bake() throws OvenException;

    String heatUp() throws OvenException;

    String coolDown() throws OvenException;
}
