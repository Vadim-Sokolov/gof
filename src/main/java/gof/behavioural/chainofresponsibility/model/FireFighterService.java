package gof.behavioural.chainofresponsibility.model;

public class FireFighterService implements EmergencyService {

    @Override
    public String handleRequest() {
        return "Firefighters dispatched for fire emergency.";
    }
}
