package thread;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-11 上午11:52
 **/
public class ThreadDemo2 implements Runnable{
    String name = "";
    public ThreadDemo2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("******" + name + ": "+ i +"*******");
        }
    }
}
