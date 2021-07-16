package sorting;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] input) {
        if (null != input && input.length > 1) {
            int[] arrayCopy = Arrays.copyOf(input, input.length);
            // 4, 3, 10, 1, 6
            // 4 < 3
            // 3, 4, 10, 1, 6
            // 4 < 10
            // 3 < 10
            // 3, 4, 10, 1, 6
            // 10 < 1
            // 3, 4, 1, 10, 6
            // 4 < 1
            // 3, 1, 4, 10, 6
            // 3 < 1
            // 1, 3, 4, 10, 6
            for (int i = 1; i < arrayCopy.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (arrayCopy[j] < arrayCopy[j - 1]) {
                        int temp = arrayCopy[j];
                        arrayCopy[j] = arrayCopy[j - 1];
                        arrayCopy[j - 1] = temp;
                    }
                }
            }

            System.out.printf("\n[%s]", Arrays.toString(arrayCopy));
            return arrayCopy;
        } else {
            return input;
        }
    }

}
