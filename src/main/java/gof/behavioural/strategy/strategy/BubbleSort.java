package gof.behavioural.strategy.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BubbleSort implements SortStrategy {
    @Override
    public String sort(int[] array) {
        log.debug("Using bubble sort strategy");
        return "Bubble Sort";
    }
}
