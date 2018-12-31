package myTest;

import java.io.*;
import java.nio.Buffer;
import java.nio.channels.SocketChannel;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-14 上午11:27
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        String s = new String();
        System.out.println("syn上面");
        synchronized (s) {
            System.out.println("syn第一行");
            try {
                s.wait();
                System.out.println("wait下一行");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
