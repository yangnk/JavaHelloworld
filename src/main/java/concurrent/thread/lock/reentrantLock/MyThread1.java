package concurrent.thread.lock.reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-31 下午5:14
 **/
public class MyThread1 implements Runnable {
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        lock.unlock();
    }
}
