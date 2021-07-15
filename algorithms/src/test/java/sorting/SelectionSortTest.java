package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SelectionSortTest {
    private SelectionSort target = new SelectionSort();

    @Test
    public void test() {
//        Assertions.assertEquals(null, target.sort(null));
//        Assertions.assertTrue(Arrays.equals(new int[]{}, target.sort(new int[]{})));
//        Assertions.assertTrue(Arrays.equals(new int[]{0}, target.sort(new int[]{0})));
//        Assertions.assertTrue(Arrays.equals(new int[]{0, 1}, target.sort(new int[]{0, 1})));
        Assertions.assertTrue(Arrays.equals(new int[]{0, 1}, target.sort(new int[]{1, 0})));
//        Assertions.assertTrue(Arrays.equals(new int[]{1, 3, 4, 6, 10}, target.sort(new int[]{4, 3, 10, 1, 6})));
    }
}
