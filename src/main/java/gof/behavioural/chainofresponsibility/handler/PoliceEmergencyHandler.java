package gof.behavioural.chainofresponsibility.handler;

import gof.behavioural.chainofresponsibility.model.EmergencyService;
import gof.behavioural.chainofresponsibility.model.PoliceService;

public class PoliceEmergencyHandler extends EmergencyRequestHandler {

    private static final String POLICE_EMERGENCY = "Police emergency";

    public PoliceEmergencyHandler(Handler next) {
        super((EmergencyRequestHandler) next);
    }

    @Override
    public EmergencyService handleEmergencyRequest(String request) throws EmergencyRequestHandlerException {
        if (request.equals(POLICE_EMERGENCY)) {
            return new PoliceService();
        }
        return handleNext(request);
    }
}
