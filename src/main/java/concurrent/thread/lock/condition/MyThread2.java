package concurrent.thread.lock.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-31 下午5:25
 **/
public class MyThread2 extends Thread {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("进来时间：" + System.currentTimeMillis());
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("出去时间：" + System.currentTimeMillis());
        } finally {
            lock.unlock();
        }
    }

    public void getSignal() {
        try {
            lock.lock();
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
