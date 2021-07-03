import java.util.HashSet;
import java.util.Set;

public class FirstRecurringCharacter {

    public int findFirstRecurringCharacter(int[] items) {
        int retVal = -1;
        if (null != items && items.length > 1) {
            // couple of nested loops - O(N^2) O(1)
            // the above approach will not detect the *first* recurring character
            // what would have to do to make the above approach behaves the same as the one below?
            retVal = iterateAndUseMap(items); // O(N) O(N)
        }
        return retVal;
    }

    private int iterateAndUseMap(int[] items) {
        Set<Integer> visited = new HashSet<>();
        int retVal = -1;
        for (int i : items) {
            if (visited.contains(i)) {
                retVal = i;
                break;
            } else {
                visited.add(i);
            }
        }
        return retVal;
    }
}
