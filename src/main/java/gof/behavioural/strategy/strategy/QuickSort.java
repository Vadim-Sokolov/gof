package gof.behavioural.strategy.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuickSort implements SortStrategy {
    @Override
    public String sort(int[] array) {
        log.debug("Using quick sort strategy");
        return "Quick Sort";
    }
}
