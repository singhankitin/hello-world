import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ReverseAStringTest {
    ReverseAString target = new ReverseAString();

    @Test
    public void testWithNull() {
        Assertions.assertEquals("", target.reverseByIteratingArray(null));
        Assertions.assertEquals("", target.reverseUsingRecursion(null));
    }

    @Test
    public void testWithEmptyString() {
        Assertions.assertEquals("", target.reverseByIteratingArray(""));
        Assertions.assertEquals("", target.reverseUsingRecursion(""));
    }

    @ParameterizedTest
    @CsvSource({"abc,cba", "a,a", "abcdef, fedcba"})
    public void test(String input, String expected) {
        Assertions.assertEquals(expected, target.reverseByIteratingArray(input));
        Assertions.assertEquals(expected, target.reverseUsingRecursion(input));
    }


}
