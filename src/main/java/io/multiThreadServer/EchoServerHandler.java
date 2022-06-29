package io.multiThreadServer;

import java.io.*;
import java.net.Socket;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-13 下午10:46
 **/
public class EchoServerHandler implements Runnable{
    private Socket clientSocket;

    public EchoServerHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream(),true);){
            String inputString;
            while ((inputString = bufferedReader.readLine()) != null) {
                printWriter.write(inputString);
                System.out.println(inputString);
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port 8888" + " or listening for a connection");
            e.printStackTrace();
        }

    }
}
