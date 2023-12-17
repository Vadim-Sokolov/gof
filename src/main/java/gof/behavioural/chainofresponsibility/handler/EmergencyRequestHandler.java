package gof.behavioural.chainofresponsibility.handler;

import gof.behavioural.chainofresponsibility.model.EmergencyService;

public abstract class EmergencyRequestHandler implements Handler {

    private Handler next;

    public EmergencyRequestHandler(EmergencyRequestHandler next) {
        this.next = next;
    }

    @Override
    public abstract EmergencyService handleEmergencyRequest(String request) throws EmergencyRequestHandlerException;

    public EmergencyService handleNext(String request) throws EmergencyRequestHandlerException {
        if (next == null) {
            throw new EmergencyRequestHandlerException("Service not found: " + request);
        }
        return next.handleEmergencyRequest(request);
    }

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }
}
