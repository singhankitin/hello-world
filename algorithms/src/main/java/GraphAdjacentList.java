import java.util.*;

public class GraphAdjacentList {

    private int length;
    private Map<Integer, Set<Integer>> adjacencyList;

    public GraphAdjacentList() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertexIndex) {
        if (adjacencyList.containsKey(vertexIndex)) {
            throw new IllegalArgumentException("vertex already exists");
        } else {
            adjacencyList.put(vertexIndex, new HashSet<>());
            length++;
        }
    }

    public void addEdge(int node1Index, int node2Index) {
        if (adjacencyList.containsKey(node1Index) && adjacencyList.containsKey(node2Index)) {
            adjacencyList.merge(node1Index, Set.of(node2Index), (oldValue, newValue) -> {
                oldValue.addAll(newValue);
                return oldValue;
            });
            adjacencyList.merge(node2Index, Set.of(node1Index), (oldValue, newValue) -> {
                oldValue.addAll(newValue);
                return oldValue;
            });
        } else {
            throw new IllegalArgumentException("Vertices haven't been added yet");
        }
    }

    public Set<Integer> getEdge(int vertexIndex) {
        return adjacencyList.get(vertexIndex);
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "GraphAdjacentList{" +
                "length=" + length +
                ", adjacencyList=" + adjacencyList +
                '}';
    }
}

