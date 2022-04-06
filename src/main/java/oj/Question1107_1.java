package oj;/**
 * Created by yangningkai on 2019/3/5.
 */

import java.util.*;

/**
 * @Description:
 * @Author: yangningkai
 * @CreateDate: 2019/3/5 9:05
 * @Version:
 */
public class Question1107_1 {
    public static void main(String[] args) {
        Question1107_1 question1107_1 = new Question1107_1();
        int[] ints = {3,2,3};
        int i = question1107_1.majorityElement(ints);
        System.out.println(i);
    }

    public int majorityElement(int[] nums) {
        //塞值
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (Integer i : nums) {
            if (!integerIntegerMap.containsKey(i)) {
                integerIntegerMap.put(i, 1);
            }else {
                integerIntegerMap.put(i, integerIntegerMap.get(i) + 1);
            }
        }
        //排序
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(integerIntegerMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        return list.get(0).getKey();
    }
}