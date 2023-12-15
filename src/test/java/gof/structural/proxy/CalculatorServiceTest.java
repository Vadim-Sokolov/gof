package gof.structural.proxy;

import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculatorServiceTest {

    private final Calculator mockCalculator = mock(CalculatorImpl.class);
    private final CalculatorCache mockCache = mock(CalculatorCache.class);
    private final CalculatorService calculatorService = new CalculatorService(mockCalculator, mockCache);

    @Test
    void add() {

        // GIVEN
        Pair<Integer, Integer> pair = new Pair<>(7, 11);
        int expected = 18;

        when(mockCache.checkAdditionCache(pair)).thenReturn(Optional.of(expected));

        // WHEN
        Integer actual = calculatorService.add(pair);

        // THEN
        assertEquals(expected, actual);

        // Verify that the calculator was not invoked
        verify(mockCalculator, never()).add(pair);
        // Verify that the cache method was invoked
        verify(mockCache, times(1)).checkAdditionCache(pair);
        verify(mockCache, never()).addEntryToAdditionCache(pair, expected);
    }

    @Test
    void subtract() {
        // GIVEN
        Pair<Integer, Integer> pair = new Pair<>(10, 5);
        int expected = 5;

        when(mockCache.checkSubtractionCache(pair)).thenReturn(Optional.of(expected));

        // WHEN
        Integer actual = calculatorService.subtract(pair);

        // THEN
        assertEquals(expected, actual);

        // Verify that the calculator was not invoked
        verify(mockCalculator, never()).subtract(pair);
        // Verify that the cache method was invoked
        verify(mockCache, times(1)).checkSubtractionCache(pair);
        verify(mockCache, never()).addEntryToSubtractionCache(pair, expected);
    }

    @Test
    void multiply() {
        // GIVEN
        Pair<Integer, Integer> pair = new Pair<>(5, 5);
        int expected = 25;

        when(mockCache.checkMultiplicationCache(pair)).thenReturn(Optional.of(expected));

        // WHEN
        Integer actual = calculatorService.multiply(pair);

        // THEN
        assertEquals(expected, actual);

        // Verify that the calculator was not invoked
        verify(mockCalculator, never()).multiply(pair);
        // Verify that the cache method was invoked
        verify(mockCache, times(1)).checkMultiplicationCache(pair);
        verify(mockCache, never()).addEntryToMultiplicationCache(pair, expected);
    }

    @Test
    void divide() {
        // GIVEN
        Pair<Integer, Integer> pair = new Pair<>(8, 2);
        int expected = 4;

        when(mockCache.checkDivisionCache(pair)).thenReturn(Optional.of(expected));

        // WHEN
        Integer actual = calculatorService.divide(pair);

        // THEN
        assertEquals(expected, actual);

        // Verify that the calculator was not invoked
        verify(mockCalculator, never()).divide(pair);
        // Verify that the cache method was invoked
        verify(mockCache, times(1)).checkDivisionCache(pair);
        verify(mockCache, never()).addEntryToDivisionCache(pair, expected);
    }
}