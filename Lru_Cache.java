import java.util.LinkedHashMap;

public class LRUCache {
    private LinkedHashMap<Integer, Integer> hm;
    private int CAP;
    public LRUCache(int capacity) {
        CAP = capacity;
        hm = new LinkedHashMap<Integer, Integer>(capacity, 1.0f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > CAP;
            }
        };
    }

    public int get(int key) {
        return hm.getOrDefault(key, -1);
    }

    public void set(int key, int value) {
        hm.put(key, value);
    }
}
