package gof.behavioural.state.state;

import gof.behavioural.state.PizzaOven;

public class Ready implements OvenState {

    private static final String BAKING_PIZZA = "Baking Pizza";
    private static final String HEATING_UP = "Heating up";
    private static final String COOLING_DOWN = "Cooling down";

    private final PizzaOven oven;

    public Ready(PizzaOven oven) {
        this.oven = oven;
    }

    @Override
    public String bake() {
        System.out.println(BAKING_PIZZA);
        return BAKING_PIZZA;
    }

    @Override
    public String heatUp() {
        oven.setOvenState(oven.getTooHot());
        System.out.println(HEATING_UP);
        return HEATING_UP;
    }

    @Override
    public String coolDown() {
        oven.setOvenState(oven.getTooCold());
        System.out.println(COOLING_DOWN);
        return COOLING_DOWN;
    }
}
