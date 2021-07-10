import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {

    private Queue queue = new Queue();

    @Test
    public void test() {
        assertEmpty();

        queue.enqueue("a"); // a
        Assertions.assertEquals(1, queue.getLength());
        Assertions.assertEquals("a", queue.peek());
        Assertions.assertEquals("a", queue.dequeue()); // Empty
        assertEmpty();

        queue.enqueue("a"); // a
        queue.enqueue("b"); // b a
        Assertions.assertEquals(2, queue.getLength());
        Assertions.assertEquals("a", queue.peek());
        Assertions.assertEquals("a", queue.dequeue()); // b
        Assertions.assertEquals("b", queue.dequeue()); // Empty
        assertEmpty();

        queue.enqueue("a"); // a
        queue.enqueue("b"); // b a
        queue.enqueue("c"); // c b a
        queue.enqueue("d"); // d c b a

        Assertions.assertEquals(4, queue.getLength());
        Assertions.assertEquals("a", queue.peek());
        Assertions.assertEquals("a", queue.dequeue()); // d c b

        Assertions.assertEquals(3, queue.getLength());
        Assertions.assertEquals("b", queue.peek());
        Assertions.assertEquals("b", queue.dequeue()); // d c

        Assertions.assertEquals(2, queue.getLength());
        Assertions.assertEquals("c", queue.peek());
        Assertions.assertEquals("c", queue.dequeue()); // d

        Assertions.assertEquals(1, queue.getLength());
        Assertions.assertEquals("d", queue.peek());
        Assertions.assertEquals("d", queue.dequeue()); // Empty

        assertEmpty();
    }

    private void assertEmpty() {
        Assertions.assertEquals(0, queue.getLength());
        Assertions.assertNull(queue.peek());
        Assertions.assertNull(queue.dequeue());
    }
}
