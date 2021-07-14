import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    private Factorial factorial = new Factorial();
    @Test
    public void test() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.iterative(-1));
        Assertions.assertEquals(1, factorial.iterative(0));
        Assertions.assertEquals(1, factorial.iterative(1));
        Assertions.assertEquals(2, factorial.iterative(2));
        Assertions.assertEquals(6, factorial.iterative(3));
        Assertions.assertEquals(24, factorial.iterative(4));
        Assertions.assertEquals(120, factorial.iterative(5));

        Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.recursive(-1));
        Assertions.assertEquals(1, factorial.iterative(0));
        Assertions.assertEquals(1, factorial.recursive(1));
        Assertions.assertEquals(2, factorial.recursive(2));
        Assertions.assertEquals(6, factorial.recursive(3));
        Assertions.assertEquals(24, factorial.recursive(4));
        Assertions.assertEquals(120, factorial.recursive(5));
    }
}
