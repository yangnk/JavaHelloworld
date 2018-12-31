package thread.lock.reentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-31 下午5:12
 **/
public class LockMain {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new MyThread1()).start();
        }
    }
}
