package io.bio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.UUID;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-06-15 下午9:30
 **/
public class BIOClient {
    Socket socket = null;

    public BIOClient() {
        try {
            socket = new Socket("localhost", 8080);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sender() {
        OutputStream outputStream = null;
        try {
            outputStream = socket.getOutputStream();
            UUID uuid = UUID.randomUUID();
            outputStream.write(uuid.toString().getBytes());
            System.out.println("uuid:" + uuid.toString());
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new BIOClient().sender();
    }
}
