package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache4 {
    final int cacheSize = 5;
    LinkedHashMap<Integer, String> lru = new LinkedHashMap<Integer, String>() {
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
            return size() > cacheSize;
        }
    };
}
