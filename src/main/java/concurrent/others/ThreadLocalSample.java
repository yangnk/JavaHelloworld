package concurrent.others;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-16 下午9:47
 **/
public class ThreadLocalSample {
    public static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        if (threadLocal.get() == null) {
            System.out.println("从咩有放过东西");
            threadLocal.set("新的东西");
        }
        System.out.println(threadLocal.get());
    }
}
