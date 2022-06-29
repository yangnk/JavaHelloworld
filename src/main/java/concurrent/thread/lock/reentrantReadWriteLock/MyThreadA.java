package concurrent.thread.lock.reentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-31 下午5:51
 **/
public class MyThreadA implements Runnable {
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    @Override
    public void run() {
        try {
            lock.readLock().lock();
            System.out.println(System.currentTimeMillis());
            System.out.println(Thread.currentThread().getName() + "进入了共享锁");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            lock.readLock().unlock();
        }
    }
}
