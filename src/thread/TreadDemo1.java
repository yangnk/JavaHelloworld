package thread;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-11 上午11:25
 **/
public class TreadDemo1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*****"+ i +"******");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new TreadDemo1();
        Thread thread2 = new TreadDemo1();
        thread1.start();
        thread2.start();
    }
}
