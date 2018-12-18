package reflect.Proxy.staticProxy;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午9:43
 **/
public class HelloStaticProxy implements Hello{
    Hello hello = new HelloImpl();

    @Override
    public String sayHello(String s) {
        String s1 = hello.sayHello(s);
        return s1 + "\ni'm jack.";
    }
}
