import java.util.*;
import java.util.stream.Collectors;

public class DepthFirstSearchOnGraph {

    public static void main(String[] args) {
        int[][] courses = new int[3][];
        courses[0] = new int[]{1,0};
        courses[1] = new int[]{2,0};
        courses[2] = new int[]{3,1,2};
        depthFirstSearch(4, courses);
    }

    public static void depthFirstSearch(int numCourses, int[][] courses) {
        Map<Integer, Set<Integer>> courseList = new HashMap<>(numCourses);

        for (int i = 0; i < numCourses; i++) {
            courseList.put(i, new HashSet<>());
        }
        for (int i = 0; i < courses.length; i++) {
            int courseIndex = Arrays.stream(courses[i]).findFirst().getAsInt();
            Set<Integer> prerequisiteForCourse = Arrays.stream(courses[i]).skip(1).boxed().collect(Collectors.toSet());
            courseList.merge(courseIndex, prerequisiteForCourse, (integers, integers2) -> {
                integers.addAll(prerequisiteForCourse);
                return integers;
            });
        }
        System.out.println(courseList);

        boolean[] visited = new boolean[numCourses];
        DFSUtil(0, visited, courseList);
    }

    // A function used by DFS
    static void DFSUtil(int v, boolean visited[], Map<Integer, Set<Integer>> courseList)
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.println(v + " ");

        // Recur for all the vertices adjacent to this
        // vertex
        // Iterator<Integer> i = adj[v].listIterator();
        Iterator<Integer> i = courseList.get(v).iterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited, courseList);
        }
    }

}
