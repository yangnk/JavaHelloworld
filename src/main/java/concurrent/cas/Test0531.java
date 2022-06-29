package concurrent.cas;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-05-31 16:41
 **/
public class Test0531 {
    int i = 0;

    public synchronized int add() {
        return i++;
    }

    AtomicInteger j = new AtomicInteger();

    public int add1() {
        return j.addAndGet(1);
    }

}
