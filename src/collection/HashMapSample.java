package collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-14 下午10:30
 **/
public class HashMapSample implements Serializable{
//    private static final long serialVersionUID = -1295439174686966166L;
//    private static final long serialVersionUID = -1295439174686966166L;


    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("1", "beijing");
        String s = concurrentHashMap.get("1");
        System.out.println(s);
        Long before = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
//            concurrentHashMap(i, "test");
//            Integer a = i;
//            String s1 = String.valueOf(i);
            concurrentHashMap.put(String.valueOf(i), "test");
        }
        Long after = System.currentTimeMillis();
        System.out.println("耗时："+ (after - before));
//        System.out.println(System.nanoTime());
//        ArrayList
//        HashMap
    }
}
