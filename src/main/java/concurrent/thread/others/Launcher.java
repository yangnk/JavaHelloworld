package concurrent.thread.others;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ${DESCRIPTION}
 **/
public class Launcher {
    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize = 5;
        new Producer(queue, maxSize, "producer-concurrent.thread").start();
        new Consumer1(queue, "consumer-concurrent.thread").start();
    }
}

/**
 * 消费者线程
 */
class Consumer1 extends Thread {

    private final Queue<Integer> queue;

    public Consumer1(Queue<Integer> queue, String threadName) {
        super(threadName);
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {  // 在条件判断之前给共享资源加锁
                while (queue.isEmpty()) {
                    try {
                        System.out.printf("消息队列为空: 消费者线程调用wait方法进入等待状态 ...");
                        System.out.println();
                        queue.wait();  // 在循环体中：使用共享对象来调用wait方法，释放共享资源的锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.printf("消费消息: %d", queue.remove());
                System.out.println();
                queue.notifyAll();     // 通知生产者线程，可以继续生产消息了
            }
        }
    }
}

/**
 * 生产者线程
 */
class Producer extends Thread {

    private final Queue<Integer> queue;
    private final int maxSize;
    private int messageCount = 1;

    public Producer(Queue<Integer> queue, int maxSize, String threadName) {
        super(threadName);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {  // 在条件判断之前给共享资源加锁
                while (queue.size() == maxSize) {
                    try {
                        System.out.printf("消息队列已满: 生产者线程调用wait方法进入等待状态 ...");
                        System.out.println();
                        queue.wait(); // 在循环体中：使用共享对象来调用wait方法，释放共享资源的锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    sleep(1000);  // 让生产者每1秒钟生产一条消息
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int messageId = messageCount++;
                System.out.printf("生产消息: %d", messageId);
                System.out.println();
                queue.add(messageId);  // 将消息写入队列
                queue.notifyAll();     // 通知消费者线程，对消息进行消费
            }
        }
    }
}
