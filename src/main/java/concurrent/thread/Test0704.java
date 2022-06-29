package concurrent.thread;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.*;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-07-04 下午4:18
 **/
public class Test0704 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(new Test1(), 1000, TimeUnit.SECONDS);
        scheduledExecutorService.submit(new Test1());
    }
}


class Test1 implements Runnable {

    @Override
    public void run() {
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}
