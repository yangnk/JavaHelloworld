package concurrent.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-02-09 16:49
 **/
public class ExecutorServiceDemo0209 {
    static ExecutorService executorService = Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());

                }
            });
        }

    }
}
