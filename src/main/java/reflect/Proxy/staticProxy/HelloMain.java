package reflect.Proxy.staticProxy;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 下午9:45
 **/
public class HelloMain {
    public static void main(String[] args) {
        Hello hello = new HelloStaticProxy();
        String s = hello.sayHello("yangyang");
        System.out.println(s);
    }
}
