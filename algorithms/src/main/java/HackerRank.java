import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HackerRank {

    public static void main(String[] args) {
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int retVal = 0;
        if (n > 0 && ar != null && ar.size() > 0) {
            Map<Integer, Integer> stats = new HashMap<>();
            for (Integer item : ar) {
                Integer occurrencesOfItem = stats.get(item);
                if (null == occurrencesOfItem) {
                    stats.put(item, 1);
                } else {
                    stats.put(item, ++occurrencesOfItem);
                }
            }
            System.out.println(stats);
            for (Map.Entry<Integer, Integer> integerIntegerEntry : stats.entrySet()) {
                Integer count = integerIntegerEntry.getValue();
                retVal = retVal + count / 2;
            }
        }
        return retVal;
    }


}
