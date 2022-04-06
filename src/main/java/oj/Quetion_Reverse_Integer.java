package oj;
/**
 * Created by yangningkai on 2019/3/27.
 */

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description:
 * @Author: yangningkai
 * @CreateDate: 2019/3/27 9:13
 * @Version:
 */
public class Quetion_Reverse_Integer {
    public static void main(String[] args) {
        System.out.println(reserve(1534236469));
    }
    public static int reserve(int i) {
        String tmp = "";
        if (i >= 0) {
            tmp = String.valueOf(i);
            String[] stringList1 = tmp.split("");
            List<String> stringList = Arrays.asList(stringList1);
            Collections.reverse(stringList);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < stringList.size(); j++) {
                sb.append(stringList.get(j));
            }
            try {
                return Integer.parseInt(sb.toString());
            } catch (NumberFormatException e) {
                return 0;
            }
        }else {
            tmp = String.valueOf(-i);
            String[] stringList1 = tmp.split("");
            List<String> stringList = Arrays.asList(stringList1);
            Collections.reverse(stringList);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < stringList.size(); j++) {
                sb.append(stringList.get(j));
            }
            try {
                return 0 - Integer.parseInt(sb.toString());
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }
}
