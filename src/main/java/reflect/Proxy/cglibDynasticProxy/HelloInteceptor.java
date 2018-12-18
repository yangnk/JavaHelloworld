package reflect.Proxy.cglibDynasticProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-18 上午9:48
 **/
public class HelloInteceptor implements MethodInterceptor {
    Object object = null;

    public Object getInstance(Object object) {
        this.object = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.object.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("preOperating...");
        method.invoke(object, args);
        System.out.println("postOperating...");
        return null;
    }
}
