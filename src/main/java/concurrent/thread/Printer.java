package concurrent.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer{
    volatile static int count = 10;
    volatile static int state = 0;
    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();
        Condition condition3 = lock.newCondition();

        Thread a = new Thread(new PrinterThread(0, "A", condition1, condition2));
        Thread a1 = new Thread(new PrinterThread(1, "B", condition2, condition3));
        Thread a2 = new Thread(new PrinterThread(2, "C", condition3, condition1));
        a.start();
        a1.start();
        a2.start();
    }

    static class PrinterThread implements Runnable {
        private int targetState;
        private String str;
        Condition cur;
        Condition next;

        public PrinterThread(int targetState, String str, Condition cur, Condition next) {
            this.targetState = targetState;
            this.str = str;
            this.cur = cur;
            this.next = next;
        }

        @Override
        public void run() {
            for (int i = 0; i < count; i++) {
                lock.lock();
                while (state % 3 != targetState) {
                    try {
                        cur.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(str);
                state++;
                try {
                    next.signal();
                }finally {
                    lock.unlock();
                }
            }
        }
    }
}
