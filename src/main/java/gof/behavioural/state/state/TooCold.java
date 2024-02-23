package gof.behavioural.state.state;

import gof.behavioural.state.OvenException;
import gof.behavioural.state.PizzaOven;

public class TooCold implements OvenState {
    
    private static final String HEATING_UP = "Heating up";
    private static final String ALREADY_TOO_COLD = "Already too cold";
    private static final String TOO_COLD_TO_BAKE = "Too cold to bake";

    private final PizzaOven oven;

    public TooCold(PizzaOven oven) {
        this.oven = oven;
    }
    
    @Override
    public String bake() throws OvenException {
        throw new OvenException(TOO_COLD_TO_BAKE);
    }

    @Override
    public String heatUp() {
        oven.setOvenState(oven.getReady());
        System.out.println(HEATING_UP);
        return HEATING_UP;
    }

    @Override
    public String coolDown() throws OvenException {
        throw new OvenException(ALREADY_TOO_COLD);
    }
}
