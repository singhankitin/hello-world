package sorting;

import java.util.Arrays;

public class SelectionSort {

    public int[] sort(int[] input) {
        if (null != input && input.length > 1) {
            int[] sortedArray = Arrays.copyOf(input, input.length);
            int start = 0;
            for (int i = start; i < sortedArray.length; i++) {
                int smallestIndex = start;
                int temp = sortedArray[i];
                for (int j = start + 1; j < sortedArray.length; j++) {
                    if (sortedArray[j] < sortedArray[smallestIndex]) {
                        smallestIndex = j;
                    }
                }
                sortedArray[i] = sortedArray[smallestIndex];
                sortedArray[smallestIndex] = temp;
                start++;
            }
            System.out.printf("\n[%s]", Arrays.toString(sortedArray));
            return sortedArray;
        } else {
            return input;
        }
    }

}
