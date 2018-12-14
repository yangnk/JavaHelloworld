package nio.singleThreadServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import org.apache.commons.lang3.StringUtils;
/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-13 下午6:53
 **/
public class EchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            while (true) {
                Socket socket = serverSocket.accept();//监听
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
                String inputString = bufferedReader.readLine();
                while (StringUtils.isNotBlank(inputString)) {
                    System.out.println(inputString);
                    inputString = bufferedReader.readLine();
                }
                String html = "http/1.1 200 ok\n" + "server is testing....\n";
                printWriter.println(html);
                printWriter.flush();
                printWriter.close();
            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port 8888" + " or listening for a connection");
            e.printStackTrace();
        }
    }
}