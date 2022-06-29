package io.threadPoolServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-13 下午11:48
 **/
public class ThreadPoolEchoServer {
    public static void main(String[] args) {
        Socket socket = null;
        ExecutorService executorService = null;
        try (ServerSocket serverSocket = new ServerSocket(8888);) {
            executorService = Executors.newFixedThreadPool(5);
            while (true) {
                socket = serverSocket.accept();
                executorService.execute(new ServerHandler(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
