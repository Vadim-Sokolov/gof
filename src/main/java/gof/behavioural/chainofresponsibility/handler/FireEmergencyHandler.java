package gof.behavioural.chainofresponsibility.handler;

import gof.behavioural.chainofresponsibility.model.EmergencyService;
import gof.behavioural.chainofresponsibility.model.FireFighterService;

public class FireEmergencyHandler extends EmergencyRequestHandler {

    private static final String FIRE_EMERGENCY = "Fire emergency";
    private Handler next;

    public FireEmergencyHandler(Handler next) {
        super((EmergencyRequestHandler) next);
    }

    @Override
    public EmergencyService handleEmergencyRequest(String request) throws EmergencyRequestHandlerException {
        if (request.equals(FIRE_EMERGENCY)) {
            return new FireFighterService();
        }
        return handleNext(request);
    }
}
