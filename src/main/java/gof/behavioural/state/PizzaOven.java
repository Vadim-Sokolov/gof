package gof.behavioural.state;

import gof.behavioural.state.state.OvenState;
import gof.behavioural.state.state.Ready;
import gof.behavioural.state.state.TooCold;
import gof.behavioural.state.state.TooHot;
import lombok.Data;

@Data
public class PizzaOven {

    private final OvenState ready;
    private final OvenState tooHot;
    private final OvenState tooCold;

    private OvenState ovenState;

    public PizzaOven() {
        this.ready = new Ready(this);
        this.tooHot = new TooHot(this);
        this.tooCold = new TooCold(this);
        this.ovenState = tooCold;
    }

    public void bake() throws OvenException {
        ovenState.bake();
    }

    public void heatUp() throws OvenException {
        ovenState.heatUp();
    }

    public void coolDown() throws OvenException {
        ovenState.coolDown();
    }
}
