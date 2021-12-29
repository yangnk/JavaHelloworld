package thread;

import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-11-18 23:00
 **/
public class SleepUtil {
    public static final void second(long seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

