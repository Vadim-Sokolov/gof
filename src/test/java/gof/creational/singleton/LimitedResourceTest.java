package gof.creational.singleton;

import org.junit.jupiter.api.*;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LimitedResourceTest {

    @Test
    @Order(1)
    void whenLimitIsNotReached_shouldAddNewInstance() {
        // GIVEN
        var expected = 7;
        IntStream.range(0, 7).forEach(i -> new LimitedResource());

        // WHEN
        var actual = LimitedResource.getInstances();

        // THEN
        assertEquals(expected, actual.size());
    }

    @Test
    @Order(2)
    void whenLimitIsReached_shouldThrowException() {
        // GIVEN
        var expected = "Instance limit reached. Limit = 10";

        // WHEN
        var thrown = Assertions.assertThrows(IllegalStateException.class, () -> {
            IntStream.range(0, 11).forEach(i -> new LimitedResource());
        });

        // THEN
        Assertions.assertEquals(expected, thrown.getMessage());
    }
}
