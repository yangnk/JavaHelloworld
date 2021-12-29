package thread;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-18 22:54
 **/
public class ThreadStateTest {
    public static void main(String[] args) {
        new Thread(new TimeWaiting(), "timewaitingthread").start();
        new Thread(new Waiting(), "Waitingthread").start();

    }

    static class TimeWaiting implements Runnable {
        @Override
        public void run() {
            while (true) {
//                SleepUtil.second(10);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class Waiting implements Runnable {
        Object object = new Object();
        @Override
        public void run() {
            while (true){
                synchronized (object){
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
