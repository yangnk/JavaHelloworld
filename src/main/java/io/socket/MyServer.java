package io.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-03-19 10:56
 **/
public class MyServer implements Runnable {
    ServerSocket serverSocket;

    public MyServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Socket server = serverSocket.accept();
                DataInputStream inputStream = new DataInputStream(server.getInputStream());
                System.out.println(inputStream.readUTF());

                DataOutputStream outputStream = new DataOutputStream(server.getOutputStream());
                outputStream.writeUTF("hello from server:" + server.getInetAddress());
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        MyServer myServer = new MyServer(8000);
        myServer.run();
    }
}
