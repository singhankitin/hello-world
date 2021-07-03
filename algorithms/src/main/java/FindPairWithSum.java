import java.util.HashSet;
import java.util.Set;

public class FindPairWithSum {

    boolean findPairWithSum(int[] array, int sum) {
        boolean retVal;

        // - brute force - O(N*N)
        // retVal = nestedLoop(array, sum);

        // - using set of complement values
        retVal = usingASetOfComplementValues(array, sum);

        // - traversing the array in from both directions at the same time
        // -
        return retVal;
    }

    boolean usingASetOfComplementValues(int[] array, int sum) {
        boolean retVal = false;
        if (null != array && array.length > 1) {
            Set<Integer> setOfValues = new HashSet<>(); // set of values we have see so far
            for (int item : array) {
                int complementForItem;
                if (item < 0) {
                    complementForItem = sum + item;
                } else {
                    complementForItem = sum - item;
                }
                if (setOfValues.contains(complementForItem)) {
                    retVal = true;
                    break;
                }
                setOfValues.add(item); // add the complement of the current item after the check
            }
        }
        return retVal;
    }

    boolean nestedLoop(int[] array, int sum) {
        boolean retVal = false;
        if (array != null && array.length > 1) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 1; j < array.length; j++) {
                    //System.out.println(String.format("i:%s, j:%s", i, j));
                    if (array[i] + array[j] == sum) {
                        retVal = true;
                        break;
                    }
                }
            }
        }
        return retVal;
    }

}
