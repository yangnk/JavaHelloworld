/**
 * Created by yangningkai on 2019/3/12.
 */

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Method;
import java.time.LocalDate;

/**
 * @Description:
 * @Author: yangningkai
 * @CreateDate: 2019/3/12 20:21
 * @Version:
 */
public class tst {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
//        printTable1(testMethod, 1);
        Class cls = tst.class;
        try {
            Method addMethod = cls.getMethod("testMethod", new Class[]{String.class});
            addMethod.invoke(null, "tst");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void testMethod(String s) {
        System.out.println(s);

    }
}
