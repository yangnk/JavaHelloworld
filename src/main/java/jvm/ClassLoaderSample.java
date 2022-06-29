package jvm;

import com.sun.istack.internal.NotNull;
import sun.misc.Launcher;

import javax.xml.ws.Action;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.net.URL;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-12 下午5:41
 **/
public class ClassLoaderSample {
//    String name = "";
//
//    @NotNull
//    public void print() {
//        System.out.println("i m printing...");
//    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        URL[] uRls = Launcher.getBootstrapClassPath().getURLs();
        for (URL url:uRls) {
            System.out.println(url.toExternalForm());
        }
//        Class<ClassLoaderSample> classLoaderSample1 = ClassLoaderSample.class;
//        Method[] methods = classLoaderSample1.getDeclaredMethods();
//        for (Method method: methods) {
//            Annotation[] annotation = method.getAnnotations();
//            System.out.println(method.getName());
//            System.out.println(annotation.getClass());
//        }

//        ClassLoaderSample classLoaderSample = ClassLoaderSample.class.newInstance();
////        classLoaderSample.print();
////        Field[] s = classLoaderSample.getClass().getDeclaredFields();
////        for (Field field: s) {
////            System.out.println(field.getName());
////        }
////        Method[] methods = classLoaderSample.getClass().getDeclaredMethods();
////        for (Method method: methods) {
////            System.out.println(method.getName());
////            method.invoke(classLoaderSample);
////        }
//        Method method = classLoaderSample.getClass().getMethod("print");
//        method.invoke(classLoaderSample);


//        System.out.println(s);




//        String classLoader = ClassLoader.getSystemClassLoader().toString();
//        String s = ClassLoaderSample.class.getClassLoader().toString();
//        System.out.println(classLoader);
//        System.out.println(s);
    }
}
