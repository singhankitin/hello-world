package dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class MemoizerTest {

    private Memoizer target = new Memoizer();

    @Test
    public void test() {
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
