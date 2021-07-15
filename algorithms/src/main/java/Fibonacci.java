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
}
