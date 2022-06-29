package reflect.Proxy.JDKDynasticProxy;

import java.lang.reflect.Proxy;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午10:03
 **/
public class HelloDynasticProxyMain {
    public static void main(String[] args) {
        Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class<?>[]{Hello.class},
                new HelloInvocationHandler(new HelloImpl()));
        String s = hello.sayHello("yangyang");
        System.out.println(s);
    }
}
