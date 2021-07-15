import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    private final Fibonacci target = new Fibonacci();

    @Test
    public void test() {
        //  0   1   1   2   3   5   8   13  21  34  55
        Assertions.assertEquals(0, target.iterative(1));
        Assertions.assertEquals(1, target.iterative(2));
        Assertions.assertEquals(1, target.iterative(3));
        Assertions.assertEquals(2, target.iterative(4));
        Assertions.assertEquals(3, target.iterative(5));
        Assertions.assertEquals(5, target.iterative(6));
        Assertions.assertEquals(8, target.iterative(7));
        Assertions.assertEquals(13, target.iterative(8));
        Assertions.assertEquals(21, target.iterative(9));
        Assertions.assertEquals(34, target.iterative(10));
        Assertions.assertEquals(55, target.iterative(11));
        Assertions.assertThrows(IllegalArgumentException.class, () -> target.iterative(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> target.iterative(-1));

        //  0   1   1   2   3   5   8   13  21  34  55
        Assertions.assertEquals(0, target.recursive(1));
        Assertions.assertEquals(1, target.recursive(2));
        Assertions.assertEquals(1, target.recursive(3));
        Assertions.assertEquals(2, target.recursive(4));
        Assertions.assertEquals(3, target.recursive(5));
        Assertions.assertEquals(5, target.recursive(6));
        Assertions.assertEquals(8, target.recursive(7));
        Assertions.assertEquals(13, target.recursive(8));
        Assertions.assertEquals(21, target.recursive(9));
        Assertions.assertEquals(34, target.recursive(10));
        Assertions.assertEquals(55, target.recursive(11));
        Assertions.assertThrows(IllegalArgumentException.class, () -> target.recursive(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> target.recursive(-1));

        //  0   1   1   2   3   5   8   13  21  34  55
        Assertions.assertEquals(0, target.list(1));
        Assertions.assertEquals(1, target.list(2));
        Assertions.assertEquals(1, target.list(3));
        Assertions.assertEquals(2, target.list(4));
        Assertions.assertEquals(3, target.list(5));
        Assertions.assertEquals(5, target.list(6));
        Assertions.assertEquals(8, target.list(7));
        Assertions.assertEquals(13, target.list(8));
        Assertions.assertEquals(21, target.list(9));
        Assertions.assertEquals(34, target.list(10));
        Assertions.assertEquals(55, target.list(11));
        Assertions.assertThrows(IllegalArgumentException.class, () -> target.list(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> target.list(-1));
    }
}
