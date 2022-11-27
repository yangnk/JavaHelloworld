package concurrent.threadLocalDemo;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-17 上午9:25
 **/
public class MyThread implements Runnable {
    MyThreadLocal myThreadLocal = null;

    @Override
    public void run() {
        myThreadLocal = new MyThreadLocal();
        if (myThreadLocal == null) {
            myThreadLocal.set("第一次塞值？？");
        }
        for (int i = 0; i < 10; i++) {
            myThreadLocal.set("this " + Thread.currentThread().getName() + " is " + i);
            String s = (String) myThreadLocal.get();
            System.out.println(s);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
