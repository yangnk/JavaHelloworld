package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-11 下午9:37
 **/
public class ThreadPoolSample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i <= 10; i++) {
            executorService.execute(new MyThread());
        }
    }
}
