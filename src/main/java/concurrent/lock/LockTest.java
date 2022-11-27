package concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-12-20 20:04
 **/
public class LockTest {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//
//        for (int i = 0; i < 10; i++) {
//            Future submit = executorService.submit(new ThreadTest1220(i));
//        }
        Inc inc = new Inc();
        for (int i = 0; i < 10; i++) {
            new Thread(new ThreadInc(inc)).start();
        }
    }
}

class ThreadInc implements Runnable {
    Inc inc;

    public ThreadInc(Inc inc) {
        this.inc = inc;
    }

    @Override
    public void run() {
        inc.inc();
    }
}

class Inc {
    static int a = 0;
    Lock lock = new ReentrantLock();

    void inc() {
//        lock.lock();
        try {
            Thread.sleep(1000);
            a++;
            System.out.println("a:" + a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
//            lock.unlock();
        }
    }
}

//class ThreadTest1220 implements Callable {
//
//    int num;
//
//    public ThreadTest1220(int num) {
//        this.num = num;
//    }
//
//    @Override
//    public Object call() throws Exception {
//        Thread.sleep((long) Math.random());
//        System.out.println("i:"+num);
//        return null;
//    }
//}