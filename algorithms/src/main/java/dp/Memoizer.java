package dp;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Memoizer {

    Function<Long, Long> factorial() {
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