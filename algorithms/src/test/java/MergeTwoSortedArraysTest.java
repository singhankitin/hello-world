import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedArraysTest {

    private MergeTwoSortedArrays target = new MergeTwoSortedArrays();

    @Test
    public void testWithNull() {
        Assertions.assertNotNull(target.merge(null, null));
        Assertions.assertEquals(0, target.merge(null, null).length);
        Assertions.assertNotNull(target.merge(null, new int[]{}));
        Assertions.assertEquals(0, target.merge(null, new int[]{}).length);
        Assertions.assertNotNull(target.merge(new int[]{}, null));
        Assertions.assertEquals(0, target.merge(new int[]{}, null).length);
    }

    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, target.merge(new int[]{1,2,3}, new int[]{4,5,6}));
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,6}, target.merge(new int[]{4,5,6}, new int[]{1,2,3}));
        Assertions.assertArrayEquals(new int[]{1,1}, target.merge(new int[]{1}, new int[]{1}));
        Assertions.assertArrayEquals(new int[]{1}, target.merge(new int[]{1}, new int[]{}));
        Assertions.assertArrayEquals(new int[]{1}, target.merge(new int[]{}, new int[]{1}));
    }
}
