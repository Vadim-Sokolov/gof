package gof.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoManagerTest {

    @Test
    void shouldReturnCorrectAutomobile() {
        // GIVEN
        var expected = "Car";

        // WHEN
        var actual = AutoManager.getAutomobile(1);

        // THEN
        assertEquals(expected, actual.getType());
    }
}