package gof.behavioural.state.state;

import gof.behavioural.state.OvenException;
import gof.behavioural.state.PizzaOven;

public class TooHot implements OvenState {

    private static final String TOO_HOT_TO_BAKE = "Too hot to bake";
    private static final String ALREADY_TOO_HOT = "Already too hot";
    private static final String COOLING_DOWN = "Cooling down";

    private final PizzaOven oven;

    public TooHot(PizzaOven oven) {
        this.oven = oven;
    }

    @Override
    public String bake() throws OvenException {
        throw new OvenException(TOO_HOT_TO_BAKE);
    }

    @Override
    public String heatUp() throws OvenException {
        throw new OvenException(ALREADY_TOO_HOT);
    }

    @Override
    public String coolDown() {
        oven.setOvenState(oven.getReady());
        System.out.println(COOLING_DOWN);
        return COOLING_DOWN;
    }
}
