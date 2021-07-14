import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class GraphAdjacentListTest {

    private GraphAdjacentList target = new GraphAdjacentList();

    @Test
    public void test() {
        target.addVertex(1);
        Assertions.assertEquals(1, target.getLength());
        Assertions.assertTrue(target.getEdge(1).isEmpty());

        target.addVertex(2);
        target.addVertex(3);
        target.addVertex(4);
        Assertions.assertEquals(4, target.getLength());
        Assertions.assertTrue(target.getEdge(2).isEmpty());
        Assertions.assertTrue(target.getEdge(3).isEmpty());
        Assertions.assertTrue(target.getEdge(4).isEmpty());

        target.addEdge(1, 2);
        Assertions.assertEquals(Set.of(2), target.getEdge(1));
        Assertions.assertEquals(Set.of(1), target.getEdge(2));
        System.out.println(target);
    }

}
