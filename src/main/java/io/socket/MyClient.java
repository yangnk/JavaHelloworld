package io.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2022-03-19 11:05
 **/
public class MyClient {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            Socket client = new Socket(inetAddress, 8000);
            OutputStream outputStream = client.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("hello from client." + client.getInetAddress());

            InputStream inputStream = client.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println(dataInputStream.readUTF());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
