package concurrent.threadLocalDemo.others;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ${为每个线程指定一个个threadId}
 *
 * @author yangningkai
 * @create 2022-06-06 11:52
 **/

public class ThreadId {
    private static final AtomicInteger nextId = new AtomicInteger(0);
    private static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return nextId.getAndIncrement();
        }
    };
}
