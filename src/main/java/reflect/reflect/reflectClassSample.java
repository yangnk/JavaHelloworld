package reflect.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class reflectClassSample {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Student student = new Student();
        //1. 通过对象的getClass()方法。
        Class<? extends Student> clazz = student.getClass();
        //2. 通过类的class成员变量。
        Class<Student> clazz1 = Student.class;
        //3. 通过Class类的forName()方法。
        Class<?> clazz2 = Class.forName("reflect.reflect.Student");


        //调用方法：clazz.newInstance()
        Student student1 = clazz.newInstance();

        //获取构造器后调用方法：constructor.newInstance()
        Constructor<? extends Student> constructor = clazz.getConstructor();
        Student student2 = constructor.newInstance();

        //获取属性
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        //获取方法
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            Class<?>[] types = method.getParameterTypes();
            if (types != null && types.length > 0) {
                System.out.println(types[0].getName());
            }
        }

        //获取注解
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType().getSimpleName());
        }
    }
}
