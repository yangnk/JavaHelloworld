package thread;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-11 下午6:18
 **/
public class LockSample implements Runnable{
    @Override
    public void run() {
        int i;
        Lock lock = new ReentrantLock();
//        lock.lock();
//        synchronized (this) {
            for (i = 0; i <= 10; i++) {
                System.out.printf("thread %s is print: %s.\n", Thread.currentThread().getName(), i);
            }
//        lock.unlock();
//        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new LockSample());
        Thread thread1 = new Thread(new LockSample());

        thread.run();
        thread1.run();
    }
}
