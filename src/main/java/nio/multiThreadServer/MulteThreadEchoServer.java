package nio.multiThreadServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-13 下午10:28
 **/
public class MulteThreadEchoServer {
    public static void main(String[] args) {
        Socket clientSocket = null;
        try (ServerSocket serverSocket = new ServerSocket(8888)) {
            while (true) {
                clientSocket = serverSocket.accept();
                //多线程处理
                new Thread(new EchoServerHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
