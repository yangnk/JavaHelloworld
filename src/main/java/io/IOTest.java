package io;

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
        //控制台输入，打印出来
        InputStream is = new ByteArrayInputStream(bytes);
        int c1;
        while ((c1 = (is.read()))!= -1) {
            System.out.println("************");
            System.out.println(c1);
        }
    }
}
