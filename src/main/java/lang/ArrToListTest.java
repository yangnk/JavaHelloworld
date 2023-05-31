package lang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrToListTest {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        Integer[] integersArr = new Integer[]{1, 2, 3};
        String[] stringsArr = new String[]{"aa", "bb", "cc"};

        //方法1：使用Collections.addAll()方法，可以执行新增add方法，只针对引用对象，效率较高，【推荐用法】
        List<Integer> list = new ArrayList<>(integersArr.length);
        Collections.addAll(list, integersArr);
        list.add(22);
        System.out.println("list = " + list);

        List<String> list01 = new ArrayList<>(stringsArr.length);
        Collections.addAll(list01, stringsArr);
        list01.add("dd");
        System.out.println("list01 = " + list01);

        //方法2：new ArrayList<>(Arrays.asList(integersArr)) ， 可以执行新增add方法，只针对引用对象
        List<Integer> list1 = new ArrayList<>(Arrays.asList(integersArr));
        list1.add(11);
        System.out.println("list1 = " + list1);

        //方法3：Arrays.stream(arr).boxed() 方法，使用Stream方法
        List<Integer> list2 = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println("list2 = " + list2);

        List<Integer> list21 = Arrays.stream(integersArr).collect(Collectors.toList());
        System.out.println("list21 = " + list21);
    }
}
