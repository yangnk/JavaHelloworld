package collection;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ${利用LinkedHashMap实现LRU算法}
 *
 * @author yangningkai
 * @create 2018-12-09 下午10:19
 **/
public class LRU<K, V> extends LinkedHashMap<K, V> implements Serializable, Map<K, V> {
    public LRU(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }

    @Override
    protected boolean removeEldestEntry(Entry<K, V> eldest) {
        if (size() > 6) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LRU<String, String> lru = new LRU<String, String>(10, 0.75f, true);
        String s = "qwertyuiop";

        for (int i = 0; i < s.length(); i++) {
            lru.put(s.substring(i, i + 1), String.valueOf(i));
        }
        System.out.println("lru length is：" + lru.size());
        System.out.println("lru is:" + lru.toString());
    }
}
