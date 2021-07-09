import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

    private Stack stack = new Stack();

    @Test
    public void test() {
        Assertions.assertNull(stack.pop());
        Assertions.assertNull(stack.peek());
        Assertions.assertEquals(0, stack.getSize());

        stack.push("a"); // a

        Assertions.assertEquals(1, stack.getSize());
        Assertions.assertEquals("a", stack.peek());
        Assertions.assertEquals("a", stack.pop()); // empty
        Assertions.assertEquals(0, stack.getSize());

        stack.push("b"); // b
        Assertions.assertEquals(1, stack.getSize());
        stack.push("c"); // c b
        Assertions.assertEquals(2, stack.getSize());
        stack.push("d"); // d c b
        Assertions.assertEquals(3, stack.getSize());
        Assertions.assertEquals("d", stack.peek());
        Assertions.assertEquals("d", stack.pop()); // c b
        Assertions.assertEquals(2, stack.getSize());

        Assertions.assertEquals("c", stack.peek());
        Assertions.assertEquals("c", stack.pop()); // b
        Assertions.assertEquals(1, stack.getSize());

        Assertions.assertEquals("b", stack.peek());
        Assertions.assertEquals("b", stack.pop()); // empty
        Assertions.assertEquals(0, stack.getSize());

        Assertions.assertNull(stack.pop());
        Assertions.assertNull(stack.peek());
        Assertions.assertEquals(0, stack.getSize());

        stack.push("a"); // a
        Assertions.assertEquals(1, stack.getSize());
        Assertions.assertEquals("a", stack.peek());
        Assertions.assertEquals("a", stack.pop()); // empty
        Assertions.assertEquals(0, stack.getSize());

        Assertions.assertNull(stack.pop());
        Assertions.assertNull(stack.peek());
        Assertions.assertEquals(0, stack.getSize());
    }
}
