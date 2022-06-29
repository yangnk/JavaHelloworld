package concurrent.thread;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-18 23:15
 **/
public class SynchronizedTest {
    public static void main(String[] args) {
        synchronized (SynchronizedTest.class) {
            m();

        }

    }

    public static synchronized void m() {

    }
}
