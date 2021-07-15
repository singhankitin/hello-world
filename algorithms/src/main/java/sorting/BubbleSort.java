package sorting;

import java.util.Arrays;

public class BubbleSort {

    int[] sort(int[] input) {
        int[] sortedArray = input;
        if (input != null && input.length > 1) {
            sortedArray = Arrays.copyOf(input, input.length);
            int end = input.length;
            while (true) { // keep iterating till we are swapping elements
                boolean elementSwapped = false;
                for (int i = 0; i < end - 1; i++) {
                    if (sortedArray[i] > sortedArray[i + 1]) {
                        int temp = sortedArray[i + 1];
                        sortedArray[i + 1] = sortedArray[i];
                        sortedArray[i] = temp;
                        elementSwapped = true;
                    }
                }
                if (!elementSwapped) {
                    break;
                }
                end--;
            }
        }
        return sortedArray;
    }
}
