package collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-09 下午4:33
 **/
public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "beijing");
        hashMap.put("2", "shanghai");
        hashMap.put("3", "guangzhou");
        hashMap.put("4", "shenzhen");
        Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("key: "+entry.getKey()+", value: "+entry.getValue());
        }
    }
}
