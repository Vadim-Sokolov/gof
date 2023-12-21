package gof.structural.proxy;

import javafx.util.Pair;

public class CalculatorService implements Calculator {

    private final Calculator calculator;
    private final CalculatorCache cache;

    public CalculatorService(Calculator calculator, CalculatorCache cache) {
        this.calculator = calculator;
        this.cache = cache;
    }

    @Override
    public Integer add(Pair<Integer, Integer> pair) {
        return cache.checkAdditionCache(pair)
                .orElseGet(() -> {
                    var result = calculator.add(pair);
                    cache.addEntryToAdditionCache(pair, result);
                    return result;
                });
    }

    @Override
    public Integer subtract(Pair<Integer, Integer> pair) {
        return cache.checkSubtractionCache(pair)
                .orElseGet(() -> {
                    var result = calculator.add(pair);
                    cache.addEntryToSubtractionCache(pair, result);
                    return result;
                });
    }

    @Override
    public Integer multiply(Pair<Integer, Integer> pair) {
        return cache.checkMultiplicationCache(pair)
                .orElseGet(() -> {
                    var result = calculator.add(pair);
                    cache.addEntryToMultiplicationCache(pair, result);
                    return result;
                });
    }

    @Override
    public Integer divide(Pair<Integer, Integer> pair) {
        return cache.checkDivisionCache(pair)
                .orElseGet(() -> {
                    var result = calculator.add(pair);
                    cache.addEntryToDivisionCache(pair, result);
                    return result;
                });
    }
}
