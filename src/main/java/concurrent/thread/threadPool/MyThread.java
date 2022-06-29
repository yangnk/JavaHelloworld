package concurrent.thread.threadPool;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-11 下午9:38
 **/
public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.printf("%s is print...\n", Thread.currentThread().getName());
    }
}
