package gof.behavioural.chainofresponsibility;

import gof.behavioural.chainofresponsibility.model.FireFighterService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmergencyRequestProcessorTest {

    private final EmergencyRequestProcessor processor = new EmergencyRequestProcessor();

    @Test
    void processEmergencyRequest_shouldReturnCorrectEmergencyService() throws EmergencyRequestProcessorException {
        // WHEN
        var actual = processor.processEmergencyRequest("Fire");

        // THEN
        assertEquals(FireFighterService.class, actual.getClass());
    }

    @Test
    void processEmergencyRequest_shouldThrowCorrectException() {
        // GIVEN
        var expected = "Service not found: Birthday Cake!";

        // WHEN
        var actual = Assertions.assertThrows(EmergencyRequestProcessorException.class, () -> {
            processor.processEmergencyRequest("Birthday Cake!");
        });

        // THEN
        Assertions.assertEquals(expected, actual.getMessage());
    }
}