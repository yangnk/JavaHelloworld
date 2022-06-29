package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-13 下午9:38
 **/
public class MapSample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("1", "beijing");
        map.put("2", "shanghai");
        map.put("3", "guangzhou");
        map.put("4", "shenzhen");
        Set set = map.entrySet();
        Set<String> set1 = map.keySet();
        Collection<String> set2 = map.values();
    }
}
