package oj;/**
 * Created by yangningkai on 2019/3/20.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Description:
 * @Author: yangningkai
 * @CreateDate: 2019/3/20 9:31
 * @Version:
 */
public class Roman_to_integer {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String[] strings = s.split("");
        int sum = 0;
        if (map.get(strings[0]) >= map.get(strings[1])) {
            for (int i = 0; i < strings.length; i++) {
                sum += map.get(strings[i]);
            }
        }else {
            int tmp = map.get(strings[0]);
            for (int i = 1; i < strings.length; i++) {
                sum += map.get(strings[i]);
            }
            sum -= tmp;
        }
        System.out.println(sum);
        return sum;
    }


    public static void main(String[] args) {
//        String s = "qwe";
//        String[] strings = s.split("");
//        System.out.println();
        Roman_to_integer roman_to_integer = new Roman_to_integer();
        roman_to_integer.romanToInt("IX");
    }
}
