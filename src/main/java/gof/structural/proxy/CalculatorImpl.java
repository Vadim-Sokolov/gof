package gof.structural.proxy;

import javafx.util.Pair;

public class CalculatorImpl implements Calculator {
    @Override
    public Integer add(Pair<Integer, Integer> pair) {
        return pair.getKey() + pair.getValue();
    }

    @Override
    public Integer subtract(Pair<Integer, Integer> pair) {
        return pair.getKey() - pair.getValue();
    }

    @Override
    public Integer multiply(Pair<Integer, Integer> pair) {
        return pair.getKey() * pair.getValue();
    }

    @Override
    public Integer divide(Pair<Integer, Integer> pair) {
        return pair.getKey() / pair.getValue();
    }
}
