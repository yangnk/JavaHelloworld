package concurrent.ThreadLocalDemo;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 上午9:29
 **/
public class ThreadLocalMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        Thread thread1 = new Thread(new MyThread());
        thread.start();
        thread1.start();
    }
}
