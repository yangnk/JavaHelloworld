package thread;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-12 下午11:06
 **/
public class ThreadPrintDemo extends Thread {
    public static void main(String[] args) {
        Thread thread = new ThreadPrintDemo();
        Thread thread1 = new ThreadPrintDemo();
        thread.start();
        thread1.start();

    }

    @Override
    public void run() {
        PrintNum printNum = new PrintNum();
        for (int i = 0; i < 10; i++) {
            printNum.printNum1();
        }
    }

    public class PrintNum {
        int a = 0;

        void  printNum1() {
            a++;
            System.out.println(a);
        }
    }
}
