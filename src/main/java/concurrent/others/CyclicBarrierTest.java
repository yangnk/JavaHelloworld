package concurrent.others;

import java.io.Writer;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-16 15:42
 **/
public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        System.out.println("cyclicbarrier test start.");
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            new Writer(cyclicBarrier).start();
        }
    }
    static class Writer extends Thread{
        private CyclicBarrier cyclicBarrier;
        public Writer(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
//            super.run();
            try {
                System.out.println(Thread.currentThread().getName()+"  start.");
                Thread.sleep(3000);
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName()+"  end.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("cyclicbarrier test end.");
        }

    }
}
