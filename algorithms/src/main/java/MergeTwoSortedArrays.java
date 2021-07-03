import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrays {

    public int[] merge(int[] a, int[] b) {
        int[] retVal;
        System.out.printf("IN %s %s%n", Arrays.toString(a), Arrays.toString(b));
        retVal = mergeSimplest(a, b); // O(A*B)
        System.out.printf("OUT %s%n", Arrays.toString(retVal));
        return retVal;
    }

    // 1 2 3
    // 4 5 6
    int[] mergeSimplest(int[] a, int[] b) {
        List<Integer> merged = new ArrayList<>();
        if (a != null & b != null) {
            int aCounter = 0;
            int bCounter = 0;
            for (int i = aCounter; i < a.length; i++) {
                for (int j = bCounter; j < b.length; j++) {
                    if (a[i] <= b[i]) {
                        merged.add(a[i]);
                        System.out.printf("%s <= %s merged:%s%n", a[i], b[j], merged);
                        aCounter++;
                        break;
                    } else {
                        merged.add(b[j]);
                        System.out.printf("%s > %s merged:%s%n", a[i], b[j], merged);
                        bCounter++;
                    }
                }
            }
            for (int i = aCounter; i < a.length; i++) {
                System.out.printf("Adding %s%n", a[i]);
                merged.add(a[i]);
            }
            for (int i = bCounter; i < b.length; i++) {
                System.out.printf("Adding %s%n", b[i]);
                merged.add(b[i]);
            }
        }
        return merged.stream().mapToInt(value -> value).toArray();
    }
}
