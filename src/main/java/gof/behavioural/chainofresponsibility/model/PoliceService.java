package gof.behavioural.chainofresponsibility.model;

public class PoliceService implements EmergencyService {

    @Override
    public String handleRequest() {
        return "Police dispatched for police emergency.";
    }
}
