import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MyHashTableTest {

    private MyHashTable<String, String> myHashTable;

    @Test
    public void test() {
        myHashTable = new MyHashTable<>(10);

        myHashTable.put("K1", "V1");
        System.out.printf("[%s] \n", myHashTable);
        Assertions.assertEquals("V1", myHashTable.get("K1"));
        Assertions.assertEquals(List.of("K1"), myHashTable.keys());

        myHashTable.put("K2", "V2");
        System.out.printf("[%s] \n", myHashTable);
        Assertions.assertEquals("V1", myHashTable.get("K1"));
        Assertions.assertEquals("V2", myHashTable.get("K2"));
        Assertions.assertEquals(List.of("K1", "K2"), myHashTable.keys());


        myHashTable.clear();
        System.out.printf("[%s] \n", myHashTable);

        Assertions.assertNull(myHashTable.get("K1"));
        Assertions.assertNull(myHashTable.get("K2"));
    }
}
