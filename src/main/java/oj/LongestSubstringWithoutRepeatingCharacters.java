package oj;/**
 * Created by yangningkai on 2019/4/16.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: yangningkai
 * @CreateDate: 2019/4/16 9:01
 * @Version:
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
    }

    public int lengthOfLongestSubstring(String s) {
        int sum = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (map.containsKey(str[i])) {
                max = Math.max(max, sum);
                sum = Math.min(i - map.get(str[i]), sum + 1);
                map.put(str[i], i);
            } else {
                sum++;
                map.put(str[i], i);
            }
        }
        return Math.max(sum, max);
    }
}
