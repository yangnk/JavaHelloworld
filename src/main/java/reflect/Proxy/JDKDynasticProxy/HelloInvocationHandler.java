package reflect.Proxy.JDKDynasticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午10:00
 **/
public class HelloInvocationHandler implements InvocationHandler{
    Hello object = null;

    public HelloInvocationHandler(Hello object) {
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("preOperation...");
        String s = (String)method.invoke(object, args);
        System.out.println("postOperation...");
        return s;
    }
}
