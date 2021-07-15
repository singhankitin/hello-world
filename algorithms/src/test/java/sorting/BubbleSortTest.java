package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {
    private BubbleSort target = new BubbleSort();

    @Test
    public void test() {
        Assertions.assertEquals(null, target.bubbleSort(null));
        Assertions.assertTrue(Arrays.equals(new int[]{}, target.bubbleSort(new int[]{})));
        Assertions.assertTrue(Arrays.equals(new int[]{0}, target.bubbleSort(new int[]{0})));
        Assertions.assertTrue(Arrays.equals(new int[]{0, 1}, target.bubbleSort(new int[]{0, 1})));
        Assertions.assertTrue(Arrays.equals(new int[]{0, 1}, target.bubbleSort(new int[]{1, 0})));
        Assertions.assertTrue(Arrays.equals(new int[]{1, 3, 4, 6, 10}, target.bubbleSort(new int[]{4, 3, 10, 1, 6})));
    }
}
