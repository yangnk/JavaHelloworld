package annotation;

import java.lang.reflect.Method;

/**
 * Created by yangnk23900 on 2018/11/23.
 */
public class TestAnnotation {
	public static void main(String[] args) {
		try {
			Class aClass = Class.forName("annotation.Child");
//			//test
//			Method[] methods = aClass.getMethods();
//			for (Method m   ethod : methods) {
//				System.out.println(method.getName());
//			}
			//获取类上的注解
			if (aClass.isAnnotationPresent(Description.class)) {
				Description description = (Description) aClass.getAnnotation(Description.class);
				System.out.println(description.desc());
			}
			//获取方法上的注解
			Method[] methodArr = aClass.getMethods();
			for (Method method1: methodArr) {
				if (method1.isAnnotationPresent(Description.class)) {
					Description methodDescription = (Description) method1.getAnnotation(Description.class);
					System.out.println("desc is :" +methodDescription.desc()+"\nauthor is :" +methodDescription.author()
							+"\nage is :" +methodDescription.age());
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
