package reflect.reflect;

import sun.text.resources.FormatData;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-15 下午9:37
 **/
public class reflectSample {
    public static void main(String[] args) {
        try {
            Date date = new Date();
            Class aClass = Class.forName("java.util.Date");
            System.out.println(aClass.toString());
            Constructor[] constructors = aClass.getConstructors();
            Method[] methods = aClass.getDeclaredMethods();
//            for (Constructor constructors1: constructors) {
//                System.out.println(constructors1.toString());
//
//            }
//            for (Method method: methods) {
//                System.out.println(method.toString());
//            }
//            System.out.println(methods[0].toString());
            Boolean objects = (Boolean) methods[0].invoke(date, System.currentTimeMillis());
//            date.equals("1L");
            System.out.println(objects);
            System.out.println("====对比=====");
//            Date date1 = new Date();
//            Boolean aBoolean = date1.equals(System.currentTimeMillis());
//            System.out.println(aBoolean);

//            Date date2 = new Date(1, 1, 1);
//            System.out.println(date2.toString());
            Date date1 = new Date();
//            FormatData formatData = new FormatData()
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("2018-11-16");
            String s = simpleDateFormat.format(date1);

            Date date2 = simpleDateFormat.parse(s);

            System.out.println(date2.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
