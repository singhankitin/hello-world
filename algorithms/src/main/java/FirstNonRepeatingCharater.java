import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharater {

    public int find(final String input) {
        if (input == null || input.isEmpty()) {
          return -1;
        } else {
            char[] inputArray = input.toCharArray();
            final Map<Character, Something> visits = new HashMap<>();
            for (int i = 0; i < inputArray.length; i++) {
                char charAtIndex = inputArray[i];
                Something something = visits.get(charAtIndex);
                if (something == null) {
                    Something value = new Something(1, i);
                    visits.put(charAtIndex, value);
                } else {
                    something.setCount(++something.count);
                    something.setIndex(i);
                }
            }
            return visits.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue().count == 1)
                    .map(entry -> entry.getValue().index)
                    .findFirst()
                    .orElse(-1);
        }
    }

    private class Something {
        private int count;
        private int index;

        public Something(int count, int index) {
            this.count = count;
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        @Override
        public String toString() {
            return "Something{" +
                    "count=" + count +
                    ", index=" + index +
                    '}';
        }
    }
}
