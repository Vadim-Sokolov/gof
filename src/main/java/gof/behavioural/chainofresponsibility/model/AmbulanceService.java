package gof.behavioural.chainofresponsibility.model;

public class AmbulanceService implements EmergencyService {

    @Override
    public String handleRequest() {
        return "Ambulance dispatched for medical emergency.";
    }
}
