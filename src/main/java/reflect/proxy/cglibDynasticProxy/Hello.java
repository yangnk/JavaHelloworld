package reflect.proxy.cglibDynasticProxy;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-18 上午9:47
 **/
public class Hello {
    String sayHello(String s) {
        System.out.println("hello " + s);
        return "hello " + s;
    }
}
