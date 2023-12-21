package gof.structural.proxy;

import javafx.util.Pair;

public interface Calculator {

    Integer add(Pair<Integer, Integer> pair);

    Integer subtract(Pair<Integer, Integer> pair);

    Integer multiply(Pair<Integer, Integer> pair);

    Integer divide(Pair<Integer, Integer> pair);
}
