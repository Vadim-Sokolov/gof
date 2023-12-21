package gof.behavioural.chainofresponsibility.handler;

import gof.behavioural.chainofresponsibility.model.AmbulanceService;
import gof.behavioural.chainofresponsibility.model.EmergencyService;

public class MedicalEmergencyHandler extends EmergencyRequestHandler {

    private static final String MEDICAL_EMERGENCY = "Medical emergency";

    public MedicalEmergencyHandler(Handler next) {
        super((EmergencyRequestHandler) next);
    }

    @Override
    public EmergencyService handleEmergencyRequest(String request) throws EmergencyRequestHandlerException {
        if (request.equals(MEDICAL_EMERGENCY)) {
            return new AmbulanceService();
        }
        return handleNext(request);
    }
}
