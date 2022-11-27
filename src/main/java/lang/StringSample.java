package lang;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-09 下午11:08
 **/
public class StringSample {
    public static void main(String[] args) {
        String s = "qweqwe";
        String s1 = "qweqwe";
        String s2 = new String("qweqwe");
//        System.out.println(s.hashCode());
//        System.out.println(s1.hashCode());
        System.out.println(s == s2);
        System.out.println(s.equals(s2));
    }
}
