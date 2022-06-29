package concurrent.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-18 22:42
 **/
public class MultiThreadTest {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(true, true);
        for (ThreadInfo threadInfo: threadInfos) {
            System.out.println(threadInfo.getThreadId() + " , " + threadInfo.getThreadName());

        }
    }
}
