package concurrent.thread.lock.reentrantReadWriteLock;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-31 下午5:48
 **/
public class Main {
    public static void main(String[] args) {
        new Thread(new MyThreadA()).start();
        new Thread(new MyThreadA()).start();
    }
}
