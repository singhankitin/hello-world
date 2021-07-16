package dp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Memoizer {

    private int computationCount;

    public Function<Long, Long> fibonacci() {
        return new Function<Long, Long>() {
            final Map<Long, Long> cache = new ConcurrentHashMap<>();

            @Override
            public Long apply(Long index) {
                Long factorial = fibonacciRecursive(index, cache);
                System.out.printf("\nComputation count:%s", computationCount);
                return factorial;
            }
        };
    }

    private Long fibonacciRecursive(Long index, Map<Long, Long> cache) {
        if (index > 0) {
            if (index < 3) {
                if (cache.containsKey(index)) {
                    return cache.get(index);
                } else {
                    computationCount++;
                    cache.put(index, index - 1);
                    return index - 1;
                }
            } else {
                if (cache.containsKey(index)) {
                    return cache.get(index);
                } else {
                    computationCount++;
                    long fibonacci = fibonacciRecursive(index - 1L, cache) + fibonacciRecursive(index - 2L, cache);
                    cache.put(index, fibonacci);
                    return fibonacci;
                }
            }
        } else {
            throw new IllegalArgumentException("Index should be greater than zero");
        }
    }

    public Function<Long, Long> factorial() {
        return new Function<Long, Long>() {
            private final ConcurrentHashMap<Long, Long> cache = new ConcurrentHashMap<>();

            @Override
            public Long apply(Long value) {
                System.out.printf("\n[%s]", cache);
                if (cache.containsKey(value)) {
                    System.out.printf("\n Found factorial for [%s] in cache", value);
                    return cache.get(value);
                } else {
                    System.out.printf("\n Computing factorial for [%s]", value);
                    Long factorial = factorial(value);
                    cache.put(value, factorial);
                    return factorial;
                }
            }
        };
    }

    private Long factorial(Long value) {
        if (value < 0) {
            throw new IllegalArgumentException("-ve numbers do not have a factorial");
        } else {
            if (value == 0) {
                return 1L;
            } else {
                return value * factorial(value - 1l);
            }
        }
    }

}