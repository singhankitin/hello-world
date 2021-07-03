import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstRecurringCharacterTest {
    private FirstRecurringCharacter target = new FirstRecurringCharacter();
    @Test
    public void testWithNull() {
        assertEquals(-1, target.findFirstRecurringCharacter(null));
    }
    @Test
    public void testWithEmpty() {
        assertEquals(-1, target.findFirstRecurringCharacter(new int[]{}));
    }
    @Test
    public void test() {
        assertEquals(-1, target.findFirstRecurringCharacter(new int[]{1}));
        assertEquals(1, target.findFirstRecurringCharacter(new int[]{1,1}));
        assertEquals(2, target.findFirstRecurringCharacter(new int[]{1,2,3,4,5,2}));
        assertEquals(2, target.findFirstRecurringCharacter(new int[]{1,2,3,4,5,2,1}));
    }
}
