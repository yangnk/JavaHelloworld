package collection;

import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ${测试hashmap和concurrenthashmap效率}
 *
 * @author yangningkai
 * @create 2018-11-14 下午10:30
 **/
public class MapCompare implements Serializable {
    private static final long serialVersionUID = -1295439174686966166L;

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap();
        HashMap<String, String> hashMap = new HashMap<>();

        //concurrenthashmap耗时
        Long before = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            concurrentHashMap.put(String.valueOf(i), "test");
        }
        Long after = System.currentTimeMillis();
        System.out.println("concurrenthashmap耗时：" + (after - before));

        //hashmap耗时
        Long before1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            hashMap.put(String.valueOf(i), "test");
        }
        Long after1 = System.currentTimeMillis();
        System.out.println("hashmap耗时：" + (after1 - before1));
    }
}
