import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyHashTable<K, V> {

    private final List<List<Entry>> entries;
    private final int bucketSize;

    public MyHashTable(int numberOfBuckets) {
        entries = new ArrayList<>(numberOfBuckets);
        for (int i = 0; i < numberOfBuckets; i++) {
            entries.add(new ArrayList<>());
        }
        bucketSize = numberOfBuckets;
    }

    private int hash(K key) {
        return key.hashCode() % bucketSize;
    }

    public void put(K key, V value) {
        Objects.nonNull(key);
        Objects.nonNull(value);
        int location = hash(key);
        List<Entry> entries = this.entries.get(location);
        entries.add(new Entry(key, value));
    }

    public V get(K key) {
        V retVal = null;
        if (null != key) {
            int hash = hash(key);
            if (!this.entries.isEmpty()) {
                List<Entry> entries = this.entries.get(hash);
                if (!entries.isEmpty()) {
                    for (Entry entry : entries) {
                        if (entry.getKey().equals(key)) {
                            retVal = entry.getValue();
                        }
                    }
                }
            }
        }
        return retVal;
    }

    public List<K> keys() {
        List<K> retVal = new ArrayList<>();
        for (List<Entry> bucket : this.entries) {
            if (bucket != null && !bucket.isEmpty()) {
                for (Entry entry : bucket) {
                    retVal.add(entry.getKey());
                }
            }
        }
        return retVal;
    }

    public void clear() {
        this.entries.clear();
    }

    public String toString() {
        StringBuilder retVal = new StringBuilder();
        for (List<Entry> bucket : this.entries) {
            if (bucket != null && !bucket.isEmpty()) {
                for (Entry entry : bucket) {
                    retVal.append(String.format("[%s %s]", entry.getKey(), entry.getValue()));
                }
            }
        }
        return retVal.toString();
    }

    private class Entry {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public String toString() {
            return String.format("%s %s", key, value);
        }
    }
}
