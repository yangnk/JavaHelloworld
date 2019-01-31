package lang;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-01-30 下午12:59
 **/
public class LambdaSample {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello world !")).start();
    }
}
