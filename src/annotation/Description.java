package annotation;

import java.lang.annotation.*;

/**
 * Created by yangnk23900 on 2018/11/23.
 */

@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Description {
	String desc();
	String author();
	int age() default 18;
}
