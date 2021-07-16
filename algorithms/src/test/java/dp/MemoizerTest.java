package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class MemoizerTest {

    private Memoizer target = new Memoizer();

    @Test
    public void testFibonacci() {
        Function<Long, Long> fibonacci = target.fibonacci();
        Assertions.assertThrows(IllegalArgumentException.class, () -> fibonacci.apply(-1L));
        Assertions.assertEquals(0, fibonacci.apply(1L));
        Assertions.assertEquals(1, fibonacci.apply(2L));
        Assertions.assertEquals(1, fibonacci.apply(3L));
        Assertions.assertEquals(2, fibonacci.apply(4L));
        Assertions.assertEquals(3, fibonacci.apply(5L));
        Assertions.assertEquals(5, fibonacci.apply(6L));
        Assertions.assertEquals(8, fibonacci.apply(7L));
        Assertions.assertEquals(13, fibonacci.apply(8L));
        Assertions.assertEquals(21, fibonacci.apply(9L));
        Assertions.assertEquals(34, fibonacci.apply(10L));
//        *Without* caching
//        Computation count:2
//        Computation count:3
//        Computation count:6
//        Computation count:11
//        Computation count:20
//        Computation count:35
//        Computation count:60
//        Computation count:101
//        Computation count:168
//        Computation count:277
//        *With* caching
//        Computation count:1
//        Computation count:2
//        Computation count:3
//        Computation count:4
//        Computation count:5
//        Computation count:6
//        Computation count:7
//        Computation count:8
//        Computation count:9
//        Computation count:10
    }

    @Test
    public void testFactorial() {
        Function<Long, Long> factorial = target.factorial();
        Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.apply(-1L));
        Assertions.assertEquals(2L, factorial.apply(2L));
        Assertions.assertEquals(6L, factorial.apply(3L));
        Assertions.assertEquals(24L, factorial.apply(4L));

        Assertions.assertEquals(2L, factorial.apply(2L));
        Assertions.assertEquals(6L, factorial.apply(3L));
        Assertions.assertEquals(24L, factorial.apply(4L));
    }
}
