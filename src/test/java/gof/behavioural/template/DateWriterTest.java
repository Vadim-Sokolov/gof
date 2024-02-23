package gof.behavioural.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateWriterTest {

    private final DateWriter dateWriter = new DateWriter();

    @Test
    void recordTimeTest() {
        // GIVEN
        var expected = "DATE has been recorded";

        // WHEN
        var actual = dateWriter.processData();

        // THEN
        assertEquals(expected, actual);
    }
}
