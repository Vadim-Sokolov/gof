package gof.behavioural.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeWriterTest {

    private final TimeWriter timeWriter = new TimeWriter();

    @Test
    void recordTimeTest() {
        // GIVEN
        var expected = "TIME has been recorded";

        // WHEN
        var actual = timeWriter.processData();

        // THEN
        assertEquals(expected, actual);

    }
}