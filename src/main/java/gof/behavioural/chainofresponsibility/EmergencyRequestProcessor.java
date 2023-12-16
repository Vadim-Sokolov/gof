package gof.behavioural.chainofresponsibility;

import gof.behavioural.chainofresponsibility.model.AmbulanceService;
import gof.behavioural.chainofresponsibility.model.EmergencyService;
import gof.behavioural.chainofresponsibility.model.FireFighterService;
import gof.behavioural.chainofresponsibility.model.PoliceService;

public class EmergencyRequestProcessor {

    public EmergencyService processEmergencyRequest(String request) throws EmergencyRequestProcessorException {
        if (request.equals("Fire")) {
            return new FireFighterService();
        }
        if (request.equals("Police")) {
            return new PoliceService();
        }
        if (request.equals("Ambulance")) {
            return new AmbulanceService();
        }
        throw new EmergencyRequestProcessorException("Service not found: " + request);
    }
}
