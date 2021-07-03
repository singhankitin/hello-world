import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindPairWithSumTest {
    final FindPairWithSum target = new FindPairWithSum();

    @Test
    public void testFindPairWithSum() {
        int[] arrayOfInts = new int[]{};
        Assertions.assertFalse(target.findPairWithSum(arrayOfInts, 5));
    }

    @Test
    public void testFindPairWithSumWithNullInput() {
        Assertions.assertFalse(target.findPairWithSum(null, 5));
    }

    @Test
    public void testFinfPairWithSum() {
        Assertions.assertFalse(target.findPairWithSum(new int[]{0}, 5));
        Assertions.assertFalse(target.findPairWithSum(new int[]{0, 1}, 5));
        Assertions.assertFalse(target.findPairWithSum(new int[]{6, 7, 8, 9}, 5));
        Assertions.assertFalse(target.findPairWithSum(new int[]{-1, 0, 1, 2}, 5));
        Assertions.assertTrue(target.findPairWithSum(new int[]{-1, 0, 6, 2}, 5));
        Assertions.assertTrue(target.findPairWithSum(new int[]{1, 2, 3, 4, 5}, 5));
        Assertions.assertTrue(target.findPairWithSum(new int[]{4, 4}, 8));
        Assertions.assertFalse(target.findPairWithSum(new int[]{4}, 4));
    }
}
