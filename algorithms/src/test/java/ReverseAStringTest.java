import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ReverseAStringTest {
    ReverseAString target = new ReverseAString();
    @Test
    public void testWithNull() {
        Assertions.assertEquals("", target.reverseAString(null));
    }
    @Test
    public void testWithEmptyString() {
        Assertions.assertEquals("", target.reverseAString(""));
    }
    @ParameterizedTest
    @CsvSource({"abc,cba", "a,a"})
    public void testWithEmpty(String input, String expected) {
        Assertions.assertEquals(expected, target.reverseAString(input));
    }


}
