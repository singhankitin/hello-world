import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {

    private final SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

    @Test
    public void test() {

        singlyLinkedList.add("a"); // a
        Assertions.assertEquals("a", singlyLinkedList.get(1));
        Assertions.assertEquals(1, singlyLinkedList.getLength());

        singlyLinkedList.add("b"); // a b
        Assertions.assertEquals("a", singlyLinkedList.get(1));
        Assertions.assertEquals("b", singlyLinkedList.get(2));
        Assertions.assertEquals(2, singlyLinkedList.getLength());

        singlyLinkedList.insertAfter(2, "c"); // a b c
        Assertions.assertEquals("a", singlyLinkedList.get(1));
        Assertions.assertEquals("b", singlyLinkedList.get(2));
        Assertions.assertEquals("c", singlyLinkedList.get(3));
        Assertions.assertEquals(3, singlyLinkedList.getLength());

        singlyLinkedList.insertAfter(1, "d"); // a d b c
        Assertions.assertEquals("a", singlyLinkedList.get(1));
        Assertions.assertEquals("d", singlyLinkedList.get(2));
        Assertions.assertEquals("b", singlyLinkedList.get(3));
        Assertions.assertEquals("c", singlyLinkedList.get(4));
        Assertions.assertEquals(4, singlyLinkedList.getLength());

        singlyLinkedList.add("e"); // a d b c e
        Assertions.assertEquals("a", singlyLinkedList.get(1));
        Assertions.assertEquals("d", singlyLinkedList.get(2));
        Assertions.assertEquals("b", singlyLinkedList.get(3));
        Assertions.assertEquals("c", singlyLinkedList.get(4));
        Assertions.assertEquals("e", singlyLinkedList.get(5));
        Assertions.assertEquals(5, singlyLinkedList.getLength());

        singlyLinkedList.remove(5); // a d b c
        Assertions.assertEquals("a", singlyLinkedList.get(1));
        Assertions.assertEquals("d", singlyLinkedList.get(2));
        Assertions.assertEquals("b", singlyLinkedList.get(3));
        Assertions.assertEquals("c", singlyLinkedList.get(4));
        Assertions.assertEquals(4, singlyLinkedList.getLength());

        singlyLinkedList.remove(1); // d b c
        Assertions.assertEquals("d", singlyLinkedList.get(1));
        Assertions.assertEquals("b", singlyLinkedList.get(2));
        Assertions.assertEquals("c", singlyLinkedList.get(3));
        Assertions.assertEquals(3, singlyLinkedList.getLength());

        singlyLinkedList.remove(2); // d c
        Assertions.assertEquals("d", singlyLinkedList.get(1));
        Assertions.assertEquals("c", singlyLinkedList.get(2));
        Assertions.assertEquals(2, singlyLinkedList.getLength());

        singlyLinkedList.remove(1); // c
        Assertions.assertEquals("c", singlyLinkedList.get(1));
        Assertions.assertEquals(1, singlyLinkedList.getLength());

        singlyLinkedList.remove(1); // Empty
        Assertions.assertEquals(0, singlyLinkedList.getLength());
        Assertions.assertThrows(IllegalArgumentException.class, () -> singlyLinkedList.remove(0));

        singlyLinkedList.add("x");
        Assertions.assertEquals("x", singlyLinkedList.get(1));
        Assertions.assertEquals(1, singlyLinkedList.getLength());
    }

    @Test
    public void testReverse() {
        singlyLinkedList.add("a"); // a
        Assertions.assertEquals("a", singlyLinkedList.get(1));
        Assertions.assertEquals(1, singlyLinkedList.getLength());

        singlyLinkedList.reverseSimplified(); // a
        Assertions.assertEquals("a", singlyLinkedList.get(1));
        Assertions.assertEquals(1, singlyLinkedList.getLength());

        singlyLinkedList.add("b"); // a b
        Assertions.assertEquals("a", singlyLinkedList.get(1));
        Assertions.assertEquals("b", singlyLinkedList.get(2));
        Assertions.assertEquals(2, singlyLinkedList.getLength());
        singlyLinkedList.reverseSimplified(); // b a
        Assertions.assertEquals("b", singlyLinkedList.get(1));
        Assertions.assertEquals("a", singlyLinkedList.get(2));
        Assertions.assertEquals(2, singlyLinkedList.getLength());
        singlyLinkedList.reverseSimplified(); // a b
        Assertions.assertEquals("a", singlyLinkedList.get(1));
        Assertions.assertEquals("b", singlyLinkedList.get(2));
        Assertions.assertEquals(2, singlyLinkedList.getLength());
        singlyLinkedList.add("c"); // a b c
        Assertions.assertEquals("a", singlyLinkedList.get(1));
        Assertions.assertEquals("b", singlyLinkedList.get(2));
        Assertions.assertEquals("c", singlyLinkedList.get(3));
        Assertions.assertEquals(3, singlyLinkedList.getLength());
        singlyLinkedList.reverseSimplified(); // c b a
        Assertions.assertEquals("c", singlyLinkedList.get(1));
        Assertions.assertEquals("b", singlyLinkedList.get(2));
        Assertions.assertEquals("a", singlyLinkedList.get(3));
        Assertions.assertEquals(3, singlyLinkedList.getLength());
        singlyLinkedList.reverseSimplified(); // a b c
        Assertions.assertEquals("a", singlyLinkedList.get(1));
        Assertions.assertEquals("b", singlyLinkedList.get(2));
        Assertions.assertEquals("c", singlyLinkedList.get(3));
        Assertions.assertEquals(3, singlyLinkedList.getLength());
        singlyLinkedList.add("d"); // a b c d
        Assertions.assertEquals("a", singlyLinkedList.get(1));
        Assertions.assertEquals("b", singlyLinkedList.get(2));
        Assertions.assertEquals("c", singlyLinkedList.get(3));
        Assertions.assertEquals("d", singlyLinkedList.get(4));
        Assertions.assertEquals(4, singlyLinkedList.getLength());
        singlyLinkedList.reverseSimplified(); // d c b a
        Assertions.assertEquals("d", singlyLinkedList.get(1));
        Assertions.assertEquals("c", singlyLinkedList.get(2));
        Assertions.assertEquals("b", singlyLinkedList.get(3));
        Assertions.assertEquals("a", singlyLinkedList.get(4));
        Assertions.assertEquals(4, singlyLinkedList.getLength());
        System.out.println(singlyLinkedList);
    }
}
