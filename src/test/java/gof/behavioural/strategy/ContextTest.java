package gof.behavioural.strategy;

import gof.behavioural.strategy.strategy.BubbleSort;
import gof.behavioural.strategy.strategy.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContextTest {

    private final Context context = new Context();

    @Test
    void sortUsingBubble() {
        // GIVEN
        var expected = "Bubble Sort";
        context.setSortStrategy(new BubbleSort());

        // WHEN
        var actual = context.sort(new int[]{2, 3, 4});

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void sortUsingQuick() {
        // GIVEN
        var expected = "Quick Sort";
        context.setSortStrategy(new QuickSort());

        // WHEN
        var actual = context.sort(new int[]{2, 3, 4});

        // THEN
        assertEquals(expected, actual);
    }
}