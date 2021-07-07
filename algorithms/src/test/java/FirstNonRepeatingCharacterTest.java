import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstNonRepeatingCharacterTest {

    final FirstNonRepeatingCharater target = new FirstNonRepeatingCharater();

    @Test
    public void testNegative() {
        Assertions.assertEquals(-1, target.find(null));
        Assertions.assertEquals(-1, target.find(""));
        Assertions.assertEquals(-1, target.find(" "));
    }

    @Test
    public void testPositive() {
        Assertions.assertEquals(4, target.find("AABBC"));
        Assertions.assertEquals(0, target.find("CAABB"));
        Assertions.assertEquals(-1, target.find("AABB"));
        Assertions.assertEquals(2, target.find("AACBB"));
    }

}
