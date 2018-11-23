package thread;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-11 上午11:54
 **/
public class ThreadDemo2Main {
    public static void main(String[] args) {
//        Runnable runnable1 = new ThreadDemo2("A");
//        Runnable runnable2 = new ThreadDemo2("B");
        System.out.println("test");
        Thread thread1 = new Thread(new ThreadDemo2("A"));
        Thread thread2 = new Thread(new ThreadDemo2("B"));
        thread1.start();
        thread2.start();
    }
}
