package test;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-09-01 13:49
 **/
public class Test0901 {
    public static void main(String[] args) {
        String a = "1234_vpws_ynk";
        int b = a.indexOf("_");
        System.out.println(a.substring(0, b));
    }
}
