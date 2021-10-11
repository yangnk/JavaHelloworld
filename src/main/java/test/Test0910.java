package test;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2021-09-10 22:05
 **/
public class Test0910 {
    public static void main(String[] args) {
//        String a = "1000-vpwsName-2182";
//        int i = a.indexOf("-vpwsName");
//        String b = a.substring(0, i);
//        System.out.println(b);
        String aaaa = "123456789012345";
        int maxLen = aaaa.length() <= 10 ? aaaa.length() : 10;
        System.out.println(aaaa.substring(0, maxLen));
    }
}
