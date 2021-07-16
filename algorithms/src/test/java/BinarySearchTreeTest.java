import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {

    private BinarySearchTree target = new BinarySearchTree();

    @Test
    public void test() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> target.insert(null));
        Assertions.assertEquals(0, target.getLength());

        // 100
        target.insert(100);
        Assertions.assertEquals(1, target.getLength());
        Assertions.assertEquals(100, target.lookup(100));

        //    100
        //        110*
        target.insert(110);
        Assertions.assertEquals(2, target.getLength());
        Assertions.assertEquals(100, target.lookup(100));
        Assertions.assertEquals(110, target.lookup(110));

        //      100
        // 95*        110
        target.insert(95);
        Assertions.assertEquals(3, target.getLength());
        Assertions.assertEquals(95, target.lookup(95));
        Assertions.assertEquals(100, target.lookup(100));
        Assertions.assertEquals(110, target.lookup(110));

        //           100
        //     95         110
        //         96*
        target.insert(96);
        Assertions.assertEquals(4, target.getLength());
        Assertions.assertEquals(95, target.lookup(95));
        Assertions.assertEquals(96, target.lookup(96));
        Assertions.assertEquals(100, target.lookup(100));
        Assertions.assertEquals(110, target.lookup(110));

        //          100
        //     95           110
        //  94*     96   109*      111*
        target.insert(94);
        target.insert(109);
        target.insert(111);
        Assertions.assertEquals(7, target.getLength());
        Assertions.assertEquals(94, target.lookup(94));
        Assertions.assertEquals(95, target.lookup(95));
        Assertions.assertEquals(96, target.lookup(96));
        Assertions.assertEquals(100, target.lookup(100));
        Assertions.assertEquals(109, target.lookup(109));
        Assertions.assertEquals(110, target.lookup(110));

        Assertions.assertEquals(null, target.lookup(999));

        Assertions.assertArrayEquals(new Integer[]{100, 95, 110, 94, 96, 109, 111}, target.breadFirstSearch());
    }

}
