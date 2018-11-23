package annotation;

import java.lang.reflect.Method;

/**
 * Created by yangnk23900 on 2018/11/23.
 */
public class TestAnnotation {
	public static void main(String[] args) {
		try {
			//获取类上的注解
			Class aClass = Class.forName("annotation.Child");
//			//test
//			Method[] methods = aClass.getMethods();
//			for (Method method : methods) {
//				System.out.println(method.getName());
//			}

			while (aClass.isAnnotationPresent(aClass)) {
				Description description = (Description) aClass.getAnnotation(aClass);
				System.out.println(description.desc());
			}
			//获取方法上的注解
			Method[] methodArr = aClass.getMethods();
			for (Method method1: methodArr) {
				if (method1.isAnnotationPresent(aClass)) {
					Description[] descriptionArr = (Description[]) method1.getAnnotations();
					System.out.println(descriptionArr[0]);
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
