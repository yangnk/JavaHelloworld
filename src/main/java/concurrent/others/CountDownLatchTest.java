package concurrent.others;

import java.util.concurrent.CountDownLatch;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-16 15:27
 **/
public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread() {
            @Override
            public void run() {
//     super.run();
                System.out.println(Thread.currentThread().getName() + "start.");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
                System.out.println(Thread.currentThread().getName() + "end.");
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
//     super.run();
                System.out.println(Thread.currentThread().getName() + "start.");
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
                System.out.println(Thread.currentThread().getName() + "end.");
            }
        }.start();
        System.out.println("countDownLatch test start.");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("countDownLatch test end.");
    }


}

