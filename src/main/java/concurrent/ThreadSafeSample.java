package concurrent;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-04-29 21:59
 **/
public class ThreadSafeSample {
    int state = 0;

    public void noSafeAction() {
        synchronized (this) {
            while (state <= 100000) {
                int former = state++;
                int later = state;
                if (later - 1 != former) {
                    System.out.println("former is: " + former + " later is: " + later);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafeSample threadSafeSample = new ThreadSafeSample();
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                threadSafeSample.noSafeAction();
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                threadSafeSample.noSafeAction();
            }
        };
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

}
