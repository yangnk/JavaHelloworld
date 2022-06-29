package reflect.Proxy.staticProxy;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午9:41
 **/
public class HelloImpl implements Hello{

    @Override
    public String sayHello(String s) {
        String s1 = "hello " + s;
        return s1;
    }
}
