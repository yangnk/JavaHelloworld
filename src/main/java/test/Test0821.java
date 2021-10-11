package test;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-08-21 下午5:20
 **/
public class Test0821 {
    public static void main(String[] args) {
        while (true) {
            System.out.println(System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
