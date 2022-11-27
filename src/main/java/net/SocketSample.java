package net;/**
 * Created by yangningkai on 2019/3/9.
 */

import java.io.IOException;
import java.net.Socket;

/**
 * @Description:
 * @Author: yangningkai
 * @CreateDate: 2019/3/9 11:00
 * @Version:
 */
public class SocketSample {
    public static void main(String[] args) {
        final String host = "localhost";
        new SocketSample().scan(host);
    }

    //连接localhost
    public void scan(String host) {
        Socket socket = null;
        try {
            for (int i = 0; i < 1024; i++) {
                socket = new Socket(host, i);
                System.out.println(i + "端口打开");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
