package io.NIODemo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-12-14 下午3:32
 **/
public class NIODemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("/Users/yangnk/IdeaProjects/JavaHelloworld/src/main/java/io/NIODemo/test.txt", "rw");
        //创建channel
        FileChannel inChannel = aFile.getChannel();
        //创建buffer
        ByteBuffer buf = ByteBuffer.allocate(48);
        int bytesRead = inChannel.read(buf);
        while (bytesRead != -1) {
            System.out.println("Read " + bytesRead);
            buf.flip();

            while(buf.hasRemaining()){
                System.out.print((char) buf.get());
            }

            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }
}
