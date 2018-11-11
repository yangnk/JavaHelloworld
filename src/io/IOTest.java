package test;

import java.io.*;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-10 下午12:07
 **/
public class IOTest{
    public static void main(String[] args) throws IOException {
        int a = 2;
        int b = 9;
        int c = 100;
        //内存总输出到输出流中
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        os.write(a);
        os.write(b);
        os.write(c);
        os.flush();
        //打印输出流中的内容
        byte[] bytes = os.toByteArray();
//        for (int i = 0; i < bytes.length; i++) {
//            System.out.println("******第" + i + "个******");
//            System.out.println(bytes[i]);
//        }
        //控制台输入，打印出来
        InputStream is = new ByteArrayInputStream(bytes);
        int c1;
//        c1 = (char) is.read();
//        System.out.println(c1);
//        byte[] c1 = new byte[100];
        while ((c1 = (is.read()))!= -1) {
            System.out.println("************");
            System.out.println(c1);
        }
    }
}
