package test;

import java.util.concurrent.CountDownLatch;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-06-28 下午4:56
 **/
public class Test0628 {
    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(2);

        Thread thread1 = new Thread() {
            @Override
            public void run() {
//                super.run();
                try {
                    Thread.sleep(1000);
                    System.out.println("first thread run success.");
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
//                super.run();
                try {
                    Thread.sleep(1000);
                    System.out.println("second thread run success.");
                    countDownLatch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        thread1.start();
        thread2.start();
        countDownLatch.await();
        System.out.println("2 threads run success.");
    }

}
