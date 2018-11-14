package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-13 下午10:04
 **/
public class TreeSetSample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(0);
        set.add(100);
        set.add(3);
        set.add(-1);
//        for (Integer integer : set) {
//            System.out.println(integer);
//        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
