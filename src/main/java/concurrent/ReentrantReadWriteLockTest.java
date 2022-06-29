package concurrent;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-24 11:57
 **/
public class ReentrantReadWriteLockTest {
    ReadWriteLock rwlock = new ReentrantReadWriteLock();
    Lock rlock = rwlock.readLock();
    Lock wlock = rwlock.writeLock();
    int[] counts = new int[10];

    //写锁
    public void incr(int index) {
        wlock.lock();
        try {
            counts[index]++;
        } finally {
            wlock.unlock();
        }
    }

    //读锁
    public int[] get() {
        rlock.lock();
        try {
            return Arrays.copyOf(counts, counts.length);
        } finally {
            rlock.unlock();
        }
    }
}
