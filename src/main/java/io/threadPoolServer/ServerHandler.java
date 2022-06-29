package io.threadPoolServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-13 下午11:52
 **/
public class ServerHandler implements Runnable {
    Socket socket = null;

    public ServerHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(),true)){
            String s = "";
            while ((s = input.readLine()) != null) {
                System.out.println(s);
                output.print(s);
            }
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
