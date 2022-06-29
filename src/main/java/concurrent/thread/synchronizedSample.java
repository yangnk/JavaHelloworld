package concurrent.thread;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-11 下午4:01
 **/
public class synchronizedSample implements Runnable{

    int number = 10;

    public void firstMethod() throws Exception {
        synchronized (this) {
            number += 100;
            System.out.println(number);
        }
    }

    public void secondMethod() throws Exception {
        synchronized (this) {
            /**
             * (休息2S,阻塞线程)
             * 以验证当前线程对象的机锁被占用时,
             * 是否被可以访问其他同步代码块
             */
            Thread.sleep(2000);
            number *= 200;
        }
    }

    @Override
    public void run() {
        try {
            firstMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        synchronizedSample threadTest = new synchronizedSample();
        Thread thread = new Thread(threadTest);
        thread.start();
        threadTest.secondMethod();
    }
}

