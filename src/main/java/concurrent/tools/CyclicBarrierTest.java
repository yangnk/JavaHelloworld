package concurrent.tools;

import java.util.Date;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
        for (int i = 0; i < 5; i++) {
            String name = "Thread-" + i;
            new Thread(() -> {
                System.out.printf("before: name:%s, date:%s\n", name, new Date());
                try {
                    cyclicBarrier.await(2L, TimeUnit.SECONDS);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.printf("after: name:%s, date:%s\n", name, new Date());
            }).start();
        }
    }
}
