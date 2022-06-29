package io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ${BIO server}
 *
 * @author yangningkai
 * @create 2019-06-15 下午9:17
 **/
public class BIOServer {
    ServerSocket serverSocket = null;

    public BIOServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("BIO server已经开启，端口为：" + port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listner() {
        while (true) {
            try {
                byte[] bytes = new byte[1024];
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                int len = inputStream.read(bytes);
                if (len > 0) {
                    String str = new String(bytes, 0, len);
                    System.out.printf("读取：" + str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new BIOServer(8080).listner();
    }
}
