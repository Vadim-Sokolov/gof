package gof.structural.proxy;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CalculatorCache {

    private static final Map<Pair<Integer, Integer>, Integer> ADDITION_CACHE = new HashMap<>();
    private static final Map<Pair<Integer, Integer>, Integer> SUBTRACTION_CACHE = new HashMap<>();
    private static final Map<Pair<Integer, Integer>, Integer> MULTIPLICATION_CACHE = new HashMap<>();
    private static final Map<Pair<Integer, Integer>, Integer> DIVISION_CACHE = new HashMap<>();

    public Optional<Integer> checkAdditionCache(Pair<Integer, Integer> params) {
        return Optional.ofNullable(ADDITION_CACHE.get(params));
    }

    public void addEntryToAdditionCache(Pair<Integer, Integer> key, Integer value) {
        ADDITION_CACHE.put(key, value);
    }

    public Optional<Integer> checkSubtractionCache(Pair<Integer, Integer> params) {
        return Optional.ofNullable(SUBTRACTION_CACHE.get(params));
    }

    public void addEntryToSubtractionCache(Pair<Integer, Integer> key, Integer value) {
        SUBTRACTION_CACHE.put(key, value);
    }

    public Optional<Integer> checkMultiplicationCache(Pair<Integer, Integer> params) {
        return Optional.ofNullable(MULTIPLICATION_CACHE.get(params));
    }

    public void addEntryToMultiplicationCache(Pair<Integer, Integer> key, Integer value) {
        MULTIPLICATION_CACHE.put(key, value);
    }

    public Optional<Integer> checkDivisionCache(Pair<Integer, Integer> params) {
        return Optional.ofNullable(DIVISION_CACHE.get(params));
    }

    public void addEntryToDivisionCache(Pair<Integer, Integer> key, Integer value) {
        DIVISION_CACHE.put(key, value);
    }
}
