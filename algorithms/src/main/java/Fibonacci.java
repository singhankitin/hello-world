import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    //  0   1   1   2   3   5   8   13  21  34  55
    public int iterative(int n) {
        if (n > 0) {
            if (n == 1) {
                return 0;
            } else if (n == 2) {
                return 1;
            } else {
                int fibonacciOneBeforePrev = 0;
                int fibonacciPrev = 1;
                int fibonacciNext = -1;
                for (int i = 2; i < n; i++) {
                    fibonacciNext = fibonacciPrev + fibonacciOneBeforePrev;
                    fibonacciOneBeforePrev = fibonacciPrev;
                    fibonacciPrev = fibonacciNext;
                }
                return fibonacciNext;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    //  0   1   1   2   3   5   8   13  21  34  55
    public int recursive(int n) {
        if (n > 0) {
            if (n < 3) {
                return n - 1;
            } else {
                return recursive(n - 1) + recursive(n - 2);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    //  0   1   1   2   3   5   8   13  21  34  55
    public int list(int n) {
        if (n > 0) {
            final List<Integer> linkedList = new ArrayList<>();
            linkedList.add(0);
            linkedList.add(1);
            if (n < 3) {
                return linkedList.get(n - 1);
            } else {
                for (int i = 2; i < n; i++) {
                    linkedList.add(linkedList.get(i - 1) + linkedList.get(i - 2));
                }
                System.out.printf("\nlinkedList:[%s]", linkedList);
                return linkedList.get(linkedList.size() - 1);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

}
