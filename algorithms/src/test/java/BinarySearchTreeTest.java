import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

        //          100
        //     95           110
        //  94     96   109      111

        // BFS using queue
        Assertions.assertArrayEquals(new Integer[]{100, 95, 110, 94, 96, 109, 111}, target.BFS());

        // BFS using recursion
        List<Integer> retVal = new ArrayList<>(target.getLength());
        target.BFSRecursive(new LinkedList<>(List.of(target.getRoot())), retVal);
        Assertions.assertArrayEquals(new Integer[]{100, 95, 110, 94, 96, 109, 111}, retVal.toArray(Integer[]::new));

        //          100
        //     95           110
        //  94     96   109      111

        // DFS - In-Order: Left - Root - Right
        Queue<Integer> dfsInOrder = new LinkedList<>();
        target.DFSInOrder(target.getRoot(), dfsInOrder);
        System.out.printf("\n[%s]", dfsInOrder);
        Assertions.assertArrayEquals(new Integer[]{94, 95, 96, 100, 109, 110, 111}, dfsInOrder.toArray(Integer[]::new));

        // DFS - Pre-Order: Root - Left - Right
        Queue<Integer> dfsPreOrder = new LinkedList<>();
        target.DFSPreOrder(target.getRoot(), dfsPreOrder);
        System.out.printf("\n[%s]", dfsPreOrder);
        Assertions.assertArrayEquals(new Integer[]{100, 95, 94, 96, 110, 109, 111}, dfsPreOrder.toArray(Integer[]::new));

        // DFS - Post-Order: Left - Right - Root
        Queue<Integer> dfsPostOrder = new LinkedList<>();
        target.DFSPostOrder(target.getRoot(), dfsPostOrder);
        System.out.printf("\n[%s]", dfsPreOrder);
        Assertions.assertArrayEquals(new Integer[]{94, 96, 95, 109, 111, 110, 100}, dfsPostOrder.toArray(Integer[]::new));
    }

}
