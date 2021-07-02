public class FindPairWithSum {

    boolean findPairWithSum(int[] array, int sum) {
        boolean retVal = false;
        // - brute force - O(N*N)
        retVal = nestedLoop(array, sum);
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
