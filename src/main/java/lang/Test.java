package lang;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-01-30 下午1:16
 **/
interface Demos<T>{
    public T fun();
}
public class Test {
    public static void main(String[] args) {
        Demos<String> demo = "Hello World!"::toUpperCase;
        System.out.println(demo.fun());
    }
}

