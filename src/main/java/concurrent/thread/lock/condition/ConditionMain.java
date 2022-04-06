package concurrent.thread.lock.condition;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-31 下午5:24
 **/
public class ConditionMain {
    public static void main(String[] args) {
//        Thread concurrent.thread = new Thread(new MyThread2());
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread2.getSignal();
    }
}
