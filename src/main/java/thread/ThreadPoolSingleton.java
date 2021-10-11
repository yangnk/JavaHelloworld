package thread;

import sun.nio.ch.ThreadPool;

import java.util.concurrent.*;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-06-02 下午9:29
 **/
public class ThreadPoolSingleton {
    private ExecutorService executorService = null;
    private final int availableProcessors = Runtime.getRuntime().availableProcessors();
    private ThreadPoolSingleton() {
        int coreSize = availableProcessors / 2;
        int maxSize =  (availableProcessors * 2 + 1) * 2 ;
        if (executorService == null) {
            executorService = new ThreadPoolExecutor(coreSize > 2 ? coreSize : 2, maxSize, 60L,
                    TimeUnit.SECONDS, new SynchronousQueue<>());
        }
    }

    private static ThreadPoolSingleton threadPoolSingleton = null;
    public static ThreadPoolSingleton getInstance() {
        if (getInstance() == null) {
            return new ThreadPoolSingleton();
        }
        return threadPoolSingleton;
    }

    public void executeTask(Runnable runnable) {
        executorService.submit(runnable);
    }

    public Future<?> submit(Runnable runnable) {
        return executorService.submit(runnable);
    }
}
