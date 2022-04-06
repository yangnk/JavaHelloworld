package concurrent.thread;

/**
 * ${单生产者单消费者}
 *
 * @author yangningkai
 * @create 2019-01-31 上午11:46
 **/

import java.util.ArrayList;
public class SimplePAndC {

    private static final Object lock = new Object();
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ProductThread1());
        Thread thread2 = new Thread(new ConsumerThread1());
        thread1.start();
        thread2.start();
    }

    private static class ProductThread1 implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (Res.list.size() != 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    Res.list.add("product...");
                    System.out.println("生产一个元素");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.notify();
                }
            }
        }
    }

    private static class ConsumerThread1 implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    if (Res.list.size() == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    Res.list.remove(0);
                    System.out.println("消费一个元素");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.notify();
                }
            }
        }
    }

    private static class Res{
        static ArrayList<String> list = new ArrayList<>();
    }
}
