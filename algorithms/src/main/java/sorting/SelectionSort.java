package sorting;

import java.util.Arrays;

public class SelectionSort {

    public int[] sort(int[] input) {
        if (null != input && input.length > 1) {
            int[] arrayCopy = Arrays.copyOf(input, input.length);
            for (int i = 0; i < arrayCopy.length; i++) {
                int minElementIndex = i;
                for (int j = i + 1; j < arrayCopy.length; j++) {
                    if (arrayCopy[j] < arrayCopy[minElementIndex]) {
                        minElementIndex = j;
                    }
                }
                int temp = arrayCopy[i];
                arrayCopy[i] = arrayCopy[minElementIndex];
                arrayCopy[minElementIndex] = temp;
            }
            System.out.printf("\n[%s]", Arrays.toString(arrayCopy));
            return arrayCopy;
        } else {
            return input;
        }
    }

}
