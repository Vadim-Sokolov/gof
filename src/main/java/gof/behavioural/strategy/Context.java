package gof.behavioural.strategy;

import gof.behavioural.strategy.strategy.SortStrategy;
import lombok.Data;

@Data
public class Context {

    private SortStrategy sortStrategy;

    public String sort(int[] array) {
        return sortStrategy.sort(array);
    }
}
