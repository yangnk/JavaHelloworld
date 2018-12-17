package concurrent.ThreadLocalDemo;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 上午9:24
 **/
public class MyThreadLocal extends ThreadLocal {
    ThreadLocal<String> threadLocal = new ThreadLocal();

    @Override
    protected Object initialValue() {
        return "这是我的默认值";
    }
}
