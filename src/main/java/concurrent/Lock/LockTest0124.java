package concurrent.Lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-01-24 14:36
 **/
public class LockTest0124 {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.unlock();
    }


}
