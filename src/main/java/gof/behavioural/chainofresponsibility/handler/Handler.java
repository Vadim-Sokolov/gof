package gof.behavioural.chainofresponsibility.handler;

import gof.behavioural.chainofresponsibility.model.EmergencyService;

public interface Handler {

    EmergencyService handleEmergencyRequest(String request) throws EmergencyRequestHandlerException;
}
