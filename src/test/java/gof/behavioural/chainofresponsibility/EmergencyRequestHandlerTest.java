package gof.behavioural.chainofresponsibility;

import gof.behavioural.chainofresponsibility.model.FireFighterService;
import gof.behavioural.chainofresponsibility.model.PoliceService;
import gof.behavioural.chainofresponsibility.handler.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmergencyRequestHandlerTest {

    @Test
    void handleEmergencyRequest_shouldReturnCorrectEmergencyServiceOnFirstStep() throws EmergencyRequestHandlerException {
        // GIVEN
        var handler = new FireEmergencyHandler(new MedicalEmergencyHandler(new PoliceEmergencyHandler(null)));
        var expected = "Firefighters dispatched for fire emergency.";

        // WHEN
        var actual = handler.handleEmergencyRequest("Fire emergency");

        // THEN
        assertEquals(FireFighterService.class, actual.getClass());
        assertEquals(expected, actual.handleRequest());

    }

    @Test
    void handleEmergencyRequest_shouldReturnCorrectEmergencyServiceOnLastStep() throws EmergencyRequestHandlerException {
        // GIVEN
        var handler = new FireEmergencyHandler(new MedicalEmergencyHandler(new PoliceEmergencyHandler(null)));
        var expected = "Police dispatched for police emergency.";

        // WHEN
        var actual = handler.handleEmergencyRequest("Police emergency");

        // THEN
        assertEquals(PoliceService.class, actual.getClass());
        assertEquals(expected, actual.handleRequest());

    }

    @Test
    void processEmergencyRequest_shouldThrowCorrectException() {
        // GIVEN
        var handler = new FireEmergencyHandler(new MedicalEmergencyHandler(new PoliceEmergencyHandler(null)));
        var expected = "Service not found: Birthday Cake!";

        // WHEN
        var actual = Assertions.assertThrows(EmergencyRequestHandlerException.class, () -> {
            handler.handleEmergencyRequest("Birthday Cake!");
        });

        // THEN
        assertEquals(expected, actual.getMessage());
    }
}