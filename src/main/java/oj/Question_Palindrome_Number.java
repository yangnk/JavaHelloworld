package oj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author: yangningkai
 * @CreateDate: 2019/3/29 9:07
 * @Version:
 */
public class Question_Palindrome_Number {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
    public static boolean isPalindrome(int x) {
        int len = String.valueOf(x).length();
        int flag = len/2 + 1;
        String[] strings = String.valueOf(x).split("");
        for (int i = len; i >= flag; i--) {
            if (strings[i - 1].equals(strings[len - i])) {
                continue;
            }
            return false;
        }
        return true;


//        if (x < 0) {
//            return false;
//        }
//        String s = String.valueOf(x);
//        String[] strings = s.split("");
//        List<String> stringList = Arrays.asList(strings);
//        Collections.reverse(stringList);
//        String s1 = String.join("", stringList);
//        int i = 0;
//        try {
//            i = Integer.valueOf(s1);
//        } catch (NumberFormatException e) {
//            return false;
//        }
//        return i == x;
    }

}
