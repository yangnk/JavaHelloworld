package reflect.Proxy.cglibDynasticProxy;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-18 上午9:59
 **/
public class CglibMain {
    public static void main(String[] args) {
        Hello hello = new Hello();
        HelloInteceptor helloInteceptor = new HelloInteceptor();
        Hello hello1 = (Hello)helloInteceptor.getInstance(hello);
        hello1.sayHello("yangyang1");
    }
}
