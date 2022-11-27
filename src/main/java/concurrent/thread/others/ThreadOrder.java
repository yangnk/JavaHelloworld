package concurrent.thread.others;

public class ThreadOrder {

    public static void main(String[] args) {
        Thread worker1 = new Thread(new Worker(null), "thread1");
        Thread worker2 = new Thread(new Worker(worker1), "thread2");
        Thread worker3 = new Thread(new Worker(worker2), "thread3");
        worker1.start();
        worker2.start();
        worker3.start();
    }
}

class Worker extends Thread {
    Thread beforeWorker;

    public Worker(Thread beforeWorker) {
        this.beforeWorker = beforeWorker;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        if (beforeWorker != null) {
            try {
                beforeWorker.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
